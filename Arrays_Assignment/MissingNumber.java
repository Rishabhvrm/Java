/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;
/**
 *
 * @author RISHAB
 */
public class MissingNumber {
    static void FindMissingNumbers(int [] arr, int limit, int size) {
        System.out.println("\nMissing numbers between 1 and  "+limit+" in your Array are :");
        for (int i = 1 , j = 0; i <= limit ; i ++) {
            if (i != arr[j]) {
                System.out.print(i+" ");
            }
            else
                if (j < size-1){j++;}
        }
    }
}

class Test5 {
    public static void main (String[] args) {
        //input the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in your Array : ");
        int n = sc.nextInt();
        int limit = 100;
        int [] Arr = new int[n];
        System.out.print("Enter your Array in sorted order : ");
        for (int i = 0 ; i < n ; i ++ ) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(Arr[i]+" ");
        }
        MissingNumber.FindMissingNumbers(Arr,limit,n);
    }
}
