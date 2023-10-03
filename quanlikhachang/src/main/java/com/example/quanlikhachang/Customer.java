package com.example.quanlikhachang;

public class Customer {
    public String name;
    public int age;
    public String address;
    public String image;

    public Customer(String name, int age, String address, String image) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
    }
    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
