package w11;


/**
 * Write a description of class e here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable{
    public Wheat(double landArea){
        super("Wheat","Winter",landArea);
    }

    @Override
    public double calculateYield(){
        return landArea*3.2;
    }

    @Override
    public double calculateWaterRequirement(){
        return landArea*700;
    }

    @Override
    public double calculatetransportcost(double distance){
        return distance*10;
    }

    @Override
    public String gettransportmethod(){
        return "tractor";
    }
}