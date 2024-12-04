package com.day1;
public class CommandAdd{
	public static void main(String args[]){
	if(args.length==2){
                int a = Integer.parseInt(args[0]);
		        int b = Integer.parseInt(args[1]);
		        int c = a+b;

		System.out.println("Addition = " + c);}
	else
		System.out.println("Insufficient!!!");
	}
}