package com.backend.charity.model;

public class Clothing {

    private Long id;
    private String size;
    private String color;
    private String type;

    public Clothing() {
    }

    public Clothing(Long id, String size, String color, String type) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
