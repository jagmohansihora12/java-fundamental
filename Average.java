import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The first no. is:");
double a = sc.nextDouble();
System.out.println("The second no. is:");
double b = sc.nextDouble();
System.out.println("The third no. is:");
double c = sc.nextDouble();
double Average = (a+b+c)/3;
System.out.println("The Average is :" + Average);
sc.close();
}
}