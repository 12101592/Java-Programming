import java.io.*;
import java.util.*;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        String s[];
        s= new String[N];
        int num,int str;
        for(int i=0;i<N;i++){
            s[i]=sc.nextLine();

        }
        if(N==0){
            System.out.println("Invalid");
        }
        else{

            for(int j=0;j<s.length;j++){
                try{
                    int k=Integer.parseInt(s[j]);
                     num++;
                }catch (NumberFormatException e){
                    str++;
                }
            }

            System.out.println(num+"\n"+str);
        }


    }
}