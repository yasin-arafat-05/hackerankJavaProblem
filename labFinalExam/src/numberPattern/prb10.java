/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberPattern;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class prb10 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //----- 1st Part ---------
        for(int i=0;i<n;i++){
            int space=i;
            while(space-->0){
                System.out.print(" ");
            }
            int num=n-i;
            int prntNum = i+1;
            while(num-->0){
                System.out.print(prntNum+" ");
                prntNum++;
            }
            System.out.println("");
        }
        
        //----------- 2nd part ---------
        for(int i=n-2;i>=0;i--){
            int space=i;
            while(space-->0){
                System.out.print(" ");
            }
            int num=n-i;
            int prntNum = i+1;
            while(num-->0){
                System.out.print(prntNum+" ");
                prntNum++;
            }
            System.out.println("");
        }
    }
}
