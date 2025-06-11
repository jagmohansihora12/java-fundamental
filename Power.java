import java.util.Scanner;
public class Power{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The base is:");
double base = sc.nextDouble();
System.out.println("The exponent is:");
double exponent = sc.nextDouble();
double power = Math.pow(base,exponent);
System.out.println("The result is :" + power);
sc.close();
}
}