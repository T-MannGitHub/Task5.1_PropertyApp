package com.tmannapps.propertyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView propertyRecyclerView;
    PropertyAdapter propertyAdapter;
    List<Property> propertyList = new ArrayList<>();

    Integer[] imageList = {R.drawable.marina, R.drawable.charlotte};
    String[] addressList = {"Marina Boulevard", "Charlotte Street"};
    String[] rentList = {"$600 p/w", "$650 p/w"};
    String[] poolList = {"Shared resort style lap pool", "Private plunge pool"};
    String[] petsList = {"Pets should be allowed, however are not", "Pets are people too!"};
    String[] bedroomsList = {"2 bedrooms, 2 bathrooms", "2 bedrooms, 1 bathroom"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        propertyRecyclerView = findViewById(R.id.propertyRecyclerView);
        propertyAdapter = new PropertyAdapter(propertyList, MainActivity.this);
        propertyRecyclerView.setAdapter(propertyAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        propertyRecyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i < imageList.length; i++) {
            com.tmannapps.propertyapp.Property property = new com.tmannapps.propertyapp.Property(i, imageList[i], addressList[i], rentList[i], poolList[i], petsList[i], bedroomsList[i]);
            propertyList.add(property);

        }
    }


}