import java.util.Scanner;
public class Parameter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The Length is:");
double Length = sc.nextDouble();
System.out.println("The width is:");
double width = sc.nextDouble();
double Perimeter = 2 * (Length + width);
System.out.println("The Perimeter is :" + Perimeter);
sc.close();
}
}