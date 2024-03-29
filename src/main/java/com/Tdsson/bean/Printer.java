package com.Tdsson.bean;

public class Printer implements Equipment {
    private String type;
    private String name;

    public Printer(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "\t" + type +"("+name+")";
    }
}
