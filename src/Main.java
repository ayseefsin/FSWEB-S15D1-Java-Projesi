import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GroceryList aysinList= new GroceryList();
        aysinList.addItems("cherry");
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
        Scanner scannerInitial = new Scanner(System.in); //Create scanner object
        int message1;// describe a string and named
        do {
            System.out.println("Please press 0 to stop, 1 to add, 2 to remove");//message to user
            message1= Integer.parseInt(scannerInitial.nextLine());

            switch (message1){
                case 0:
                    System.out.println("You stopped the application. Your final shopping card list: " + aysinList);
                    ;
                    break;
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please write the product you want to add to your shopping " +
                            "list in the box below then press enter");
                    String productName;
                    productName= scanner.nextLine();
                    aysinList.addItems(productName);
                    System.out.println("Your shopping card : " + aysinList);
                    break;
                case 2:
                    Scanner scannerRemove = new Scanner(System.in);
                    System.out.println("Please write the product you want to remove to your shopping " +
                            "list in the box below, then press enter");
                    String productNameRemoved;
                    productNameRemoved= scannerRemove.nextLine();
                    aysinList.removeItems(productNameRemoved);
                    System.out.println("Your shopping card : " + aysinList);
                    break;
                default: System.out.println("Invalid entry. Please press 0, 1 or 2 then press enter");
            }
        }while (message1!=0);












    }
}