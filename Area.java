import java.util.Scanner;
public class Area{
public static void main(String[] args){
double π = 3.14;
Scanner sc = new Scanner(System.in);
System.out.println("The Radius is:");
double Radius = sc.nextDouble();
double powerOfRadius = Math.pow(Radius,2);
double Area = π * powerOfRadius;
System.out.println("The Area is :" + Area);
sc.close();
}
}