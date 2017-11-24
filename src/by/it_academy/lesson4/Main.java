package by.it_academy.lesson4;

public class Main {


    public static void main(String[] args) {
        People[] people = new People[2];
        People people1 =  new People("asdd", 231);
        people1.setName("BAB");
        people1.setAge(30);
        People.staticValue = 25;


        People people2 = new People(25);
        people2.setAge(27);
        people2.setName("BAasdasdB");
        People.staticValue = 200;
        people[0] = people1;
        people[1] = people2;
        for(People peo:people){
            printPeople(peo);
        }
    }

    public static void printPeople(People a){
        System.out.println("Name = " + a.getName());
        System.out.println("Age = " + a.getAge());
        System.out.println(a.staticValue);
    }

  /*  public static void main(String[] args) {
        Car myCar = new Car();
        Car secCar = new Car();
        Car anotherCar = new Car();

    }  */
}
