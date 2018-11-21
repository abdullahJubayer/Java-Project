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
public class DepositC implements Deposit {
    private static double U_Balance1=0;
    private static double U_Balance2=0;
    private static double U_Balance3=0;
    private static double U_Balance4=0;
    Scanner in=new Scanner(System.in);
    @Override
    public void Usr_Deposit1() {
        System.out.print("How Much you want to Deposit:");
        double b=in.nextDouble();
        U_Balance1=U_Balance1+b;
        System.out.println(U_Balance1+" Deposit Successfull");
    }

    @Override
    public void Usr_Deposit2() {
         System.out.println("How Much you want to Deposit:");
        double b=in.nextDouble();
        U_Balance2=U_Balance2+b;
        System.out.println(U_Balance2+" Deposit Successfull");
    }

    @Override
    public void Usr_Deposit3() {
        System.out.println("How Much you want to Deposit:");
        double b=in.nextDouble();
        U_Balance3=U_Balance3+b;
        System.out.println(U_Balance3+" Deposit Successfull");
    }

    @Override
    public void Usr_Deposit4() {
        System.out.println("How Much you want to Deposit:");
        double b=in.nextDouble();
        U_Balance4=U_Balance4+b;
        System.out.println(U_Balance4+" Deposit Successfull");
    }
    
}
