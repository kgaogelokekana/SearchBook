package za.co.library.person;

public class Person{

private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return title;
}

private String publisher;
public void setPublisher(String publisher){
this.publisher = publisher;
}
public String getPublisher(){
return publisher;
}

private String publishingDate;
public void setPublishingDate(String publishingDate){
this.publishingDate = publishingDate;
}
public String getPublishingDate(){
return publishingDate;
}

private String author;
public void setAuthor(String author){
this.author = author;
}
public String getAuthor(){
return author;
}

private long isbnNumber;
public void setIsbnNumber(long isbnNumber){
this.isbnNumber = isbnNumber;
}
public long getIsbnNumber(){
return isbnNumber;
}

private int idNumber;
public void setIdNumber(int idNumber){
this.idNumber = idNumber;
}
public int getIdNumber(){
return idNumber;
}

private String surName;
public void setSurName(String surName){
this.surName = surName;
}
public String getSurName(){
return surName;
}

private String firstName;
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}

private String gender;
public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
return gender;
}

private int age;
public void setAge(int age){
this.age = age;
}
public int getAge(){
return age;
}

private int rentalDays;
public void setRentalDays(int rentalDays){
this.rentalDays = rentalDays;
}
public int getRentalDays(){
return rentalDays;
}

public String record(){

System.out.println("Title                           ISBN                 AMOUNT");
System.out.println("Round THe World in 80 days   ISBN820037837  R45.60");
System.out.println("Another Day In Pretoria ISBN423037889 R980.00 ");
System.out.println(" ABC ISBN826237837 R123.89 ");
System.out.println(" XYZ The World in 80 Days ISBN539437837 R15.23 ");
return " The Best Java Programmer ISBN320007832 R46.60 ";

}

}
