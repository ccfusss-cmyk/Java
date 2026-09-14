package shopping;
public class Product
{
// Public member
public String productName;
// Protected member
protected int productId;
// Default member
String category;
// Private member
private double price;
// Constructor
public Product(int productId, String productName, String category, double price)
{
this.productId = productId;
this.productName = productName;
this.category = category;
this.price = price;
}
// Public method to display product details
public void displayProduct()
{
System.out.println("\n----- Product Details -----");
System.out.println("Product ID : " + productId);
System.out.println("Product Name : " + productName);
System.out.println("Category : " + category);
System.out.println("Price : " + price);
}
// Public method to apply discount
public void applyDiscount(double percentage)
{
if (percentage > 0 && percentage <= 100) {
price = price - (price * percentage / 100);
System.out.println("Discount applied successfully.");
} else {
System.out.println("Invalid discount percentage.");
}
}
}
