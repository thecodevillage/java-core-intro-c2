package com.thecodevillage.day13.example3;

public class MultiDArray {

    public static void main(String[] args){
        int[][] scores=new int[2][3];

        int[][] nums = {{2,5,23},{45,60,223},{100,230,345},{345,456,12}};
        System.out.println("Output values of Multi D Array ");
        for (int i=0; i < 4; i++){
            for (int j=0; j < 3; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
