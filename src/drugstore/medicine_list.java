/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstore;

/**
 *
 * @author bustamantecr_sd2022
 */
public class medicine_list {

    private String brandName;
    private String genericName;
    private int quantity;
    private double price;

    public medicine_list() {
    }

    public medicine_list(String generic,String brand,double price,int quantity) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.quantity = quantity;
        this.price = price;

    }

    public medicine_list(double price) {
//        this.medName = medName;
        this.price = price;

    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
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


}
