



import java.util.Scanner;
class new_me{


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();
        char c= sc.next().charAt(0);

int count=0;
 for(int i=0;0<s.length();i++){
if(s.charAt(i)==c){
    count++;
}

 }
 System.out.print(count);

        
    }
}