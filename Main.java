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
		//CypherPrinter.Component CP = CypherPrinter.newComponent(new CypherPrinterImpl());
		CypherPrinter.Component CP = new CypherPrinter.Component(
				new CypherPrinterImpl(),
				new CypherPrinter.Bridge(){});
		
		CP.cypheAndPrint().send("azertypP");
		
		Cyphezv1.Component C1 = new Cyphezv1.Component(
				new Cyphezv1Impl(),
				new Cyphezv1.Bridge(){});
		
		C1.cyphez().send("cyphezc1" + "     " + "lqsdiugblqsdfbviqsdbql");
		
		Cyphezv2.Component C2 = new Cyphezv2.Component(
				new Cyphezv2Impl(),
				new Cyphezv2.Bridge(){});
		
		C2.cyphez().send("cyphezc2" + "     " + "lqsdiugblqsdfbviqsdbql");
		
		
		
		
	}
}
