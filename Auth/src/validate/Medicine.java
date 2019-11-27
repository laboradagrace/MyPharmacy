/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 *
 * @author laboradagr_sd2022
 */
public class Medicine {
    private String brandName;
    private String genericName;
    private String type;
    private double price;
    private int quantity;
    //private String description;
    private String img;
    //private String productID = "00";
    
    public Medicine(){}
    public Medicine(String brandName, String genericName, String type, double price, int quantity, String image) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        //this.description = description;
        this.img = image;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBrandName() {
        return brandName;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public String getProductID() {
//        return productID;
//    }
//
//    public void setProductID(String productID) {
//        this.productID = productID;
//    }
//    
    //methods
    @Override
    public String toString(){
        return String.format("Brand name = %S  Generic name = %S  Price = %.2f Available Quantity = %d",
                this.brandName,this.genericName, this.price, this.quantity);
    }
}
