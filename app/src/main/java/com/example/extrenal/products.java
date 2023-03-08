package com.example.extrenal;

public class products {
    private int _id,Fiel3;
    private String product_name;
    public products(int id,String prooduct_name,int price ){
        this._id=id;
        this.product_name=prooduct_name;
        this.Fiel3=price;

    }
    public void setID(int id){
        this._id=id;
    }
    public int getID(){
        return this._id;
    }
    public void setProducttName(String productname){
        this.product_name=productname;
    }

    public  String get_product_name(){
        return this.product_name;
    }
    public void setPrice(int price){
        this.Fiel3=price;
    }
    public int getPrice(){
        return this.Fiel3;
    }
}
