package by.it_academy.lesson17.part1;

public class Car {
    private int id;
    private String name;

    class Windows{
        private  int id;
        private  String model;

        public void test(){
           name = "Name";
           Car.this.setId(22);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    static class Windows2{
        private int id;
        private String model;

        public void test(){
            /* из статика к нестатику нельзя обратиться
            name = "Name";
            Car.this.setId(22);
            */
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    }

    //есди интерфейс используется ТОЛЬКО для этого класса
    // есть смысл делать вложенный
    interface Listener{
        void onClick();
    }


    public int getId() {
        return id;

    }

    public void setId(int id) {
        //если положить внутрь метода, то будет как анонимный класс
        class Test{
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
