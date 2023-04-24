 class Vol{
    int l; 
    int w;
    static int h;
 }
class mainVol{

    public static void main(String[] args){
        Vol v= new Vol();

   int length=v.l;
//    
         v.w=30;
         System.out.println(v.l);
         System.out.println(v.w);
         System.out.print(Vol.h);
        
    }
 }