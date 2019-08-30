package com.geely.design.principle.dependenceinversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeelyTest {

    @Test
    void setiCourse() {
    }

    @Test
    void test() {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }
}