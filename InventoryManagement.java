import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] productNames = new String[n];
        int[] quantities = new int[n];

        // Input product names and quantities
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter product name " + (i + 1) + ": ");
            productNames[i] = sc.nextLine();
            System.out.print("Enter quantity for " + productNames[i] + ": ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Display low stock items (quantity < 5)
        System.out.println("\n--- Low Stock Items (quantity < 5) ---");
        boolean foundLowStock = false;
        for (int i = 0; i < n; i++) {
            if (quantities[i] < 5) {
                System.out.println(productNames[i] + " (Quantity: " + quantities[i] + ")");
                foundLowStock = true;
            }
        }
        if (!foundLowStock) {
            System.out.println("No low stock items.");
        }

        // Search product by name
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (productNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("Product: " + productNames[i] + ", Quantity: " + quantities[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}
