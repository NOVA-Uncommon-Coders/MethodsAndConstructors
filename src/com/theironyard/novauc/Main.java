package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person me = new Person(5);
        System.out.println(me.getAge());
        me.setAge(10);
        System.out.println(me.getAge());
        me.setAge(255);
        System.out.println(me.getAge());

        Travel t = new Travel(1);
        t.setCost(0);
        System.out.println(t.getCost());

        Food f = new Food(1500);
        System.out.println(f.getCalories());
        f.setCalories(2000);
        System.out.println(f.getCalories());

        Car c = new Car("ford");
        System.out.println(c.getMake());

        c.setMake("honda");
        System.out.println(c.getMake());

        c.setMake("ford");
        System.out.println(c.getMake());

    }
}
