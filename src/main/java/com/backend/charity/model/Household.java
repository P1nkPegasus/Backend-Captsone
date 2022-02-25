package com.backend.charity.model;

public class Household {

    private Long id;
    private String name;
    private Long size;
    private Long adults;
    private Long children;

    public Household() {
    }

    public Household(Long id, String name, Long size, Long adults, Long children) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", adults=" + adults +
                ", children=" + children +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getAdults() {
        return adults;
    }

    public void setAdults(Long adults) {
        this.adults = adults;
    }

    public Long getChildren() {
        return children;
    }

    public void setChildren(Long children) {
        this.children = children;
    }
}
