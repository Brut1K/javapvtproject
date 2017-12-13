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

    public Room(double sqr, int numberWindows) {
        this.sqr = sqr;
        this.numberWindows = numberWindows;
        this.lightnessCurrent = numberWindows*700;
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

    public void addLump(Lump lump) throws Exception{
        if(lightnessCurrent+lump.getLigth()<=maxLight){
            lumpList.add(lump);
        } else {
            throw new Exception();
        }
    }

    public void addFurniture(Furniture furniture) throws Exception {
        if (sqr*maxPercent/100<(sqrCurrent+furniture.getSqr())) {
            throw new Exception();
        } else {
            furnitureList.add(furniture);
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
}
