import java.util.ArrayList;

public class GroceryList implements List{

   private ArrayList groceryList  = new ArrayList();

   public GroceryList(ArrayList groceryList) {
      this.groceryList = groceryList;
   }

   public ArrayList addItems(String item){
      groceryList.add(item);
      return groceryList.sort();
   }

}
