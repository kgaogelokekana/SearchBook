package za.co.library.application;

import za.co.library.person.Person;
import za.co.library.person.Customer;
import za.co.library.person.Employee;
import java.util.Scanner;

class App{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
Person person = new Person();
Customer customer = new Customer();
Employee employee = new Employee();

for(int a = 0;a < 6; a++){
System.out.println("WELCOME TO THE ABC LIBRARY"+"\n What can we do for you today? \n 1.Add Book \n 2.Rent Book \n 3.Register New Member \n 4.Return Book 5.Print Renting History \n 6.Exit");

//MENU OPTION1
int option = scan.nextInt();
if(option == 1){
System.out.println("<<<ADD BOOK>>>"+" Enter Book Title:");
customer.setTitle(scan.nextLine());
System.out.println("Enter Publisher:");
customer.setPublisher(scan.nextLine());
System.out.println("Enter Publishing Date:");
customer.setPublishingDate(scan.nextLine());
System.out.println("Enter Author:");
customer.setAuthor(scan.nextLine());
System.out.println("Enter ISBN Number:");
customer.setIsbnNumber(scan.nextInt());

//MENU OPTION2
}else if(option == 2){
System.out.println("RENT BOOK \n"+"\n Enter ID Number:");
customer.setIdNumber(scan.nextInt());
System.out.println("Enter ISBN Number");
customer.setIsbnNumber(scan.nextInt());
System.out.println("Number of Rental Days:");
customer.setRentalDays(scan.nextInt());

int number =  scan.nextInt();
double numbers[] = new double[6];
numbers[0] = 0.00;
numbers[1] = 7.50;
numbers[2] = 15.00;
numbers[3] = 22.50;
numbers[4] = 30.00;
numbers[5] = 37.50;

System.out.println("Enter ID Number:"+customer.getIdNumber());
System.out.println("Enter ISBN Number" + customer.getIsbnNumber());
System.out.println("Number of Rental Days:" + customer.getRentalDays());
System.out.println("\n Total Amount:" + numbers[number]);

//MENU OPTION3
}else if(option == 3){
System.out.println("REGISTER MEMBER \n "+" \n Enter Surname ");
customer.setSurName(scan.nextLine());
System.out.println("Enter firstname:");
customer.setFirstName(scan.nextLine());
System.out.println("Enter ID Number:");
customer.setIdNumber(scan.nextInt());
System.out.println("Enter Gender:");
customer.setGender(scan.nextLine());
System.out.println("Enter Age:");
customer.setAge(scan.nextInt());


System.out.println("Your Surname is:"+customer.getSurName());
System.out.println("Your Firstname is:"+customer.getFirstName());
System.out.println("Enter ID Number:"+customer.getIdNumber());
System.out.println("Enter Gender:"+customer.getGender());
System.out.println("Enter Age:"+customer.getAge());

//MENU OPTION4
}else if(option == 4){
System.out.println("RETURN BOOK \n"+" Enter ID Number:");
customer.setIdNumber(scan.nextInt());
System.out.println("Enter ISBN Number:");
customer.setIsbnNumber(scan.nextInt());
System.out.println("Days OverDue:");

int number1 = scan.nextInt();
double numberz[] = new double[6];
numberz[0] = 0.00;
numberz[1] = 7.50;
numberz[2] = 15.75;
numberz[3] = 23.63;
numberz[4] = 31.50;
numberz[5] = 39.38;

System.out.println("\n Total Amount Owing: R" + numberz[number1]);


//MENU OPTION5
}else if(option == 5){
System.out.println("PRINT RENTING HISTORY \n");
System.out.println(" \n <<<BOOKS>>>");
customer.record();
//System.out.println(customer.getTitle() + customer.getIsbnNumber() + numbers[number]);

}else{
break;
}


}

}

}
