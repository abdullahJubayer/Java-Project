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
public class Withdraw {
    Scanner Obj=new Scanner(System.in);
    DepositC SR=new DepositC();
    public Withdraw(double Balance) {
        System.out.println("How Much You Want to Cash out:");
        double b=Obj.nextDouble();
        Balance=Balance-b;
        System.out.println("Now You Have Only "+Balance+" Taka");
    }
    
}
