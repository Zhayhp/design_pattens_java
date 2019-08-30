package com.geely.design.principle.openclose;

import static org.junit.jupiter.api.Assertions.*;

class KotlinDiscountCourseTest {

    @org.junit.jupiter.api.Test
    void getPrice() {
        ICourse iCourse = new KotlinDiscountCourse(1, "kotlin", 200d);
        KotlinDiscountCourse kotlinCourse = (KotlinDiscountCourse) iCourse;
        System.out.println("课程ID:" + kotlinCourse.getId() + " 课程名称:" + kotlinCourse.getName() + " 课程原价:" + kotlinCourse.getPrice() + " 课程折后价格:" + kotlinCourse.getDiscountPrice() + "元");

    }
}