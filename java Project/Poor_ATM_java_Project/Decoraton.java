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
public class Decoraton {
    static void DD(){
        System.out.println("++=====Welcome to our JOJO Bank=======++");
        System.out.println("Main Manue\n1:For Know Balance\n2:For Deposit\n3:For WithDraw"
        +"\n4:For Exit");
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        switch(n){
            case 1:{
                
            }
            case 2:{
                Accounts.factory().Usr1();
            }
            case 3:{
                
            }
            case 4:{
                System.exit(0);
            }
        }
    }
}
