import java.util.Scanner;
public class Volume{
public static void main(String[] args){
double π = 3.14;
Scanner sc = new Scanner(System.in);
System.out.println("The Radius is:");
double Radius = sc.nextDouble();
System.out.println("The Height is:");
double Height = sc.nextDouble();
double powerOfRadius = Math.pow(Radius,2);
double Volume = π * powerOfRadius * Height;
System.out.println("The Volume is :" + Volume);
sc.close();
}
}