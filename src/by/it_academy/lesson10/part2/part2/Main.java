package by.it_academy.lesson10.part2.part2;

import java.util.*;

public class Main {

    //ArrayList
    public static void main(String[] args) {

        // Коллекции это классы,
        // которые помогают нам работать с наборами каких-либо объектов
/*
        LinkedList<String> array = new LinkedList<>();




        array.add("1");
        array.add("22");
        array.add("333");
        array.add("4444");

        System.out.println("Размер листа " + array.size());

        array.add("%5??");
        System.out.println("Размер листа " + array.size());
        for(int i = 0;i<array.size();i++){
            System.out.println("Элемент листа с индексом "+ i +": "+array.get(i));
        }

        array.remove(2);

        for(int i = 0;i<array.size();i++){
            System.out.println("Элемент листа с индексом "+ i +": "+array.get(i));
        }

        array.add(2,"333");

        for(int i = 0;i<array.size();i++){
            System.out.println("Элемент листа с индексом "+ i +": "+array.get(i));
        }

        array.set(4,"zamena");
        for(int i = 0;i<array.size();i++){
            System.out.println("Элемент листа с индексом "+ i +": "+array.get(i));
        }

        Set<Student> testSet = new HashSet<>();
        testSet.add(new Student());
        testSet.add(new Student());
        testSet.add(new Student());*/

        Map<String,String> textMap = new HashMap<>();

        textMap.put("ru","Value");
        textMap.put("by","Value2");
        textMap.put("en","Value3");
        textMap.put("fr","Value4");

        System.out.println("value: "+textMap.get("ru"));


        }



    }

