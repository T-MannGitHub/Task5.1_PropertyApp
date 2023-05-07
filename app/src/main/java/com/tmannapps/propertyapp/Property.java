package com.tmannapps.propertyapp;

public class Property {
    private int id, image;
    private String address, rent, pool, pets, bedroom;

    public Property(int id, int image, String address, String rent, String pool, String pets, String bedroom) {
        this.id = id;
        this.image = image;
        this.address = address;
        this.rent = rent;
        this.pool = pool;
        this.pets = pets;
        this.bedroom = bedroom;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getRent() {
        return rent;
    }

    public String getPool() {
        return pool;
    }

    public String getPets() {
        return pets;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }
}
