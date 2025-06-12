import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The Temperature in Celsius:");
double Temperature = sc.nextDouble();
double Fahrenheit = (Temperature * 9/5) + 32;
System.out.println("The Temperature in Fahrenheit :" + Fahrenheit);
sc.close();
}
}