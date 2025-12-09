package exo;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (DataRetriever retriever = new DataRetriever()) {

            List<Category> categories = retriever.getAllCategories();
            System.out.println(categories);

            List<Product> products = retriever.getProductList(1, 10);
            System.out.println(products);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}