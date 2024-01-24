import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GroceryList{

   private List<String> groceryList  = new ArrayList<>();

   public GroceryList() {
      this.groceryList=new ArrayList<>();
   }

   private static String[] splitItems(String items) {
      String[] splitItems = items.split(",");
      return splitItems;
   }


   public boolean checkItemIsInList( String item){
      return groceryList.contains(item);
   }


   public void addItems(String items){
      String[] splitItems = splitItems(items);
      for(String item: splitItems){
         String trimmedItem = item.trim();
         if(!checkItemIsInList(trimmedItem)){
            groceryList.add(trimmedItem);
            sortItems();
         }else{

            System.out.println("Product "+ items + " is added before! Please try to add another product.");
         }
      }


   }


   public void removeItems(String items){
      if(checkItemIsInList(items)){
         groceryList.remove(items);
      }else{
         System.out.println("Your shopping cart does not include this product: "+items);
      }

   }
   public List printSorted(){
      Collections.sort(groceryList);
      System.out.println(groceryList);
       return groceryList;
   }
   public void sortItems() {
      Collections.sort(groceryList);
   }
   @Override
   public String toString() {
      return "GroceryList{" +
              "groceryList=" + groceryList +
              '}';
   }
}
