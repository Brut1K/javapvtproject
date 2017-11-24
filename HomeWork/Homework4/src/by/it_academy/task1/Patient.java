package by.it_academy.task1;



import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private String diagnoz;
    private boolean rep;
    private int room;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public boolean getRep() {
        return rep;
    }

    public void setRep(boolean rep) {
        this.rep = rep;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void addPatient(){
            Scanner scanner = new Scanner(System.in);
            String clear;
            System.out.println("Введите ФИО пациента");
            this.setName(scanner.nextLine());
           //проверка System.out.println(this.getName());
            System.out.println("Введите возраст пациента");
            this.setAge(scanner.nextInt());
            //проверка System.out.println(this.getAge());
        //очищаем строку после ввода числовых типов данных
            clear = scanner.nextLine();
            System.out.println("Введите диагноз пациента");
            this.setDiagnoz(scanner.nextLine());
            //проверка System.out.println(this.getDiagnoz());
            System.out.println("Является ли болезнь хронической(да/нет)");
            String rep;
            do {
                rep = scanner.next();
                if (rep.equals("да")) {
                    this.setRep(true);
                } else if (rep.equals("нет")) {
                    this.setRep(false);
                } else {
                    System.out.println("Введите \"да\", либо \"нет\"");
                }
            } while (!(rep.equals("да")||rep.equals("нет")));
            System.out.println("Введите номер палаты");
            this.setRoom(scanner.nextInt());
            System.out.println("Данные о пациенте успешно внесены");
        //очищаем строку после ввода числовых типов данных
            clear = scanner.nextLine();
    }

    public void infoPatient(){
        System.out.println("Пациент: " + this.getName());
        System.out.println("Возраст пациента: " + this.getAge());
        System.out.println("Диагноз: " + this.getDiagnoz());
        System.out.println("Номер палаты: " + this.getRoom());
        String a;
        if(this.getRep()){
            a = "хроническое заболевание";
        } else {
            a = "хе хроническое заболевание";
        }
        System.out.println("Тип заболевания: " + a);
        System.out.println();
    }

    public void searchPatient(){
        System.out.println("Введите 1 для поиска пациента по имени или фамилии," +
                " либо 2 для поиска пациента по возрасту");
        Scanner scanner = new Scanner(System.in);
        int check;
        do {
            check = scanner.nextInt();
            if(check==1){
                //поиск по фамилии
            } else if (check==2){
                //по возрасту
            } else {
                System.out.println("Введите 1 для поиска пациента по имени или фамилии," +
                        "либо 2 для поиска пациента по возрасту");
            }
        } while (check!=1||check!=2);
    }

    public void searchName(String s){
        System.out.println("Введите имя или фамилию");
    }
}
