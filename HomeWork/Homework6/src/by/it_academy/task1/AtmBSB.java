package by.it_academy.task1;

public class AtmBSB extends Atm implements Info,InfoBank {

    public AtmBSB(int num20, int num50, int num100) {
        super(num20, num50, num100);
    }



    @Override
    public void info(Atm atm) {
        System.out.println("В банкомате находять купюры следующих номиналов:\n" +
                "20 рублей - " + atm.getNum20()+"шт.\n"+
                "50 рублей - " + atm.getNum50()+"шт.\n"+
                "100 рублей - " + atm.getNum100()+"шт." );
    }

    @Override
    public String infobank(Atm atm) {
        return atm.getBank();
    }

    @Override
    public String infoatmID(Atm atm) {
        return atm.getNumberID();
    }



}
