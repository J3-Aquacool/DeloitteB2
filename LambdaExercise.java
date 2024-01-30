package com.lamda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Products
{
int pid;
String proname;
String description;
double price;
String brand;
public Products(int pid, String proname, String description, double price,
		String brand) {
	super();
	this.pid = pid;
	this.proname = proname;
	this.description = description;
	this.price = price;
	this.brand = brand;
}
public int getPid() {
	return pid;
}
public String getProname() {
	return proname;
}
public String getDescription() {
	return description;
}
public double getPrice() {
	return price;
}
public String getBrand() {
	return brand;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setProname(String proname) {
	this.proname = proname;
}
public void setDescription(String description) {
	this.description = description;
}
public void setPrice(double price) {
	this.price = price;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Products [pid=" + pid + ", proname=" + proname + ", description="
			+ description + ", price=" + price + ", brand=" + brand + "]";
}

	
}


public class LambdaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		


		
		// Tasks to be performed
		// 1.Create an ArrayList of Products,you can add ur own data

		// 2. Sort by brands name ---> using lambda expression
		
		// 3. create one method which will print all elemnts in the list using lambda expression

		// 4. create a method that prints all products  whose brand name starts with  p   using lambda expression

		}


}

