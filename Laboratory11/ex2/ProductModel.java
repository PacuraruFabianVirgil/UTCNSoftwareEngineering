package pacuraru.fabian.lab11.ex2;

public class ProductModel {
    private String name;
    private int quantity;
    private double price;

    public ProductModel(String name,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public void modifyQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
