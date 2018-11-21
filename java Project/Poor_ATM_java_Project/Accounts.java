package newpackage;
import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class Accounts {
    protected static final int USR_A1=123;
    private static final int USR_A2=456;
    private static final int USR_A3=789;
    private static final int USR_A4=000;
    protected static final String USR_P1="123s";
    private static final String USR_P2="123";
    private static final String USR_P3="123";
    private static final String USR_P4="123";
    Scanner in=new Scanner(System.in);
    private Accounts(){
        
    }
    private static Accounts Re=null;
    DepositC Oj=new DepositC();
     void Usr1(){
            try {
            System.out.print("Enter Your Account_NO:");
            int a=in.nextInt();
            if(a==USR_A1){
                System.out.print("Enter Your Password:");
                in.nextLine();
                String b=in.nextLine();
                if(b.equals(USR_P1)){
                    //System.out.println("Login Successfull");
                    Oj.Usr_Deposit1();
                }
                else{
                    System.out.println("Wrong Password");
                }
            }
            else{
                System.out.println("You Have No Accounts");
            }
        }catch (Exception e) {
                System.err.println("Exception Found in Usr_1 Method");
            }
     }
       void Usr2(){
            try {
            System.out.print("Enter Your Account_NO:");
            int a=in.nextInt();
            if(a==USR_A2){
                System.out.print("Enter Your Password:");
                in.nextLine();
                String b=in.nextLine();
                if(b.equals(USR_P2)){
                    //System.out.println("Login Successfull");
                    
                }
                else{
                    System.out.println("Wrong Password");
                }
            }
            else{
                System.out.println("You Have No Accounts");
            
        }
     }catch (Exception e) {
                System.err.println("Exception Found in Usr_2 Method");
            }
  }
        void Usr3(){
            try {
            System.out.print("Enter Your Account_NO:");
            int a=in.nextInt();
            if(a==USR_A3){
                System.out.print("Enter Your Password:");
                in.nextLine();
                String b=in.nextLine();
                if(b.equals(USR_P3)){
                   // System.out.println("Login Successfull");
                    
                }
                else{
                    System.out.println("Wrong Password");
                }
            }
            else{
                System.out.println("You Have No Accounts");
            
        }
     }catch (Exception e) {
                System.err.println("Exception Found in Usr_3 Method");
            }
  }
         void Usr4(){
            try {
            System.out.print("Enter Your Account_NO:");
            int a=in.nextInt();
            if(a==USR_A4){
                System.out.print("Enter Your Password:");
                in.nextLine();
                String b=in.nextLine();
                if(b.equals(USR_P4)){
                   // System.out.println("Login Successfull");
                    
                }
                else{
                    System.out.println("Wrong Password");
                }
            }
            else{
                System.out.println("You Have No Accounts");
            
        }
     }catch (Exception e) {
                System.err.println("Exception Found in Usr_4 Method");
            }
  }
      public static Accounts factory(){
           if(Re==null){
               Re = new Accounts();
           }
           return Re;
       }
} 