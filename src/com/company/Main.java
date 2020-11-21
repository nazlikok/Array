package com.company;

public class Main {

    public static void main(String[] args) {
        int max = 10;
        int numMax = 19;

        int[] randNum = new int[max];
        int end = randNum.length;

        System.out.println("First Random Array: ");
        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = (int) (Math.random() * numMax + 1);
            System.out.print(randNum[i] + "\t");

        }
        System.out.println();
        System.out.println("Removed Duplicates Array: ");
        for(int i=0; i< randNum.length;i++){
            for(int j=i+1; j< randNum.length; j++){
                if(randNum[i]>randNum[j]){
                    int temp = randNum[i];
                    randNum[i]=randNum[j];
                    randNum[j]=temp;

                }
            }
        }
        for(int i=0;i<randNum.length;i++)
        {
            System.out.print(randNum[i]+"\t");
        }
    }
}

