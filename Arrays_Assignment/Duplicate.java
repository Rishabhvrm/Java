/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Arrays;

/**
 *
 * @author RISHAB
 */
public class Duplicate {
    static void find_duplicate(int [] arr, int len) {
        System.out.println("Duplicate Elements are : ");
        int [] new_arr = new int [len];
        int z = 0;
        for (int i = 0; i < len ; i++) {
            if (new_arr[z] != arr [i]){
            for (int j = i ; j < len - 1; j++) {
                if ( arr[i] == arr[1+j]) {
                    z ++ ; 
                    new_arr [z] = arr[i] ;
                    break;
                }
            }
        }
        }
        for (int i = 1 ; i <= z ; i++) {
            System.out.print(new_arr[i]+" ");
        }
    }
}

class Test6 {
    public static  void main (String [] args) {
        int [] Arr = {1,1,1,1,1,2,2,2,2,3,4,5,6,7,7,7,7,7,8,9,9,10};
        Duplicate.find_duplicate(Arr,Arr.length);
    }
}