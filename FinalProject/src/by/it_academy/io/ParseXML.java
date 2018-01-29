package by.it_academy.io;

import by.it_academy.entity.Group;
import by.it_academy.entity.School;
import by.it_academy.entity.Student;
import by.it_academy.entity.Teacher;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ParseXML {

    public School parseXML(){

        //org.wc3.dom
        Document dom;
        try{
            //открываем xml файл
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse("school.xml");
            // объект, который мы будем заполнять данными
            School school = new School();

            //===========  парсинг xml  =========
            // получем главный и самый первый тэг
            Element schoolElement = dom.getDocumentElement();
            //получаем элемент по названию тэга name
            NodeList schoolNameNodeList = schoolElement.getElementsByTagName("schoolName");
            //так как в тэге может быть много других тэгов мы изначально получаем массив
            //так как мы знаем, что у нас нет содержимого в name берем 0 элемент
            Node schoolName = schoolNameNodeList.item(0);
            school.setSchoolName(schoolName.getTextContent());
            //получаем содержимое тэга name
            NodeList groupNodeList = schoolElement.getElementsByTagName("group");
            List<Group> groups = new ArrayList<>();
            for(int i = 0;i<groupNodeList.getLength();i++){
                Group group = new Group();
                Node nNode = groupNodeList.item(i);
                if (nNode.getNodeType() != nNode.ELEMENT_NODE){
                    continue;
                }
                Element element = (Element) nNode;
                String groupName = element.getElementsByTagName("groupName").item(0).getTextContent();
                String schedule = element.getElementsByTagName("schedule").item(0).getTextContent();
                Teacher teacher = new Teacher();
                NodeList teacherNode = element.getElementsByTagName("teacher").item(0).getChildNodes();
                String teacherName = ((Element) teacherNode).getElementsByTagName("name").item(0).getTextContent();
                String teacherSurName = ((Element) teacherNode).getElementsByTagName("surname").item(0).getTextContent();
                String teacherLastName = ((Element) teacherNode).getElementsByTagName("lastname").item(0).getTextContent();
                String teacherbDay = ((Element) teacherNode).getElementsByTagName("bDay").item(0).getTextContent();
                Date teacherbDaydate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.forLanguageTag("by"));
                try {
                    teacherbDaydate = sdf.parse(teacherbDay);
                } catch(ParseException e){
                    System.out.println("Формат неверный");
                }
                teacher.setName(teacherName);
                teacher.setSurname(teacherSurName);
                teacher.setLastname(teacherLastName);
                teacher.setbDay(teacherbDaydate);

                NodeList studentNodeList = ((Element) nNode).getElementsByTagName("students");
                Node studentsL = studentNodeList.item(0);
                NodeList studentsList = studentsL.getChildNodes();
                List<Student> students = new ArrayList<>();
                for(int stud = 0;stud<studentsList.getLength();stud++){
                    Student student = new Student();
                    Node node1 = studentsList.item(stud);
                    if (node1.getNodeType() != node1.ELEMENT_NODE){
                        continue;
                    }
                    Element element1 = (Element) node1;
                    String name = element1.getElementsByTagName("name").item(0).getTextContent();
                    String surName = element1.getElementsByTagName("surname").item(0).getTextContent();
                    String lastName = element1.getElementsByTagName("lastname").item(0).getTextContent();
                    String bDay = element1.getElementsByTagName("bDay").item(0).getTextContent();
                    Date bDaydate = new Date();
                    try {
                        bDaydate = sdf.parse(bDay);
                    } catch(ParseException e){
                        System.out.println("Формат неверный");
                    }
                    student.setName(name);
                    student.setSurname(surName);
                    student.setLastname(lastName);
                    student.setbDay(bDaydate);
                    students.add(student);
                }
                group.setGroupName(groupName);
                group.setSchedule(schedule);
                group.setTeacher(teacher);
                group.setStudents(students);
                groups.add(group);
            }
            school.setGroups(groups);
            return school;
        }  catch(Exception e){
            System.out.println("Невозможно открыть xml error = " + e.toString());
            return null;
        }
   }
}
