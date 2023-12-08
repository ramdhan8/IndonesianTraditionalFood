package com.rmhan.itf.model.rcmenu;

public class DataMenuAdapter {
    public String adapterid_menu;
    public String name_menu;
    public String adapter_url;
    public String harga_menu;



    public String getId_menu(){return adapterid_menu;}
    public void setId_menu(String id_menu){
        this.adapterid_menu=id_menu;
    }

    public String getName_menu(){return name_menu;}
    public void setName_menu(String name){
        this.name_menu=name;
    }

    public String geturl(){return adapter_url;}
    public void seturl(String gambar_url){
        this.adapter_url=gambar_url;
    }

    public String getHarga_menu(){
        return harga_menu;
    }
    public void setHarga_menu(String harga_menu){
        this.harga_menu=harga_menu;
    }
}
