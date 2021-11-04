package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class FamilyMembers {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;

    public FamilyMembers(String role, int age) {
        mRole = role;
        mAge = age;
    }
}
