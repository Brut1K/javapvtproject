package by.it_academy.task2;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во купюр, находящихся в банкомате" +
                " номиналом 20, 50 и 100 рублей соответственно");
        Atm atm = new Atm();
        atm = manager.setAtm(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int command;

        do {
            System.out.println("Выберите 1, чтобы внести деньги\n" +
                    "Выберите 2, чтобы снять деньги\n" +
                    "Выберите 3, чтобы посмотреть какие купюры остались в банкомате\n" +
                    "Выберите 4, чтобы закончить работу");
            command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите сумму которую вы хотите внести");
                    manager.deposit(atm, scanner.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Введите сумму, которую вы хотите снять");
                    manager.withdrawal(atm, scanner.nextInt());
                    break;
                }
                case 3: {
                    manager.info(atm);
                    break;
                }
                case 4: {
                    System.out.println("Работа завершена");
                    break;
                }
                default: {
                    System.out.printf("Вы ввели некорректные данные");
                    break;
                }
            }
        } while (command != 4);
    }
}
