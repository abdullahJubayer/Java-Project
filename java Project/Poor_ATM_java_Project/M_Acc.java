/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class M_Acc{
    Scanner in=new Scanner(System.in);
    M_Acc(){
        System.out.println("Enter Your Account No:");
        int s=in.nextInt();
        System.out.println("Enter Your Password:");
        String ar=in.nextLine();
        if(s==Accounts.USR_A1 && ar.equals(Accounts.USR_P1)){
            System.out.println("Login Successfull");
            Decoraton.DD();
        }
    }
}
