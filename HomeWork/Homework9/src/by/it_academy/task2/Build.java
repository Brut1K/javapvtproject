package by.it_academy.task2;

import java.util.ArrayList;
import java.util.List;

public class Build {

    private String name;

    public Build(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Room> roomList = new ArrayList<>();


    public void addRoom(Room room){
        roomList.add(room);
    }

    public Room getRoom(String s){
        for (Room r:roomList){
            if (r.getName().equals(s)){
                return r;
            }

        }
        return null;
    }

    public void describe(Build build){
        System.out.println(build.getName()+":");
        if(roomList.size()>0){

        for(int i = 0;i<roomList.size();i++) {
            System.out.print("  " + roomList.get(i).getName() + ":\n" +
                    "    Освещенность = " + roomList.get(i).getLightnessCurrent() +
                    "(Окна : " + roomList.get(i).getNumberWindows() + "шт. по 700лк каждое");
            if (roomList.get(i).getLumpList().size() > 0) {
                for (int j = 0; j < roomList.get(i).getLumpList().size(); j++) {
                    System.out.print(", лампочка на  "
                            + roomList.get(i).getLumpList().get(j).getLigth());
                }
                System.out.println(")");
            } else {
                System.out.println(")");
            }
            if(roomList.get(i).getSqr()!=roomList.get(i).getSqrCurrent()) {
                System.out.println("    Площадь = " + roomList.get(i).getSqr() + "м2 (занято " +
                        roomList.get(i).getSqrCurrent() + "м2, гарантированно свободно " +
                        (roomList.get(i).getSqr() - roomList.get(i).getSqrCurrent()) + "м2 или " +
                        roomList.get(i).getSqrCurrent() * 100 / roomList.get(i).getSqr() + "%)");
            } else{
                System.out.println("    Площадь = " + roomList.get(i).getSqr()+"(свободно 100%");
            }

            if(roomList.get(i).getFurnitureList().size()>0){
                System.out.println("    Мебель:");
                for(Furniture f:roomList.get(i).getFurnitureList()){
                    System.out.println("    " + f.getName()+" (площадь " + f.getSqr() + "м2)");
                }
            } else{
                System.out.println("    Мебели нет");
            }

        }
        } else {
            System.out.println("В зданиии нет комнат");
        }
    }




}
