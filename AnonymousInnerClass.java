class triangle
{
void display()
{
System.out.println("Inside the class triangle");
}
}
class AnonymousInnerClass
{
public static void main(String[] args)
{
triangle objt= new triangle()
{
void display()
{
System.out.println("Inside the Anonymous class triangle");
}
};
objt.display();
}
}