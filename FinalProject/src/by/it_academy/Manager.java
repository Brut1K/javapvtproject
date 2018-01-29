package by.it_academy;

import by.it_academy.entity.School;
import by.it_academy.io.Downloader;
import by.it_academy.io.ParseJson;
import by.it_academy.io.ParseXML;
import by.it_academy.utils.Infoclass;
import by.it_academy.utils.Searcher;

public class Manager {
    School school;
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
        Infoclass infoclass =new Infoclass();
        infoclass.info(school);
    }

    public void search(int choice, String attr ){
        Searcher searcher = new Searcher();
        Infoclass infoclass = new Infoclass();
        infoclass.info(searcher.searcher(choice,attr,school));
    }


}
