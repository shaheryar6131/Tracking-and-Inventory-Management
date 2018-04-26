import lib.Sort;
public class WareHouse extends Storage, implements Shippable{
  private ArrayList<ShippingFacilites> hubs = new ArrayList<ShippingFacilites>;
  private ArrayList<Items> mainInventory = new ArrayList<Items>;
  private int[] location = Constants.wareHouseLocation;
  public WareHouse(ArrayList<ShippingFacilites> a, ArrayList<Items> b){
    hubs = a;
    mainInventory = b;
    location[1] = 0;
    location[2] = 0;
  }
  public boolean hasUpdate(){

  }
  public void addLocation(){

  }
  public void shipItem(){

  }
  public void getInventory(int itemNum){

  }
  public void getStatus(){

  }
  public int[] getLocation(){
    return location;
  }
}
