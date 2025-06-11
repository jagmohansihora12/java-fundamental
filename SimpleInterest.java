import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The Principal:");
double Principal = sc.nextDouble();
System.out.println("The Rate:");
double Rate = sc.nextDouble();
System.out.println("The Time:");
double Time = sc.nextDouble();
double SimpleInterest = (Principal * Rate * Time) / 100;
System.out.println("The Simple Interest :" + SimpleInterest);
sc.close();
}
}