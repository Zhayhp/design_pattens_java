package com.geely.design.principle.openclose;

/**
 *
 */
public class KotlinCourse implements ICourse {
    private int id = 33;
    private String name = "Kotlin";
    private Double price = 400d;

    public KotlinCourse(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
