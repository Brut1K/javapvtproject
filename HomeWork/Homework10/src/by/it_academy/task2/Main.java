package by.it_academy.task2;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People[] men = new People[5];
        People[] women = new People[5];
        men[0] = new People("Алексей","Бруцкий");
        men[1] = new People("Евгений","Василевич");
        men[2] = new People("Дмитрий","Головин");
        men[3] = new People("Марк","Демидович");
        men[4] = new People("Дмитрий","Кисель");
        women[0] = new People("Наталья","Лемешевская");
        women[1] = new People("Алена","Мядель");
        women[2] = new People("Анна","Поддубная");
        women[3] = new People("Екатерина","Рункевич");
        women[4] = new People("Дарья","Трацевская");

        HashMap<String,People[]> hashMap = new HashMap<>();
        hashMap.put("man",men);
        hashMap.put("woman",women);
        int command;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Введите 1 для выбора мужского ФИО\n" +
                    "Введите 2 для выбора женского ФИО\n" +
                    "Введите 3 для завершения работы");
            command = scanner.nextInt();
            switch (command){
                case 1:{
                    People[] a = hashMap.get("man");
                    int number = (int)(Math.random()*4.99);
                    System.out.println("Имя = " + a[number].getName()+
                            ", фамилия = " + a[number].getSurname());
                    break;
                }
                case 2:{
                    People[] a = hashMap.get("woman");
                    int number = (int)(Math.random()*4.99);
                    System.out.println("Имя = " + a[number].getName()+
                    ", фамилия = " + a[number].getSurname());
                    break;
                }
                case 3:{
                    System.out.println("Работа программы завершена");
                    break;
                }
                default:{
                    System.out.println("Вы ввели некорректное значение");
                    break;
                }
            }
        }while(command!=3);
    }
}
