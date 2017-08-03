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
public class ReverseArray {
    static void reverse (int[] arr,int len) {
        int [] arr_new = new int [len];
        System.out.println("Reverse Array :");
        for ( int i = 0 ; i < len ; i++){
            arr_new[i] = arr[len -  i - 1];
            System.out.print(arr_new[i]+" " );
        }
    }
}

class Test7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array : ");
        int [] Arr = new int [n];
        for ( int i = 0 ; i < n ; i ++ ) {
            Arr [i] = sc.nextInt();
        }
        ReverseArray.reverse(Arr,Arr.length);
    }
}
