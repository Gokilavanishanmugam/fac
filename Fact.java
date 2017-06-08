import java.io.*;
import java.util.*;
class Fact
{
int j=1;
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=1;i<=a;i++)
{
j=j*i;
}
System.out.println(j);
}
}
