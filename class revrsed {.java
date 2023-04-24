

class revrsed {
    static int num_rev(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=n;
    
        }
        return rev;
    }
     public static void main(string[] args) {
        int n=2015;
        System.out.print("reverse number= "+num_rev(n));
        
    }
    
    
    }
    