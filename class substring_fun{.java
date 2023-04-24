import java.util.Scanner;
class substring_fun{

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter the Charecter: ");
   char s1=sc.next().charAt(0);
   
// String vowels="A a E e I i O o U u";
if('A'||'a'||'E'||'e'||'I'||'i'||'O'||'o'||'U'||'u'==s1){
    System.out.print("Vowels ");
}
else{
    System.out.print("Consonant");
}

   
    }
}