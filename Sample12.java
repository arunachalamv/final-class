final class Sample 
{
int a=7,b=6;
int c;
public void add()
{
c=a+b;
System.out.println("Answer is"+c);
}
}

class Sample1 extends Sample
{
public void add()
{
c=a-b;
System.out.println("Answer is"+c);
}
}

class Sample12
{
public static void main(String[] args)
{
Sample obj =new Sample();
Sample1 obj1 =new Sample1();
obj.add();
obj1.add();
}
}