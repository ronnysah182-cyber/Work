package w11;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmManagementSystem{
    public static void main(String[] args){
        Crop[] crops = {new Rice(2.0), new Wheat(1.5),new Maize(1.0)};
        double distanceToMarket = 20;

        for (Crop crop : crops) {
            Transportable transport = (Transportable) crop;
            crop.displayCropInfo();
            System.out.println("estimated yield:"+crop.calculateYield());
            System.out.println("water requirement:"+crop.calculateWaterRequirement());
            System.out.println("transport method:"+transport.gettransportmethod());
            System.out.println("transport cost:"+transport.calculatetransportcost(distanceToMarket));
        }
    }
}