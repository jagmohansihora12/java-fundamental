import java.util.Scanner;
public class MilesConverter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The distance in Kilometer:");
double Kilometers = sc.nextDouble();
double Miles = Kilometers * 0.621371;
System.out.println("The distance in Miles :" + Miles);
sc.close();
}
}