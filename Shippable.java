public interface Shippable{
  public int[] getLocation();
  public ArrayList<Items> getInv();
  public void addInv(Items);
  public void hasUpdate();
  public int maxCapacity();
  public boolean checkYellowAlert();
  public boolean checkRedAlert();
}
