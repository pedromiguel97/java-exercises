package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // public/private: access modifier
    // void/String/double/int/etc: return type
    // functionName(PARAMETER): input parameter

    // object method
    public double totalValueInStock(){
        return price * quantity;
    }

    // static method
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    // static method
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product data: "
                + name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
