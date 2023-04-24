import java.util.Scanner;
class plus_minus{

public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);

    System.out.print("enter first integar:");
    int num1=obj.nextInt();
    System.out.print("enter Second integar:");
    int num2=obj.nextInt();

    System.out.print("Select option\n1.Add\n2.Substract\n3.Mod\n4.Division\n");
    int opt=obj.nextInt();
    if(opt<=4){
switch(opt){
    case 1:
{
    System.out.println(num1+num2);
    break;}
    case 2:{
        System.out.println(num1-num2); 
        break;
    }
    case 3:{
        System.out.println(num1%num2); 
        break;
    }
    case 4:{
        System.out.println(num1/num2); 
        break;
    }

}

    }
}

}