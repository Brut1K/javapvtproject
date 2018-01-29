package by.it_academy;

import by.it_academy.entity.School;
import by.it_academy.io.Downloader;
import by.it_academy.io.ParseJson;
import by.it_academy.io.ParseXML;
import by.it_academy.utils.Searcher;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {

    private static Manager manager;

    public static Manager getInstance() {
        if(manager==null){
            manager = new Manager();
        }
        return manager;
    }

    School school;
    private UI ui;

    public void setUi(UI ui){
        this.ui = ui;
    }

    public void createSchoolFromWeb(String format){
        Downloader dl = new Downloader();
        dl.download(format);
        if(format.equals("xml")){
            ParseXML parseXML = new ParseXML();
            school = parseXML.parseXML();
        } else{
            ParseJson parseJson = new ParseJson();
            school = parseJson.parseJson();
        }
        ui.info(school);
    }

    public void search(int choice, String attr ){
        Searcher searcher = new Searcher();
        ui.info(searcher.searcher(choice,attr,school));
    }





    public boolean inputchecker(String s){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public void schedule(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<school.getGroups().size();i++){
            sb.append(school.getGroups().get(i).getGroupName());
            sb.append(": ");
            sb.append(school.getGroups().get(i).getSchedule());
            sb.append("\n");
        }
        ui.print(sb.toString());
    }

    public void birthdays(){
        GregorianCalendar gc = new GregorianCalendar();
        GregorianCalendar gcStudent = new GregorianCalendar();
        for(int i = 0;i<school.getGroups().size();i++){
            for(int j = 0;j<school.getGroups().get(i).getStudents().size();j++){
                gcStudent.setTime(school.getGroups().get(i).getStudents().get(j).getbDay());
                if(((gcStudent.get(GregorianCalendar.MONTH)-gc.get(GregorianCalendar.MONTH)<=1)&&
                        (gcStudent.get(GregorianCalendar.MONTH)>=gc.get(GregorianCalendar.MONTH)))||
                        (gc.get(GregorianCalendar.MONTH)==12&&gcStudent.get(GregorianCalendar.MONTH)==1)){
                   ui.info(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }



    }




}
