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
// assuming there'll only be a single number which is occuring odd numbers of times
public class OddOccurance {
    static int check_odd(int[] arr, int len) {
        int res = 0;
        for (int i = 0 ; i < len ; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}

class Test4{
    public static void main(String [] args) {
        int Arr[] = {1,2,2,3,3,1,4};
        int n = Arr.length;
        System.out.println(OddOccurance.check_odd(Arr,n));
    }
}