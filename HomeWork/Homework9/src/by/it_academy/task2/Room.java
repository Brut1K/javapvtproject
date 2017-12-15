package by.it_academy.task2;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static final int maxPercent = 70;
    private static final int maxLight = 4000;
    private int numberWindows;
    private int lightness;
    private int lightnessCurrent;
    private double sqr;
    private double sqrCurrent;
    private String name;

    public Room(String name,double sqr, int numberWindows) {
        this.sqr = sqr;
        this.numberWindows = numberWindows;
        this.lightnessCurrent = numberWindows*700;
        this.name = name;
        this.sqrCurrent = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLightnessCurrent() {
        return lightnessCurrent;
    }

    public void setLightnessCurrent(int lightnessCurrent) {
        this.lightnessCurrent = lightnessCurrent;
    }

    public double getSqrCurrent() {
        return sqrCurrent;
    }

    public void setSqrCurrent(double sqrCurrent) {
        this.sqrCurrent = sqrCurrent;
    }


    private List<Lump> lumpList = new ArrayList();
    private List<Furniture> furnitureList = new ArrayList<>();

    public void addLump(Lump lump) throws IlluminanceTooMuchException{
        if(lightnessCurrent+lump.getLigth()<=maxLight){
            lumpList.add(lump);
            lightnessCurrent+=lump.getLigth();
        } else {
            System.out.println();
            throw new IlluminanceTooMuchException();
        }
    }

    public void addFurniture(Furniture furniture) throws SpaceUsageTooMuchException {
        if (sqr*maxPercent/100<(sqrCurrent+furniture.getSqr())) {
            throw new SpaceUsageTooMuchException();
        } else {
            furnitureList.add(furniture);
            sqrCurrent+=furniture.getSqr();
        }
    }

    public int getLightness() {
        return lightness;
    }

    public void setLightness(int lightness) {
        this.lightness = lightness;
    }

    public double getSqr() {
        return sqr;
    }

    public void setSqr(double sqr) {
        this.sqr = sqr;
    }

    public int getNumberWindows() {
        return numberWindows;
    }

    public void setNumberWindows(int numberWindows) {
        this.numberWindows = numberWindows;
    }

    public List<Lump> getLumpList() {
        return lumpList;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }
}
