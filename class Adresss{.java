class Address{
    String city, state;
Address(String city, String state){
    this.city=city; this.state=state;

}
}
class Student{
    int roll_No;
    String Name;
     String Add;
Student(int roll_No,String Name,String Add){
    this.roll_No=roll_No; this.Name=Name;this.Add=Add;
}
void show(){

    System.out.println(roll_No+" "+Name);
    System.out.println(Add.city+" "+Add.state);

}
public static void main(String[] args) {
    
    Address obj1= new Address("Jalandher","Punjab");
    Student st= new Student(10,"Afzal",obj1);
    st.show();
    
}
}

   