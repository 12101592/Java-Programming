import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int arr[];
          arr=new int[5];
          System.out.println("Enter the element of array: ");
           for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
           }
           try{
            System.out.println("Enter the index Number: ");
            int index=sc.nextInt();
            System.out.println(arr[index]);
           }catch(Exception e){
            System.out.print(e);
           }


    }
}
