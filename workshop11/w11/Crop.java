package w11;


/**
 * Write a description of class q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop{
    protected String cropName;
    protected String season;
    protected double landArea;

    public Crop(String cropName, String season, double landArea){
        this.cropName=cropName;
        this.season=season;
        this.landArea=landArea;
    }

    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();

    public void displayCropInfo(){
        System.out.println("crop name:"+cropName);
        System.out.println("season:"+season);
        System.out.println("land area:"+landArea);
    }
}