package com.infiniteskills.spring;

import java.util.Calendar;

/**
 * Created by Maks on 9/15/2018.
 */
public class BeanA {

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    private int age;
    private BeanB beanB;
    private Calendar calendar;

    public int getYear(){
        return this.calendar.get(Calendar.YEAR);
    }

    public int getAge() {
        return age;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    public BeanA() {
        System.out.println("BeanA constructor is executed");
    }
}
