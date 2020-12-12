import java.util.Scanner;

public class CurrencyConverter {
public static void main(String args[]) {
//declare variables
int amount;
String converter;
Scanner kboard = new Scanner(System.in);

System.out.println("Hello! I am a Currency Converter");
System.out.println("Please choose one option from the list.");
System.out.println("1.Dollar to Pound\n2.Dollar to Yen\n3.Dollar to Euro\n4.Dollar to Dinar");
//initialize variables
converter = kboard.nextLine();
System.out.println("Please enter the amount");
amount = kboard.nextInt();


if (converter.equalsIgnoreCase("Dollar to Pound")) {
System.out.println("Your amount is "+amount*1);
}

}
}
