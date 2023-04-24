import java.io.*;
import java.util.Scanner;
class array{
   public static void main(String[] args) {
    
    Scanner obj= new Scanner(System.in);
System.out.print("enter the size of an array:");
    int size=obj.nextInt();

        int arr[];
        arr=new int[size];

        System.out.print("Enter the element of an array:");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print("  "+arr[i]+" ");
        }

   }
}