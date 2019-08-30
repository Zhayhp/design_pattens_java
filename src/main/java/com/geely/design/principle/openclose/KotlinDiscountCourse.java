package com.geely.design.principle.openclose;

public class KotlinDiscountCourse extends KotlinCourse{
    public KotlinDiscountCourse(int id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return this.getPrice() * 0.8;
    }
}
