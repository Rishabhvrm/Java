/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientationassingment;

/**
 *
 * @author RISHAB
 */
public class MyInteger {
    int value;
    
    MyInteger(int value){
        this.value = value;
    }
    
    int getValue(){
        return value;
    }
    
    boolean isEven(){
        if(value % 2 == 0)
        {
            return true;
        }
    }    
    boolean isOdd(){
        if(value % 2 != 0)
        {
            return true;
        }
    } 
    boolean isPrime() {
        for (int x = 2 ; x < value/2; x++ )
        {
            return value % x != 0;
        }
    }
     static boolean isEven(int value){
        if(value % 2 == 0)
        {
            return true;
        }
    }    
    static boolean isOdd(int value){
        if(value % 2 != 0)
        {
            return true;
        }
    } 
    static boolean isPrime(int value) {
        for (int x = 2 ; x < value/2; x++ )
        {
            return value % x == 0;
        }
    }
