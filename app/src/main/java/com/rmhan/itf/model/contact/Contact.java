package com.rmhan.itf.model.contact;
import com.google.gson.annotations.SerializedName;
import com.rmhan.itf.model.register.RegisterData;

public class Contact {
    @SerializedName("data")
    private ContactData contactData;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private boolean status;

    public void setContactData(ContactData contactData){
        this.contactData = contactData;
    }

    public ContactData geContactData(){
        return contactData;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean isStatus(){
        return status;
    }
}
