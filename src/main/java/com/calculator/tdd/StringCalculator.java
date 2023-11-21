package com.calculator.tdd;

public class StringCalculator {
    public int add(String input) {
        int sum = 0;
        if(input.isEmpty()){
            return 0;
        }
        String[] numbers = input.split(",");
        for (int i = 0; i < Math.min(numbers.length, 2); i++) {
            if(Integer.parseInt(numbers[i])<=1000){
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
