package com.tmannapps.propertyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.security.cert.CertPathBuilderSpi;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PropertyAdapter.OnRowClickListener {
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
        propertyAdapter = new PropertyAdapter(propertyList, MainActivity.this, this);
        propertyRecyclerView.setAdapter(propertyAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        propertyRecyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i < imageList.length; i++) {
            com.tmannapps.propertyapp.Property property = new com.tmannapps.propertyapp.Property(i, imageList[i], addressList[i], rentList[i], poolList[i], petsList[i], bedroomsList[i]);
            propertyList.add(property);
        }
    }


    @Override
    public void onItemClick(int position) {
        //todo: set the onclick listener to go to a fragment per case instead of a Toast
        Fragment fragment;

        switch (position) {
            case 0:
                fragment = new MarinaFragment();
                Toast.makeText(this, "You clicked on Marina Blv", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                fragment = new CharlotteFragment();
                fragment.isVisible();
                Toast.makeText(this, "You clicked on Charlotte St", Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.myFragment, fragment).addToBackStack(null).commit();


    }
}