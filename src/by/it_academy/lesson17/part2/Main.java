package by.it_academy.lesson17.part2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static List<File> files = new ArrayList<>();

    public static void directory(File file) {
        if (file.isDirectory()) {
            File[] arrFiles = file.listFiles();
            for (File a : arrFiles) {
                if (a.isFile()) {
                    String p = "([\\wА-яа-я]{0,})(.java$)";
                    Pattern pattern = Pattern.compile(p);
                    Matcher m = pattern.matcher(a.getName());
                    if (m.matches()) {
                        System.out.println(a.getAbsolutePath());
                        files.add(a);
                    }
                } else if (a.isDirectory()) {
                    directory(a);
                }
            }
        }

    }

    public static void ParseXML(List<File> files){
        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element rootElement = doc.createElement("root");
            doc.appendChild(rootElement);
            for(File f:files) {
                Element file = doc.createElement("file");
                rootElement.appendChild(file);
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(f.getName()));
                file.appendChild(name);
                Element path = doc.createElement("path");
                path.appendChild(doc.createTextNode(f.getAbsolutePath()));
                file.appendChild(path);
                Element size = doc.createElement("size");
                Long l = f.length();
                String s = l.toString();
                size.appendChild(doc.createTextNode(s));
                file.appendChild(size);
                Element datetime = doc.createElement("datetime");
                Path pathfile = Paths.get(f.getAbsolutePath());
                BasicFileAttributes attr = null;
                try{
                    attr = Files.readAttributes(pathfile,BasicFileAttributes.class);
                    String creationTime = attr.creationTime().toString();
                    StringBuilder sb= new StringBuilder();
                    sb.append(creationTime.substring(0,10));
                    sb.append(" ");
                    sb.append(creationTime.substring(11,19));
                    creationTime = sb.toString();
                    datetime.appendChild(doc.createTextNode(creationTime));
                } catch (IOException e){
                    e.printStackTrace();
                }
                file.appendChild(datetime);
            }

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("result.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {

        String path = "D:\\javapvt\\javapvtproject";
        File file = new File(path);
        directory(file);
        ParseXML(files);



    }

}


