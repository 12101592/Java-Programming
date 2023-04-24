 import java.util.Scanner;
 import java.*;
 import java.lang.*;

 class  salary{
    
//  void get_Sal(){

//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter your salary");
//     int sal= sc.nextInt();
//  }

  salary(int sal){
    this.sal=sal;
  }

 }
 class Deduction{
int LAkh_5=5;
int LAkh_10=10;


    void showr(){
        if(sal<LAkh_5){
            int ded=(LAkh_5/100)*5
            int total = LAkh_10-ded;
            System.out.println("salary after deduction : "+total)
        }
        else if(sal>LAkh_10){
            int ded1=(LAkh_10/100)*10;
            int total2=LAkh_10-ded1;
            System.out.println("salary after deduction : "+total2)
        }
    }
    
 }
 class dirver{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int sall= sc. nextInt();
        salary s= new salary(sall);
        Deduction d= new Deduction();
           
        // s.get_Sal();
         d.showr();
    }
 }