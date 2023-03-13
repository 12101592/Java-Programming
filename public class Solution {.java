import java.util.Scanner;
class Solutionqq {

   
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
           
          int n=sc.nextInt();


          if(n<10||n>100){

            System.out.print("Invalid Input");
          }
          else
          {

            int first=n/10;
            int last= n%10;
            int sum= first+last;
             int pro= first*last;
              

             if((sum+pro)==n){
                System.out.print("Special two digit number");
             }
             else{

                System.out.print("Not a special two digit number");
             }
          }


        
    }
 }