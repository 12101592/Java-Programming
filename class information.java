import java.util.Scanner;
class infer{
 int num1, num2;
   infer(){
    Scanner sc= new Scanner(System.in);
    num1=sc.nextInt();
    num2=sc.nextInt();
  }

  int calculate(){

    
      int  res= num1*num2;
     return (res);
  }
}

class main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        infer info= new infer(); //class of object
           info.calculate();
        
        
    }
}