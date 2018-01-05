package by.it_academy.lesson14.part2;

import by.it_academy.lesson14.anonimClass.AbstractClass;

public class Main {

  /*  private static AbstractClass a = new AbstractClass() {
        @Override
        public void test() {
            System.out.println("Anonim class");
            System.out.println(b);
        }
    };

        static int b = 5;

    public static void main(String[] args) {


        makeSmth(a);

        makeSmth(new AbstractClass() {
            @Override
            public void test() {
                System.out.println(b);
            }
        });

    }

    public static void makeSmth(AbstractClass obj){
        obj.test();
    */


 /* public static int getMoney(){
      return 50;
  }  */




  public static void getMoney(OnGetMoneyListener listener){
      //проходит много времени
      listener.onMoney(50);
  }

  interface OnGetMoneyListener{
      void onMoney(int money);
  }
}
