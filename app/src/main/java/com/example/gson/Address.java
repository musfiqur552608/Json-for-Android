package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    public Address(String country, String city){
        mCountry = country;
        mCity = city;
    }
}
