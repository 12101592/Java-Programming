import java.util.Scanner;
class check_pos_neg_odd_even{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter a number:");
        int num=obj.nextInt();
        if(num%2==0 && num>0){
            System.out.print("Number is Even Positive");
        }
     else if(num%2==0 && num<0){
        System.out.print("Number is even negative");

     }
     else if(num%2!=0 && num>0){
        System.out.print("Number is odd posistive");
     }
     else if(num%2!=0 && num<0){
        System.out.print("Number is odd negative");
     }
     else {
        System.out.print("Zero");
     }

    }
}