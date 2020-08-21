import java.util.Scanner;
class Library2{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);

for(int a = 0;a < 6; a++){
System.out.println("WELCOME TO ABC LIBRARY");
System.out.println("\n 1.Add Book \n 2.Rent Book \n 3.Register Member \n 4.Return Book \n 5.Print Renting History \n 6.Exit System  \n \n Enter Option Number:");

int a1 = scan.nextInt();

switch(a1){
case 1:
 System.out.println("ADD NEW BOOK");
 System.out.println("\n Enter Title: ");
 String ttle = scan.nextLine();
 System.out.println("Enter Publisher:");
 String publisher = scan.nextLine();
 System.out.println("Enter Published Date:");
 String published = scan.nextLine();
 System.out.println("Enter Author:");
 String author = scan.nextLine();
 System.out.println("Enter ISBN Number:");
 String isbn = scan.nextLine();
 break;

case 2:
 System.out.println("RENT BOOK \n");
 System.out.println("Enter ID Number");
 String id = scan.nextLine();
 System.out.println("Enter ISBN Number");
 String isbn2 = scan.nextLine();
 System.out.println("Number of Rental Days:");
 String days = scan.nextLine();

 int number = scan.nextInt();
 double numbers[] = new double[6];
 numbers[0] = 0.00;
 numbers[1] = 7.50;
 numbers[2] = 15.00;
 numbers[3] = 22.50;
 numbers[4] = 30.00;
 numbers[5] = 37.50;

 System.out.println("\n Total to paid:" + numbers[number]);
 break;

case 3:
 System.out.println("REGISTER MEMBER \n");
 System.out.println("Enter Surname:");
 String surname = scan.nextLine();
 System.out.println("Enter firstname:");
 String firstname = scan.nextLine();
 System.out.println("Enter ID Number:");
 String id2 = scan.nextLine();
 System.out.println("Enter Gender:");
 String gender = scan.nextLine();
 System.out.println("Enter Age:");
 String age = scan.nextLine();
 System.out.println("Enter Address:");
 String address = scan.nextLine();
 System.out.println("Enter Email:");
 String email = scan.nextLine();
 break;

case 4:
 System.out.println("RETURN BOOK \n");
 System.out.println("Enter ID Number");
 String id3 = scan.nextLine();
 System.out.println("Enter ISBN Number:");
 String isbn3 = scan.nextLine();
 System.out.println("Days OverDue?");
 String overdue = scan.nextLine();
 
 int number1 = scan.nextInt();
 double numberz[] = new double[6];
 numberz[0] = 0.00;
 numberz[1] = 7.50;
 numberz[2] = 15.75;
 numberz[3] = 23.63;
 numberz[4] = 31.50;
 numberz[5] = 39.38;

 System.out.println("\n Total To Paid: R" + number1);
 break;

case 5:
 System.out.println("PRINT RENTING HISTORY \n");
 System.out.println("Enter ID Number");
 String id4 = scan.nextLine();
 System.out.println(" \n BOOKS");
 System.out.println("Title                           ISBN                         AMOUNT");
 System.out.println("\nRound THe World in 80 days       ISBN820037837                 R45.60");
 System.out.println("Another Day In Pretoria            ISBN423037889                 R980.00");
 System.out.println("ABC                                ISBN826237837                 R123.89");
 System.out.println("XYZ The World in 80 Days           ISBN539437837                 R15.23");
 System.out.println("The Best Java Programmer           ISBN320007832                 R46.60");
 break;}

if(a1 ==6){
break;}

continue;


}
}
}
