package com.Tdsson.bean;

public class Architect extends Programmer{
    private int stock;//股票数

    public Architect(int id, String name, int age, double salary, Equipment equipment, int stock) {
        super(id, name, age, salary, equipment);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
