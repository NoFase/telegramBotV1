package ru.forDaughter.telegram.simpleMathematical.nonCommand.services;

import ru.forDaughter.telegram.simpleMathematical.nonCommand.StaticService;

public class Division implements Expression{
    private int max = 100;
    private int min = 1;
    private int sum = -1;

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public String action() {
        int first = 1;
        int second =1;
        while (sum > 100 || sum <= 0){
            first = (int) ((Math.random() * (max - min)) + min);
            second = (int) ((Math.random() * (max - min)) + min);
            sum = first / second;
            if (first % second != 0) sum = -1;
        }

        StaticService.amount = sum;
        return first + " / " + second + " = ?";
    }
}
