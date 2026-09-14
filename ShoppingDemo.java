import java.util.Scanner;
import shopping.Product;
public class ShoppingDemo
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
// Taking product details from the user
System.out.print("Enter Product ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter Product Name: ");
String name = sc.nextLine();
System.out.print("Enter Category: ");
String category = sc.nextLine();
System.out.print("Enter Price: ");
double price = sc.nextDouble();
// Creating object of Product class
Product product = new Product(id, name, category, price);
// Accessing public member
System.out.println("\nProduct Name: " + product.productName);
// Display product details
product.displayProduct();
// Applying discount
System.out.print("\nEnter discount percentage: ");
double discount = sc.nextDouble();
product.applyDiscount(discount);
// Display updated details
System.out.println("\nAfter Discount:");
product.displayProduct();

sc.close();
}
}
