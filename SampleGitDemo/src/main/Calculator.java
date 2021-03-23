package main;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		add(30, 10);
	}
	
	public static void add(int num1,int num2){
	      System.out.println(num1+num2);
	  }
	
	public static void diff(int num1,int num2){
	      System.out.println(num1-num2);
	  }
	public static void prod(int num1,int num2){
	      System.out.println(num1*num2);
	  }
	public static void div(int num1,int num2){
	      System.out.println(num1/num2);
	  }

	public static void mod(int num1,int num2){
	      System.out.println(num1%num2);
	  }

	public static void square(int num){
	      System.out.println(num*num);
	  }
	public static void cube(int num){
	      System.out.println(num*num*num);
	  }
	
	public static void br1fun1(int num){
	      System.out.println("In br1 with "+num);
	  }
	public static void masterfun1(int num){
	      System.out.println("In master with "+num);
	  }



}
