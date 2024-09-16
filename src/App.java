import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1500.0, 10);
        Sales sales = new Sales(product);

        // Lakukan operasi penjualan
        sales.sellProduct(3);
        sales.restockProduct(5);
        sales.updateProductPrice(1600.0);
    }
}
