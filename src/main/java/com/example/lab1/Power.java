package com.example.lab1;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Power {
    private Scanner sc = new Scanner(System.in);
    private int number;
    private int power;
    private int result;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getResult() {
        return result;
    }


    public void CalculateResult() {
        System.out.println("Enter number to power");
        setNumber(sc.nextInt());

        System.out.println("Enter power");
        setPower(sc.nextInt());

        result  = (int) Math.pow(number, power);
    }
}
