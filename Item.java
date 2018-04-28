public class Item{
  public String name;
  public int quantity;
  public Item(String name1, int quant){
    name = name1;
    quantity = quant;
  }
  public int compareTo(Item a){
    return name.compareTo(a.name);
  }
  public int getNumItems(){
    return quantity;
  }
}
