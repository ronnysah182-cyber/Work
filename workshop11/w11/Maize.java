package w11;


/**
 * Write a description of class w here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable{
    public Maize(double landArea) {
        super("Maize","Hill-friendly",landArea);
    }

    @Override
    public double calculateYield(){
        return landArea*2.8;
    }

    @Override
    public double calculateWaterRequirement(){
        return landArea*500;
    }

    @Override
    public double calculatetransportcost(double distance){
        return distance*12;
    }

    @Override
    public String gettransportmethod(){
        return "tractor";
    }
}