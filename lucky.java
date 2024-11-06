class Man 
{
public void house ()
{
System.out.println("HAVE A 2BHK HOUSE");
}
class Son extends man
{
public void car()
{
System.out.println(" HAVE AN SUPRA");
}
}
public class single{
public static void main ( string args [])
{
Son s = new Son();
s.house();
s.car();
}
}
