import java.util.Scanner;
public class Add{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The first number is:");
int a = sc.nextInt();
System.out.println("The second number is:");
int b = sc.nextInt();
int c = a+b;
System.out.println("The sum is :" + c);
sc.close();
}
}