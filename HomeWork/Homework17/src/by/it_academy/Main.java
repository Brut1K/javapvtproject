package by.it_academy;

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
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Map<String,List<File>> map = new HashMap<>();

    public static void directory(File file) {
        if (file.isDirectory()) {
            File[] arrFiles = file.listFiles();
            for (File a : arrFiles) {
                if (a.isFile()) {
                    String stringPattern = "([\\wА-яа-я]{0,})(.{1}\\w+$)";
                    Pattern pattern = Pattern.compile(stringPattern);
                    Matcher m = pattern.matcher(a.getName());
                    if (m.matches()) {
                        List<File> files = new ArrayList<>();
                        if(map.containsKey(m.group(2))){
                            files = map.get(m.group(2));
                            files.add(a);
                            map.replace(m.group(2),map.get(m.group(2)),files);
                        } else{
                            files.add(a);
                            map.put(m.group(2),files);
                        }
                    }
                } else if (a.isDirectory()) {
                    directory(a);
                }
            }
        }

    }



    public static void main(String[] args) {
        String path = "D:\\Внешний диск";
        File file = new File(path);
        directory(file);
        parseXML();
    }
  /*      for(String s:args){
            File file = new File(s);
            directory(file);
        }
      //  parseXML();
    }*/

    public static void parseXML(){
        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element rootElement = doc.createElement("files");
            doc.appendChild(rootElement);
            Set<String> keyset = map.keySet();
            String[] keys = keyset.toArray(new String[0]);
            for(int i = 0;i<keys.length;i++){
            String name = "ext name = \""+keys[i]+"\"  "+map.get(keys[i]).size()+" шт";
            Element element = doc.createElement("name");
            element.appendChild(doc.createTextNode(name));
            rootElement.appendChild(element);
            for(int j = 0;j<map.get(keys[i]).size();j++){
                Element fileElement = doc.createElement("file");
                fileElement.appendChild(doc.createTextNode((map.get(keys[i]).get(j)).getName()));
                element.appendChild(fileElement);
            }
            }



            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\javapvt\\javapvtproject\\Homework\\Homework17\\src\\by\\it_academy\\result_task2.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
