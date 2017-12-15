package by.it_academy.lesson11.part1;

import by.it_academy.lesson11.part1.Entity.People;
import by.it_academy.lesson11.part1.Entity.Root;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Main {

    private static final String LINK = "http://kiparo.ru/t/test.xml";

    public static void main(String[] args) {

        InputStream inputStream = null;

        FileOutputStream fileOutputStream = null;
        try{
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK){
                inputStream = httpURLConnection.getInputStream();


                File file = new File("test.xml");
                fileOutputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[4096];
                while((byteRead = inputStream.read(buffer))!=-1){
                    fileOutputStream.write(buffer, 0,byteRead);
                }

                parseXML();


            } else {
                System.out.println("Данные не найдены, response code = "
                        +responseCode);
            }

        } catch(Exception e){
            System.out.println("Невозможно скачать файл");
        }
        finally {
            if(inputStream!=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть inputStream");
                }
            if(fileOutputStream!=null)
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть fileOutputStream");
                }
        }


    }

    public static void parseXML(){
        //org.wc3.dom
        Document dom;
        try{
            //открываем xml файл
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse("test.xml");




        }  catch(Exception e){
            System.out.println("Невозможно открыть xml error = " + e.toString());
            return;
        }

        // объект, который мы будем заполнять данными
        Root root = new Root();

        //===========  парсинг xml  =========
        // получем главный и самый первый тэг
        Element rootElement = dom.getDocumentElement();
        System.out.println("Root tag name = " + rootElement.getTagName());
        //получаем элемент по названию тэга name
        NodeList nameNodeList = rootElement.getElementsByTagName("name");
        //так как в тэге может быть много других тэгов мы изначально получаем массив
        //так как мы знаем, что у нас нет содержимого в name берем 0 элемент
        Node nameNode = nameNodeList.item(0);
        System.out.println("Name tag name = " + nameNode.getNodeName());
        //получаем содержимое тэга name
        System.out.println("Content tag name = " +nameNode.getTextContent());
        String namefile = nameNode.getTextContent();
        //заполняем наш root
        root.setName(namefile);
///============== парсим people ===============

        //получаем элемент по названию тэга people
        NodeList peopleList = rootElement.getElementsByTagName("people");
        Node peopleNode = peopleList.item(0);
        //получаем из тега people все содержимое, т.е. массив элементов  element
        //один элемент из elementNodeList это один тег element
        NodeList elementsNodeList = peopleNode.getChildNodes();
        List<People> peoples = new ArrayList<>();
        // обходим всех people, точнее элемент
        for(int i = 0;i<elementsNodeList.getLength();i++){
            Node node = elementsNodeList.item(i);
            if (node.getNodeType() != node.ELEMENT_NODE){
                continue;
            }
            Element element = (Element) node;

            //вытягиваем name
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String surName = element.getElementsByTagName("surname").item(0).getTextContent();
            String isDegreeString = element.getElementsByTagName("isDegree").item(0).getTextContent();
            boolean isDegree = Boolean.valueOf(isDegreeString);
            String idString = element.getElementsByTagName("id").item(0).getTextContent();
            int id = Integer.parseInt(idString);
            String ageString = element.getElementsByTagName("age").item(0).getTextContent();
            int age = Integer.parseInt(ageString);

            People people = new People();
            people.setName(name);
            people.setSurname(surName);
            people.setDegree(isDegree);
            people.setId(id);
            people.setAge(age);

            peoples.add(people);
        }

        root.setPeople(peoples);
        System.out.println(peoples.toString());
    }



}

