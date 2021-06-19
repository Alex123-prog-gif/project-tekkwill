package entity.product;

import java.time.LocalDate;
import java.util.Objects;

public class Food extends Product{
    private double discount;
    private FoodCategory category;


    public Food(String name, double price, LocalDate available,FoodCategory category) {
         super(name,price,available);
         this.category = category;
     }

    public FoodCategory getCategory() {
        return category;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }

    @Override
    public double getPriceOnBill() {
        return 0;
    }

    @Override
    public String getPrintText() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return Double.compare(food.discount, discount) == 0 && category == food.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, category);
    }

    @Override
    public String toString() {
        return "Food{" +
                "discount=" + discount +
                ", category=" + category +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }
}
