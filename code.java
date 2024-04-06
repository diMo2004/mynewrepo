import java.util.*;
import java.lang.*;
public class code
{
  public static void main(String []args)
  {
    double a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextDouble();
    b=sc.nextDouble();
    double c=a*b;
    double d=a/b;
    double e=a+b;
    double f=a-b;
    double g=a%b;
    System.out.println(c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
    sc.close();
  }
}
