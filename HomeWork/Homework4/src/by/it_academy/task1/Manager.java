package by.it_academy.task1;

import java.util.Scanner;

public class Manager {
    private Pacient[] pacientArray = new Pacient[3];

    public void generateArray() {
        Manager manager = new Manager();
        for (int i = 0; i < pacientArray.length; i++) {
        pacientArray[i] = new Pacient();
        manager.addPatient(pacientArray[i]);
        }
    }

    public void addPatient(Pacient pacient){
        Scanner scanner = new Scanner(System.in);
        String clear;
        System.out.println("Введите ФИО пациента");
        pacient.setName(scanner.nextLine());
        System.out.println("Введите возраст пациента");
        pacient.setAge(scanner.nextInt());
        //очищаем строку после ввода числовых типов данных
        clear = scanner.nextLine();
        System.out.println("Введите диагноз пациента");
        pacient.setDiagnoz(scanner.nextLine());
        System.out.println("Является ли болезнь хронической(да/нет)");
        String rep;
        do {
            rep = scanner.next();
            if (rep.equals("да")) {
                pacient.setRep(true);
            } else if (rep.equals("нет")) {
                pacient.setRep(false);
            } else {
                System.out.println("Введите \"да\", либо \"нет\"");
            }
        } while (!(rep.equals("да")||rep.equals("нет")));
        System.out.println("Введите номер палаты");
        pacient.setRoom(scanner.nextInt());
        System.out.println("Данные о пациенте успешно внесены");
        //очищаем строку после ввода числовых типов данных
        clear = scanner.nextLine();
    }



    /**
     *
     * @return возвращает массив пациентов
     */
    public Pacient[] getPatientList(){
        return pacientArray;
    }






    /**
     *
     * @param name
     * @return пациентов с заданным именем
     */
    public Pacient[] searchByName(String name){
        //поиск по имени
        Pacient[] search = new Pacient[pacientArray.length];
        int i = 0;
        for(Pacient pacient : pacientArray){
            if(pacient.getName().toLowerCase()
                    .contains(name.toLowerCase())){
                search[i] = pacient;
                i++;
            }
        }

        Pacient[] searchFinal = new Pacient[i];
        System.arraycopy(search,0,searchFinal,0,i);
        return searchFinal;

    }

    /**
     *
     * @param age
     * @return пациентов с заданным возрастом
     */
    public Pacient[] searchByAge(int age){
        //поиск по возрасту
        Pacient[] search = new Pacient[pacientArray.length];
        int i = 0;
        for(Pacient pacient : pacientArray){
            if(pacient.getAge()==age){
                search[i] = pacient;
                i++;
            }
        }

        Pacient[] searchFinal = new Pacient[i];
        System.arraycopy(search,0,searchFinal,0,i);
        return searchFinal;
    }

}
