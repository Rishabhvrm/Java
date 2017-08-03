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
/* to find largest and smallest element in given array*/

public class LargestSmallest{
    public static void SmallandLarge(int[] Arr) {
        int len = Arr.length ;
        int min = Arr[0];
        int max = Arr[0];
        for (int i = 0; i < len ; i++ ) {
            if (min > Arr[i]) {
                min = Arr[i];
                }
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        System.out.println("Smallest number in the array is : "+min); 
        System.out.println("Largest number in the array is : "+max);
    }
}
 
class Test1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Array : ");
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        LargestSmallest.SmallandLarge(arr);
    }

    
}