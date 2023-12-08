package com.rmhan.itf.model.favorite;

public class DataFavAdapter {
    public String adapterid_fav;
    public String name_fav;
    public String adapter_url;
    public String harga_fav;



    public String getId_fav(){return adapterid_fav;}
    public void setId_fav(String id_fav){
        this.adapterid_fav=id_fav;
    }

    public String getName_fav(){return name_fav;}
    public void setName_fav(String name){
        this.name_fav=name;
    }

    public String geturl(){return adapter_url;}
    public void seturl(String gambar_url){
        this.adapter_url=gambar_url;
    }

 public String getHarga_fav(){
        return harga_fav;
 }
 public void setHarga_fav(String harga_fav){
        this.harga_fav=harga_fav;
 }

}
