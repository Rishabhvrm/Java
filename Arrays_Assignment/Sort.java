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
public class Sort {
    static void insertionsort (int [] arr, int n) {  // insertion sort
        for (int j = 1 ; j < n ; j ++) { 
            int key = arr[j];
            int i = j - 1;
            while ( i >= 0 && arr[i] > key) {
                arr[i + 1] = arr [i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        System.out.println("Sorted Array is : ");
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
}

class Test3 {
    public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of Elements : ");
      int n = sc.nextInt();
      int [] Arr = new int [n];
      for (int i = 0 ; i < n ; i ++) {
          Arr[i] = sc.nextInt();
      }
      Sort.insertionsort(Arr,n);
    }
}
