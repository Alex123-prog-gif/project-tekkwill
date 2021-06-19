package entity.product;

import java.time.LocalDate;

public abstract class Product implements Billable,Printable  {
  public int id;
  public final String name;
  public double price;
  public final LocalDate bestBefore;

  public Product(String name,double price,LocalDate bestBefore){
     this.bestBefore = bestBefore;
     this.name = name;
     this.price = price;
  }

   public int getId() {
      return id;
   }

   public double getPrice() {
      return price;
   }

   public String getName() {
      return name;
   }

public void setId(int id){
     this.id = id;
}

   public LocalDate getBestBefore() {
      return bestBefore;
   }

   public void setPrice(double price){
     this.price = price;
   }

   @Override
   public int hashCode() {
      return 1;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name) && bestBefore.equals(product.bestBefore);
    }

    @Override
    public double getPriceOnBill() {
        return 0;
    }
}
