package exo;

import java.time.Instant;
import java.util.Objects;

public class Product {
    private int ind;
    private String name;
    private Instant creationDatetime;
    private Category category;

    public Product(int ind, String name, Instant creationDatetime, Category category) {
        this.ind = ind;
        this.name = name;
        this.creationDatetime = creationDatetime;
        this.category = category;
    }


    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreationDatetime() {
        return creationDatetime;
    }

    public void setCreationDatetime(Instant creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ind == product.ind && Objects.equals(name, product.name) && Objects.equals(creationDatetime, product.creationDatetime) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ind, name, creationDatetime, category);
    }


    @Override
    public String toString() {
        return "Product{" +
                "ind=" + ind +
                ", name='" + name + '\'' +
                ", creationDatetime=" + creationDatetime +
                ", category=" + category +
                '}';
    }
}