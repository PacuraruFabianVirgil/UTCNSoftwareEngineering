package pacuraru.fabian.lab11.ex2;

import java.util.ArrayList;

public class ProductController {
    ArrayList<ProductModel> products = new ArrayList<>();

    public void addProduct(String name,int quantity,double price){
        ProductModel tempProduct;
        tempProduct = new ProductModel(name,quantity,price);
        products.add(tempProduct);
    }

    public String viewProducts(){
        String out = "";
        for (int i = 0; i < products.size(); i++) {
            out += products.get(i).getName()+" "+products.get(i).getQuantity()+" "+products.get(i).getPrice()+"\n";
        }
        System.out.println(out);
        return out;
    }

    public void deleteProduct(String name){
        int k=-1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(name)){
                k=i;
            }
        }
        if(k>=0){
            products.remove(k);
        }
    }

    public void changeQuantity(String name,int quantity){
        int k=-1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(name)){
                k=i;
            }
        }
        if(k>=0){
            products.get(k).modifyQuantity(quantity);
        }
    }
}
