import java.util.Scanner;
class Solution{


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int acc=obj.nextLong();
        nextLine();
        String name=obj.nextLine();
        char gender=obj.next().charAt(0);
        int amount=obj.nextInt();
        int balance=20000;

        if(gender=='M' && amount>balance){

            System.out.println("Hi Mr."+name+"!\nInsufficient Funds! You can not withdraw "+amount+".");

        }
        else if(gender=='F' && amount>balance){
            System.out.println("Hi Ms."+name+"!\nInsufficient Funds! You can not withdraw "+amount+".");

        }
        else if(gender=='M'){
            int rem=balance-amount;
            System.out.println("Hi Mr."+name+"!\n Your Account Balance after withdrawl is "+rem+".");

        }
        else if(gender=='F'){
            int rem1=balance-amount;
            System.out.println("Hi Ms."+name+"!\n Your Account Balance after withdrawl is "+rem1+".");

        }
        
    }
}