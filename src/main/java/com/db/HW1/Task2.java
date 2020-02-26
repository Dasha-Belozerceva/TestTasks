package com.db.HW1;
import java.util.Scanner;

public class Task2 {
    private int x;
    private int y;
    private int z;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter divident: \n");
        Task2 task2 = new Task2();
        task2.x = scanner.nextInt();
        System.out.println("enter divider: \n");
        task2.y = scanner.nextInt();
        if (task2.y == 0){
            System.out.println("divider can't be zero");
            return;
        }
       while (task2.x >= task2.y){
           task2.x -= task2.y;
           task2.z++;
       }
        System.out.println(task2.z);

    }
}
