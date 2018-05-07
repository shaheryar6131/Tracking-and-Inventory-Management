import java.util.ArrayList;

public interface Shippable{
  public int[] getLocation();
  //public ArrayList<Item> getInv;
  public void addInv(Item a);
  public boolean hasUpdate();
  public int checkYellowAlert();
  public int checkRedAlert();
}
