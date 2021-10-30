package org.example;

public class HomeWork {
 public static void main(String [] args){
     //invertArray();
     //emptyArray();
     //changeArray();
     //squareArray();
     retLenArr(2,4);
 }public static void invertArray(){
     int[] arr = {1,0,1,0,0,1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                 arr[i]=0;
            } else {
                 arr[i]=1;
            }
            System.out.println(arr[i]);
        }


    }public static void emptyArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println(arr1[i]);;
        }

    }public static void changeArray(){
     int[] arr2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] <= 6){
                arr2[i] *= 2;
            }
            System.out.println(arr2[i]);
        }

    }public static void squareArray(){
     int[][] arr3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }public static int[] retLenArr(int len,int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
        return arr;
        
    }
}
