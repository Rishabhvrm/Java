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
public class PresentOrNot {
    public static void Findx(int[] arr, int a) {
        int len = arr.length;
        int position = -1;
        int flag = 0;
        for (int i = 0 ; i < len ; i++) {
            if (arr[i] == a) {
                flag = 1;
                position = i;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Element found at position : " + position);
        else
            System.out.println("Element not found. ");
    }
}
class Test2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arr = {12,3,24,54,64,34,2,25,7};
        System.out.print("Enter the number you want to find : ");
        int x = sc.nextInt();
        PresentOrNot.Findx(Arr,x);
        }
    }

