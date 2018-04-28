import lib.Sort;
import lib.Search;
public class WareHouse extends Storage, implements Shippable{
  private ArrayList<ShippingFacilitey> hubs = new ArrayList<ShippingFacility>;
  private ArrayList<Item> mainInventory = new ArrayList<Item>;
  private int[] location = Constants.wareHouseLocation;
  private int size = Constants.largeStorageMax;
  public WareHouse(ArrayList<ShippingFacilites> a, ArrayList<Items> b){
    hubs = a;
    mainInventory = b;
    location[1] = 0;
    location[2] = 0;
  }
  public boolean hasUpdate(){
    for(int i = 0; i < hubs.size(); i++){
      if(hubs.get(i).hasUpdate){
        return true;
      }
    }
    return false;
  }
  public void addLocation(ShippingFacility a){
    hubs.add(a);
  }
  public void shipItem(Item a, int b){

  }
  public void getInventory(Item item){
    return
  }
  public void getStatus(){

  }
  public int[] getLocation(){
    return location;
  }
}
