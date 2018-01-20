package by.it_academy.lesson19.task1;


public class Main {

    public static void main(String[] args) {
//тип хранимых данных определяется в момент создания переменной
     MyCollection<Long,String> myCollection = new MyCollection();
     myCollection.setValue(878L);
     myCollection.setSecondValue("878L");

     MyCollectionssss<Integer,String> collect = new MyCollectionssss();
     collect.setDirector("Директор");
     System.out.println(collect.getDirector());

     collect.addDepartment(42);
     collect.addStaff("Сотрудник 1",42);
     collect.addStaff("Сотрудник 2",42);
     System.out.println(collect.toString());



    }
}
