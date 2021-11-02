package work.nonCommand.services;

import work.nonCommand.StaticService;

public class Multiplication implements Expression{
    private int max = 10;
    private int min = 1;
    private int sum = -1;

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public String action() {
        int first = (int) ((Math.random() * (max - min)) + min);
        int second = (int) ((Math.random() * (max - min)) + min);
        sum = first * second;

        StaticService.amount = sum;
        return first + " * " + second + " = ?";
    }
}
