package com.calculator.tdd;


import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public int add(String input) {
        ArrayList<String> listNegativeNumber = new ArrayList<String>();

        if(input.isEmpty()){
            return 0;
        }

        String[] numbers = input.split(",");

        int sum = getSum(listNegativeNumber, numbers);

        if (listNegativeNumber.size() >0)
            throw new NegativeNumbersNotAllowedException("Negativos no permitidos: " + Arrays.toString(listNegativeNumber.toArray()));

        return sum;
    }

    private int  getSum(ArrayList<String> listNegativeNumber, String[] numbers) {
        int sum = 0;
        for (int i = 0; i < Math.min(numbers.length, 2); i++) {
            if(Integer.parseInt(numbers[i]) < 0){
                listNegativeNumber.add(numbers[i]);
            } else if (Integer.parseInt(numbers[i])<=1000) {
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
