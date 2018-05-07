import lib.Sort;
import lib.Search;
public class WareHouse extends Storage, implements Shippable{
  private ArrayList<Storage> hubs = new ArrayList<Storage>;
  private int size = Constants.largeStorageMax;
  public WareHouse(ArrayList<ShippingFacilites> a, ArrayList<Items> b, int xCord, int yCord, int red, int yellow, int max){
    super(a, xCord, yCord, red, yellow, max);
    mainInventory = b;
  }
  public boolean hasUpdate(){
    for(int i = 0; i < hubs.size(); i++){
      if(hubs.get(i).hasUpdate){
        return true;
      }
    }
    return false;
  }

  public void addLocation(Storage a){
    hubs.add(a);
  }

  public void getStatus(){

  }
  
}
