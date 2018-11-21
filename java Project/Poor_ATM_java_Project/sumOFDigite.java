/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class sumOFDigite {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter any Numbers:");
         int m=in.nextInt();
         int temp=m;
         while(temp!=0){
        int r=temp%10;
        sum=sum+r;
         temp=temp/10;
        }
         System.out.println(sum);
        
    }
}
