import outer.inner;

abstract class Marks {
int marks = 91;
abstract void printMarks();
}
class AnonymousDemo
{
public static void main(String[] args)
{
Marks oj1 = new Marks()
{
public void printMarks()
{
System.out.print("Marks is " + marks);
}
};
oj1.printMarks();
}
}