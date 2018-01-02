package by.it_academy;

import by.it_academy.Entity.People;
import by.it_academy.Entity.Root;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class UserHandler extends DefaultHandler {
    Root root = new Root();
    People people;
    boolean bAge = false;
    boolean bId = false;
    boolean bName = false;
    boolean bSurname = false;
    boolean bIsDegree = false;

    public Root getRoot(){
        return root;
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("element")){
            people = new People();
        } else if (qName.equals("name")){
            bName =true;
        } else if (qName.equals("surname")){
            bSurname =true;
        }else if (qName.equals("id")){
            bId =true;
        }else if (qName.equals("isDegree")){
            bIsDegree =true;
        }else if (qName.equals("age")){
            bAge =true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("element")){
            List<People> peoples = new ArrayList<>();
            peoples = root.getPeopleList();
            peoples.add(people);
            root.setPeopleList(peoples);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(bAge){
            people.setAge(new Integer( new String(ch,start,length)));
            bAge = false;
        } else if(bIsDegree){
            people.setDegree(new Boolean(new String(ch,start,length)));
            bIsDegree = false;
        } else if(bId){
            people.setId(new Integer(new String(ch,start,length)));
            bId = false;
        }else if(bName){
            if(root.getName()==null) {
                root.setName(new String(ch, start, length));
            }
            else {
                people.setName(new String(ch,start,length));
            }
            bName = false;
        }else if(bSurname){
            people.setSurname(new String(ch,start,length));
            bSurname = false;
        }
    }
}

