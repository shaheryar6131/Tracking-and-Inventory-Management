import java.util.ArrayList;
public class Test{
  public static void main(String[] args){
    ArrayList<Item> a = new ArrayList<Item>();
    a.add(new Item("food", 50, 0));
    a.add(new Item("water", 50, 0));
    a.add(new Item("stuff", 30, 0));
    Storage b = new Storage(a, 0, 0, 40, 45, 0);
    Storage c = new Storage(a, 0, 0, 40, 45, 0);
    System.out.println(b.checkRedAlert());
  }
}
