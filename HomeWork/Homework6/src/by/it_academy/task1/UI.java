package by.it_academy.task1;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во купюр, находящихся в банкомате" +
                " номиналом 20, 50 и 100 рублей соответственно");
        AtmBSB atm = new AtmBSB(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        atm.setBank("BelSwissBank");
        atm.setNumberID("123-111-611");
        int command;

        do {
            System.out.println("Выберите 1, чтобы внести деньги\n" +
                    "Выберите 2, чтобы снять деньги\n" +
                    "Выберите 3, чтобы посмотреть какие купюры остались в банкомате\n" +
                    "Выберите 4, чтобы посмотреть название банка\n" +
                    "Выберите 5, чтобы посмотреть ID банкомата\n" +
                    "Выберите 6, чтобы закончить работу");
            command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите сумму которую вы хотите внести");
                    atm.deposit(atm, scanner.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Введите сумму, которую вы хотите снять");
                    atm.withdrawal(atm, scanner.nextInt());
                    break;
                }
                case 3: {
                    atm.info(atm);
                    break;
                }
                case 4: {
                    System.out.println(atm.infobank(atm));
                    break;
                }
                case 5: {
                    System.out.println(atm.infoatmID(atm));
                    break;
                }
                case 6: {
                    System.out.println("Работа завершена");
                    break;
                }
                default: {
                    System.out.printf("Вы ввели некорректные данные");
                    break;
                }
            }
        } while (command != 6);
    }
}
