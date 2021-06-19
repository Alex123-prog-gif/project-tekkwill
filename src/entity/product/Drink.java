package entity.product;

import java.time.LocalDate;
import java.util.Objects;

public class Drink extends Product{
    private final double discount = 0.5;
    private double volume;

    public Drink(String name,double price,LocalDate available,double volume) {
        super(name,price,available);
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public double getPriceOnBill() {
        return discount;
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
        Drink drink = (Drink) o;
        return Double.compare(drink.discount, discount) == 0 && Double.compare(drink.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, volume);
    }


}
