package com.example.stone.dagger2demo;

import javax.inject.Inject;

/**
 * Created by stone on 2017/6/28.
 */

public class Student {
    private int age;

    @Inject
    public Student() {
    }

    @Override
    public String toString() {
        return age + "岁的小学生";
    }
}
