/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extracredit_csc229;

/**
 *
 * @author maazh
 */
public class solution {
    
    //This solution is linear since we iterate through 
    //the array and check for two smallest and the largest numbers
    static void findRatio(int arr[])
    {
        int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE, arr_size = arr.length;
        int firstLarge = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        
        if (arr_size < 4){
            System.out.println(" The size should be larger than 4 elements!");
            return;
        }
        
        for (int i = 0; i < arr_size ; i ++){
            if (arr[i] < firstSmall){
                
                secondSmall = firstSmall;
                firstSmall = arr[i];
            }
            else if (arr[i] < secondSmall ){
                secondSmall = arr[i];
            }
            
            if(arr[i] > firstLarge){
                
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if (arr[i] > secondLarge ){
                secondLarge = arr[i];
            }   
        }
        
        float num = firstLarge + secondLarge;
            num = num/(firstSmall + secondSmall);
        
        System.out.println("The ratio is (" + firstLarge + "+" + secondLarge + ")/(" +
                               firstSmall + "+" + secondSmall + ") = " + num);
    }
    
    public static void main(String[] args) {
        
        int[] a = {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        
         findRatio(a);
    }
    
}
