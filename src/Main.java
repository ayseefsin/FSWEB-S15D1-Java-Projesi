import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GroceryList aysinList= new GroceryList();

        aysinList.addItems("apple");
        aysinList.addItems("banana");
        aysinList.addItems("strawberry");
        System.out.println("The List: " +aysinList);
        aysinList.addItems("cheese");
        aysinList.addItems("cheese");
        System.out.println("The List: " +aysinList);
        aysinList.removeItems("apple");
        System.out.println("The List: " +aysinList);
        aysinList.removeItems("apple");
        System.out.println("The List: " +aysinList);
        Scanner scanner = new Scanner(System.in);
        String productName;
        System.out.println("Please write the product you want to add to your shopping list in the box below.");
        productName= scanner.nextLine();
        aysinList.addItems(productName);
        System.out.println("Your shopping card : " + aysinList);




    }
}