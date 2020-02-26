package com.db.HW1;
import java.util.Scanner;

/**
 * Resolved task of finding result of expression 'x^4 + x^3 + x^2 + x + 1' with 2 operations of multiply.
 */
public class Task1 {
    private int x;

    public int getX(){
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        in.close();
        return x;
    }

    /**
     * this metod finds result of the folowing expression: 'x^4 + x^3 + x^2 + x + 1'
     * @param x - write this number in console
     * @return result of the folowing expression: 'x^4 + x^3 + x^2 + x + 1'
     */
    public int returnValue(int x){
        this.x = x;
        int squaredX = x*x;
        return (squaredX + x)*(squaredX + 1) + 1;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("Print Integer number: ");
        int x = task1.getX();
        System.out.println("\n");
        System.out.println("Result of expression: " + task1.returnValue(x));
    }
}