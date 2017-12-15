package by.it_academy.task2;

public class Main {

    public static void main(String[] args) {
        Build building = new Build("Здание 1");
        building.addRoom(new Room("Комната 1", 100, 3));
        building.addRoom(new Room("Комната 2", 5, 2));
        try {
            building.getRoom("Комната 1").addLump(new Lump(150));
        } catch (IlluminanceTooMuchException e) {
            e.getINFO();
        }

        try {
            building.getRoom("Комната 1").addLump(new Lump(250));
        } catch (IlluminanceTooMuchException e) {
            e.getINFO();
        }
        try {
            building.getRoom("Комната 1").addFurniture(new Furniture("Стол письменный", 3));
        } catch (SpaceUsageTooMuchException e) {
            e.getINFO();
        }
        try {
            building.getRoom("Комната 1").addFurniture(new Furniture("Кресло мягкое и пушистое", 10));
        } catch (SpaceUsageTooMuchException e) {
            e.getINFO();
        }
        building.describe(building);

    }
}
