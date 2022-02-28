package com.backend.charity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "household")
public class Household {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long size;

    @Column
    private Long adults;

    @Column
    private Long children;

    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "charityId")

    private Charity charity;

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

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
