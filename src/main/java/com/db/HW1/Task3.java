package com.db.HW1;

import java.util.Scanner;

public class Task3 {
    public static final void reversePartsOfIntegerArray(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = start;
            start = end;
            end = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter head capacity of array: ");
        int head = scanner.nextInt();
        System.out.println("enter tail capacity of array: ");
        int tail = scanner.nextInt();
        int arrayLength = head + tail;
        int[] arr = new int[arrayLength];
        System.out.println("enter array elements: ");
        for (int i = 0; i < arrayLength; ++i) {
            arr[i] = scanner.nextInt();
        }
        //rotate method
        for (int j = 1; j <=tail; ++j) {
            int temp = arr[arrayLength-1];
            for(int i = arrayLength-1; i>=1; --i){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        String resultOfRotateMethod = "";
        for (int i = 0; i < arrayLength; ++i){
            resultOfRotateMethod += arr[i];
        }
        System.out.println(resultOfRotateMethod);

        // revers parts of array method
        reversePartsOfIntegerArray(arr, 0, head - 1);
        reversePartsOfIntegerArray(arr, head, arrayLength - 1);
        reversePartsOfIntegerArray(arr, 0, arrayLength - 1);
        String resultOfReverseMethod = "";
        for (int i = 0; i < arrayLength; ++i){
            resultOfReverseMethod += arr[i];
        }
        System.out.println(resultOfReverseMethod);
    }
}
