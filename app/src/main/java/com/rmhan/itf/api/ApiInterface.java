package com.rmhan.itf.api;

import com.rmhan.itf.model.contact.Contact;
import com.rmhan.itf.model.login.Login;
import com.rmhan.itf.model.register.Register;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("username") String username,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("username") String username,
            @Field("password") String password,
            @Field("name") String name,
            @Field("email") String email,
            @Field("phone") String phone
    );

    @FormUrlEncoded
    @POST("contact.php")
    Call<Contact> contactResponse(
          @Field("email") String email,
          @Field("orderId") String orderId,
          @Field("phone") String phone,
          @Field("password") String password,
          @Field("chat") String chat
    );
}
