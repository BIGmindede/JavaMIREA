package Meth1.Lab2;

import java.util.Scanner;

public class Human {
    int lifeExpectancy;
    Scanner scn = new Scanner(System.in);
    public Human() {
        System.out.println("Введите продолжительность жизни: ");
        lifeExpectancy = scn.nextInt();
        Head controller = new Head();
        while (lifeExpectancy-- > 0) {
            System.out.println(controller.action());
        }
    }
}
