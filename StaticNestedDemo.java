class outer{
    static int x= 10;
     int y= 20;
      private static int =40;
      static class inner{
        void print(){
            System.out.println(x);
outer obj= new outer();
            // System.out.println(obj.y);
            System.out.println(z);
        }
      }
}
public class StaticNestedDemo {

    public static void main(String[] args) {
        
         outer.inner it= new outer.inner();
          it.print();
          outer obj= new outer();
          System.out.println(obj.y);
       
    }
}
