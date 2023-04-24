class even_odd{
static int reverse(int num){
int rev=0;
while(num>0){
    rev=rev*10+num%10;
    num/=num;
}
return rev;

}
public static void main(String[] args){
    int num=1201;
    System.out.print("Reverse number = "+reverse(num));
}
}