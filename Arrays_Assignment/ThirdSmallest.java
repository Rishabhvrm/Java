/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author RISHAB
 */
public class ThirdSmallest {
    static void third_smallest (int [] arr, int len ) {
        Arrays.sort(arr);
        System.out.println("3rd smallest element is : " + arr[2]);
    }
}

class Test8 {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array with non repeating Elements : ");
        int [] Arr = new int [n];
        for (int i = 0; i < n ; i++) {
            Arr[i] = sc.nextInt();
        }
        ThirdSmallest.third_smallest(Arr,Arr.length);
    }
}
