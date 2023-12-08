package com.rmhan.itf.model.contact;
import com.google.gson.annotations.SerializedName;
public class ContactData {

    @SerializedName("orderId")
    private String orderId;

    @SerializedName("chat")
    private String chat;

    @SerializedName("email")
    private String email;

    @SerializedName("phone")
    private String phone;

    @SerializedName("password")
    private String password;

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public String getOrderId(){
        return orderId;
    }

    public void setChat(String chat){
        this.chat = chat;
    }

    public String getChat(){
        return chat;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
}
