package com.company;

public class Main {

    static int[] arr = {2,9,0,1,7,5};

    public static void main(String[] args) {
	    printArr();
        insertionSort();
        printArr();
//        bubbleSort();
//        printArr();
//        binarySearchForValue(7);
    }

    public static void bubbleSort(){
        for (int i = arr.length-1; i>1; i--){
            for (int j = 0; j <i; j++){
                if (arr[j]>arr[j+1]){
                    swapValue(j,j+1);
                }
            }
        }
    }

    public static void swapValue(int indexFrom, int indexTo){
        int temp = arr[indexFrom];
        arr[indexFrom] = arr[indexTo];
        arr[indexTo] = temp;
    }

    public static void printArr(){
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while(lowIndex <= highIndex) {
            int middleIndex = (highIndex +lowIndex) / 2;
            if (arr[middleIndex] < value) {
                lowIndex = middleIndex;
            } else {
                if (arr[middleIndex]>value) {
                    highIndex = middleIndex;
                } else {
                    System.out.println("Found index="+middleIndex+" for value = "+ value);
                    lowIndex = highIndex+1;
                }
            }
        }
    }

    public static void selectionSort(){
        for (int x = 0; x < arr.length; x++){
            int minimum = x;
            for(int y = x; y<arr.length; y++){
                if (arr[minimum]>arr[y]){
                    minimum = y;
                }
            }
            swapValue(x,minimum);
        }
    }

    public static void insertionSort() {
        for (int i=1; i< arr.length; i++){
            int j = i;
            int toInsert = arr[i];
            while ((j>0)&&(arr[j-1]>toInsert)){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = toInsert;
        }
    }
}
