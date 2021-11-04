package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*Address address = new Address("Bangladesh", "Dhaka");
        List<FamilyMembers> family = new ArrayList<>();
        family.add(new FamilyMembers("Wife", 21));
        family.add(new FamilyMembers("Daughter", 2));
        Employee employee = new Employee("John", 30, "john@gmail.com",address, family);
        String json = gson.toJson(employee);
         */



        String json = "{\"address\":{\"city\":\"Dhaka\",\"country\":\"Bangladesh\"},\"age\":30,\"family\":[{\"age\":21,\"role\":\"Wife\"},{\"age\":2,\"role\":\"Daughter\"}],\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);

    }
}