import java.util.Scanner;
class Ques2{
    int f,di;
ar= new int[20];
Ques2(){
    Scanner sc=new Scanner(System.in);
    f=sc.nextInt();
    di=sc.nextInt();
}
void Disp(){

    for(int i=0;i<20;i++){
        ar[f]+=ar[di];
    }
    for(int j=0;j<20;j++){
        System.out.print(ar[j]+" ");
    }
}

}

class metho{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Ques2 q= new Ques2();
        q.Disp();
        
    }
}