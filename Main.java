package main;

import implementation.CypherPrinterImpl;
import implementation.Cyphezv1Impl;
import implementation.Cyphezv2Impl;
import tp1Project.CypherPrinter;
import tp1Project.Cyphezv1;
import tp1Project.Cyphezv2;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int j= x.nextInt();
		
		
		
	}

	public void julienListParam(String [] args)
	{

		String deb = args[0];
		for (int i =1;i<args.length;i++)
		{
			System.out.println("Param 1 " + args[i]);
		}

	}
}
