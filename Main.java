package main;

import implementation.CypherPrinterImpl;
import implementation.Cyphezv1Impl;
import implementation.Cyphezv2Impl;
import tp1Project.CypherPrinter;
import tp1Project.Cyphezv1;
import tp1Project.Cyphezv2;


public class Main {
	private String threeWords = "one, two words...";
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		julienListParam(args);
		Scanner x = new Scanner(System.in);
		int j= x.nextInt();
		System.out.println(j);
	}


	/**
	* @author: julien
	* to print on std out each param, separate by \n
	*/
	public static void julienListParam(String []args){
		for (int i = 0 ; i < args.lenght() ; i++)
			System.out.println(args[i]);
	}
	

}
