package com.tmannapps.propertyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ConcurrentModificationException;
import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter <PropertyAdapter.PropertyViewHolder> {
    private List<Property> propertyList;
    private Context context;

    public PropertyAdapter(List<Property> propertyList, Context context) {
        this.propertyList = propertyList;
        this.context = context;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.property_row, parent, false);
        return new PropertyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {

        holder.propertyImageView.setImageResource(propertyList.get(position).getImage());
        holder.addressTextView.setText(propertyList.get(position).getAddress());
        holder.rentTextView.setText(propertyList.get(position).getRent());
        holder.poolTextView.setText(propertyList.get(position).getPool());
        holder.petsTextView.setText(propertyList.get(position).getPets());
        holder.bedroomsTextView.setText(propertyList.get(position).getBedroom());
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public class PropertyViewHolder extends RecyclerView.ViewHolder {
        public ImageView propertyImageView;
        public TextView addressTextView, rentTextView, poolTextView, petsTextView, bedroomsTextView;
        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);
            propertyImageView = itemView.findViewById(R.id.propertyImageView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            rentTextView = itemView.findViewById(R.id.rentTextView);
            poolTextView = itemView.findViewById(R.id.poolTextView);
            petsTextView = itemView.findViewById(R.id.petsTextView);
            bedroomsTextView = itemView.findViewById(R.id.bedroomsTextView);
        }

        //TODO set on click listener and make a fragment
    }
}
