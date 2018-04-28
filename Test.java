import java.util.ArrayList;
public class Test{
  public static void main(String[] args){
    ArrayList<Item> a = new ArrayList<Item>();
    a.add(new Item("food", 50));
    a.add(new Item("water", 50));
    a.add(new Item("stuff", 30));
    Storage b = new Storage(a, 0, 0, 40, 45);
    Storage c = new Storage(a, 0, 0, 40, 45);
    System.out.println(b.checkRedAlert());
  }
}
