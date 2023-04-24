import java.util.Scanner;
class sum_digits{


    public static void main(String[] args){
     
        Scanner obj= new Scanner(System.in);
        int num= obj.nextInt();
        int sum=0;

        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }

        System.out.print(sum);

    }
}