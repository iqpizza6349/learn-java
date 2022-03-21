package com.tistory.workshop6349.chap3;

public class CarExam {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "람보르기니 실루엣";
        car1.number = 1234567;

        car2.name = "포르쉐 911";
        car2.number = 5262180;

        System.out.println(car1.name);
        System.out.println(car1.number);
        System.out.println(car2.name);
        System.out.println(car2.number);

        String name = car2.name;
        System.out.println(name == car2.name);      // true

        Car car3 = new Car();
        car3.name = "BENTLEY Wraith";
        Car car4 = car3;
        car4.name = "SEDAN";
        System.out.println(car4.name);
        System.out.println(car3 == car4);           // true
        System.out.println(car3.name == car4.name); // true
    }

}
