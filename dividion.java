class dividion{
    public static void main(String[] args) {
        int x=2;
         for(int i=1;i<=x;i++){
            if(x%i==0){
                i+=i;
                System.out.print(i);
            }
            
         }
    }
}