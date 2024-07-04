import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;
import java.util.ArrayList;
import java.util.List;

public class EcommerceDemo {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Headphones", 149.99);
        Product product3 = new Product(3, "Smartphone", 699.99);

        // Create a customer
        Customer customer = new Customer(1, "John Doe");

        // Add products to the customer's shopping cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Calculate the total cost in the cart
        System.out.println("Total cost in cart: $" + customer.calculateTotal());

        // Create an order
        List<Product> cartProducts = new ArrayList<>(customer.getShoppingCart());
        Order order = new Order(1, customer, cartProducts);

        // Generate order summary
        order.generateOrderSummary();

        // Update order status
        order.updateOrderStatus("Shipped");
        System.out.println("Updated order status: " + order.getStatus());
    }
}

