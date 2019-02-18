package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age  age of this Cat
     */
    public Cat(String name, Integer age) {
        Cat cat = new Cat(name, age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        Cat cat = new Cat(age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        Cat cat = new Cat(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        Cat cat = new Cat(null, null);
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "meow";
    }
}
