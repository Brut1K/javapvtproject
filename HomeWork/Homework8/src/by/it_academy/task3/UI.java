package by.it_academy.task3;



public class UI {
    public static void main(String[] args) {
       Manager manager = new Manager();
        Student[] arr = manager.loadData();
        if(arr.length>0){
            manager.averageAge(arr);
        } else{
            Student[] arr2 = new Student[3];
            manager.generateArray(arr);
            manager.averageAge(arr);
        }

        manager.saveData(arr);


    }
}
