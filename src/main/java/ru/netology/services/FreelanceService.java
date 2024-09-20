package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {

        int balance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance -= expenses;
                balance /= 3;
                counter++;
            } else {
                balance += income;
                balance -= expenses;
            }
        }
        return counter;
    }
}
