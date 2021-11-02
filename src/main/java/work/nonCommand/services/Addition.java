package work.nonCommand.services;

import work.nonCommand.StaticService;

public class Addition implements Expression{
    private int max = 100;
    private int min = 1;
    private int sum = -1;

    public int getSum() {
        return sum;
    }

    public String action(){
        int first = -1;
        int second = -1;

        while (sum > 100 || sum <= 0){
            first = (int) ((Math.random() * (max - min)) + min);
            second = (int) ((Math.random() * (max - min)) + min);
            sum = first + second;
        }
        StaticService.amount = sum;
        return first + " + " + second + " = ?";
    }
}
