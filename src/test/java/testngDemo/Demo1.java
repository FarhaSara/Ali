package testngDemo;

public class Demo1 {

	int rollno=10;  
	String name="farhat";

	Demo1(int rollno,String name){ 
	this.rollno=rollno;  
	this.name=name;   
	} 
	 
	void display(){
	System.out.println();
	System.out.println(rollno+" "+name); 
	}  
	  
	public static void main(String args[]){  
	Demo1 s1=new Demo1(111,"ankit");  
	s1.display();   
	} 
}
