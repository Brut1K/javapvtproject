package by.it_academy.task1;

public abstract class Atm {
    private int num20;
    private int num50;
    private int num100;
    private String bank;
    private String numberID;
    private int temp20;
    private int temp50;
    private int temp100;
    private int temp;
    private int checker;

    public Atm(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }


    public int getNum20() {
        return num20;
    }

    public void setNum20(int num20) {
        this.num20 = num20;
    }

    public int getNum50() {
        return num50;
    }

    public void setNum50(int num50) {
        this.num50 = num50;
    }

    public int getNum100() {
        return num100;
    }

    public void setNum100(int num100) {
        this.num100 = num100;
    }

    /**
     * Метод для внесения денег, рассчитывает сколько каких купюр вносится и выводит сообщение об этом
     * @param atm текущий банкомат
     * @param a сумма депозита
     */
    public void deposit(Atm atm,int a){
        if (a>=20&&a%10==0&&a!=30){
            temp=a;
            temp100=temp/100;
            temp50=(temp%100)/50;
            temp20=(temp%50)/20;
            checker = temp-temp100*100-temp50*50-temp20*20;
            while (checker!=0){
                if(temp50>0){
                    temp50--;
                    temp20=temp20+(checker+50)/20;
                    checker = temp-temp100*100-temp50*50-temp20*20;
                } else {
                    temp100--;
                    temp50++;
                    temp20=(temp-temp100*100-temp50*50)/20;
                    checker = temp-temp100*100-temp50*50-temp20*20;
                }
            }
            atm.setNum20(atm.getNum20()+temp20);
            atm.setNum50(atm.getNum50()+temp50);
            atm.setNum100(atm.getNum100()+temp100);
            System.out.println("Вы внесли " + a + " рублей\n" +
                    "Купюр номиналом 20 рублей " + temp20+"шт.\n"+
                    "Купюр номиналом 50 рублей " + temp50+"шт.\n"+
                    "Купюр номиналом 100 рублей " + temp100+"шт.");
        }
        else {
            System.out.println("Вы ввели сумму, которую невозможно ввести" +
                    "купюрами номиналом 20,50 и 100 рублей");
        }
    }


    /**
     * Метод для снятия денег. Считает сколько и каких купюр надо выдать, проверяет есть ли такое кол-во
     * корректирует количество каждого номинала и выдает деньги, либо пишет сообщение о недостатке средаств
     * @param atm текущий банкомат
     * @param a сумма снятия денег
     */
    public void withdrawal(Atm atm, int a){
        if (a>=20&&a%10==0&&a!=30){
            temp=a;
            temp100=temp/100;
            temp50=(temp%100)/50;
            temp20=(temp%50)/20;
            checker = temp-temp100*100-temp50*50-temp20*20;

            while (checker!=0){
                if(temp50>0){
                    temp50--;
                    temp20=temp20+(checker+50)/20;
                    checker = temp-temp100*100-temp50*50-temp20*20;
                } else {
                    temp100--;
                    temp50++;
                    temp20=(temp-temp100*100-temp50*50)/20;
                    checker = temp-temp100*100-temp50*50-temp20*20;
                }
            }
            if (atm.getNum100()<temp100){
                temp50 = temp50+(temp100-atm.getNum100())*2;
                temp100 = atm.getNum100();
            }
            if (atm.getNum50()<temp50){
                temp20 = temp20+(temp50-atm.getNum50())*50/20;
                temp50 = atm.getNum50();
            }
            checker = temp-temp100*100-temp50*50-temp20*20;
            if (atm.getNum20()>=temp20&&checker==0) {
                atm.setNum20(atm.getNum20() - temp20);
                atm.setNum50(atm.getNum50() - temp50);
                atm.setNum100(atm.getNum100() - temp100);
                System.out.println("Вы сняли " + a + " рублей\n" +
                        "Купюр номиналом 20 рублей " + temp20 + "шт.\n" +
                        "Купюр номиналом 50 рублей " + temp50 + "шт.\n" +
                        "Купюр номиналом 100 рублей " + temp100 + "шт.");
            }
            else {
                System.out.println("В банкомате отсутствют наличные деньги для выдачи запрошенной суммы");
            }
        }
        else {
            System.out.println("Вы ввели сумму, которую невозможно выдать" +
                    "купюрами номиналом 20,50 и 100 рублей");
        }
    }
}
