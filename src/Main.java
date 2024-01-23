import java.util.ArrayList;
import java.util.List;

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




    }
}