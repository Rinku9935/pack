package outerpack;
public class test
{
public void fun()
{
System.out.println("inside public");
}
private void fun1()
{
System.out.println("inside private");
}
protected void fun2()
{
System.out.println("inside protected mem");
}
void fun3()
{
System.out.println("inside default");
}
public void res()
{
fun1();
fun2();
fun3();
}}

