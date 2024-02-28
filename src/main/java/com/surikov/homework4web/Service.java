package com.surikov.homework4web;

public class Service {

    public int getMax(int[] numsInt) {
        int calculateValue = numsInt[0];

            for(int i=0;i<numsInt.length;i++){
                if(calculateValue<numsInt[i]){
                    calculateValue = numsInt[i];
                }
            }

        return calculateValue;
    }

    public int getMin(int[] numsInt) {
        int calculateValue = numsInt[0];

            for(int i=0;i<numsInt.length;i++){
                if(calculateValue>numsInt[i]){
                    calculateValue = numsInt[i];
                }
            }

        return calculateValue;
    }

    public int getAvg(int[] numsInt){
        int sum=0;
        int calculateValue;

            for(int i=0;i<numsInt.length;i++){
                sum +=numsInt[i];
            }

        return calculateValue = sum/numsInt.length;
    }

}
