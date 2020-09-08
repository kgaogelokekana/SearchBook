package za.co.library.application;

import za.co.library.person.Person;
import za.co.library.person.Customer;
import za.co.library.person.Employee;
import za.co.library.book.Book;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class App{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
Customer customer = new Customer();
Employee employee = new Employee();
Person person = new Person();
Book book = new Book();


for(int a = 0;a < 6; a++){
System.out.println("WELCOME TO THE ABC LIBRARY"+"\n What can we do for you today? \n 1.Add Book \n 2.Rent Book \n 3.Register New Member \n 4.Return Book 5.Print Renting History \n 6.Exit");

//MENU OPTION1
int option = scan.nextInt();
if(option == 1){
System.out.println("<<<ADD BOOK>>>"+" Enter Book Title:");
book.setTitle(scan.nextLine());
System.out.println("Enter Publisher:");
person.setPublisher(scan.nextLine());
System.out.println("Enter Publishing Date:");
book.setPublishingDate(scan.nextLine());
System.out.println("Enter Author:");
person.setAuthor(scan.nextLine());
System.out.println("Enter ISBN Number:");
book.setIsbnNumber(scan.nextInt());

//MENU OPTION2
}else if(option == 2){
System.out.println("RENT BOOK \n"+"\n Enter ID Number:");
customer.setIdNumber(scan.nextInt());
System.out.println("Enter ISBN Number");
book.setIsbnNumber(scan.nextInt());
System.out.println("Number of Rental Days:");
book.setRentalDays(scan.nextInt());

int number =  scan.nextInt();
ArrayList <Double> pricez = new ArrayList <> ();
pricez.add(0.00);
pricez.add(7.50);
pricez.add(15.00);
pricez.add(22.50);
pricez.add(30.00);
pricez.add(37.50);

System.out.println("Enter ID Number:"+customer.getIdNumber());
System.out.println("Enter ISBN Number" + book.getIsbnNumber());
System.out.println("Number of Rental Days:" + book.getRentalDays());
System.out.println("\n Total Amount:" + pricez.get(number));

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
book.setIsbnNumber(scan.nextInt());
System.out.println("Days OverDue:");

int number1 = scan.nextInt();
ArrayList <Double> prices = new ArrayList <> ();
prices.add(0.00);
prices.add(7.50);
prices.add(15.75);
prices.add(23.63);
prices.add(31.50);
prices.add(39.38);

System.out.println("\n Total Amount Owing: R" + prices.get(number1));


//MENU OPTION5
}else if(option == 5){
System.out.println("PRINT RENTING HISTORY \n");
System.out.println(" \n <<<BOOKS>>>");
book.record();
//System.out.println(customer.getTitle() + customer.getIsbnNumber() + numbers[number]);

}else{
break;
}


}

}

}
