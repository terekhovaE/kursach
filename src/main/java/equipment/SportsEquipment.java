package equipment;

public abstract class SportsEquipment {


  public   double weight;      //масса
    String manufacturer;    //производитель

    public SportsEquipment(double weight, String manufacturer) {
        this.weight = weight;
        this.manufacturer = manufacturer;

    }
    public SportsEquipment Update (SportsEquipment sport) {

        this.weight = sport.weight;;
        this.manufacturer = sport.manufacturer;;
        return  this;
    }

}

