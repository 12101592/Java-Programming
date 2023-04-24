import outer.inner;

abstract class marks{
    int m=10;
     abstract void display();
     abstract void print(){

     }
}

class ANONYMS{
    public static void main(String[] args) {
        
        marks mm = new marks(){
            void display(){
            System.out.print("Marks will be Displayed Shortly");}
        };
        mm.display();
    }
}
// create a class with data type int and print it in string forms?

