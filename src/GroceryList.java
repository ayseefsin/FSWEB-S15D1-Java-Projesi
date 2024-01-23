import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GroceryList{

   private List<String> groceryList  = new ArrayList<>();

   public GroceryList() {

   }
   public boolean checkItemIsInList( String item){
      return groceryList.contains(item);
   }
   public void addItems(String item){
      if(!checkItemIsInList(item)){
         groceryList.add(item);
      }else{
         System.out.println("Product "+ item + " is added before! Please try to add another product.");
      }

   }
   public void removeItems(String item){
      if(checkItemIsInList(item)){
         groceryList.remove(item);
      }else{
         System.out.println("Your shopping cart does not include this product: "+item);
      }

   }
   public List printSorted(){
      Collections.sort(groceryList);
      System.out.println(groceryList);
       return groceryList;
   }

   @Override
   public String toString() {
      return "GroceryList{" +
              "groceryList=" + groceryList +
              '}';
   }
}
