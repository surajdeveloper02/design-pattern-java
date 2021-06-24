package factoryDesignPattern;

import java.util.Scanner;

public class phoneBill {
	public static void main(String[]  ar) {
		Scanner sc = new Scanner(System.in);
		String network ;
		int min = Integer.MIN_VALUE;
		System.out.println("Please enter your network Name : ");
		network = sc.next();
		System.out.println("Please enter your min: ");
		min = sc.nextInt();
		selectNetworkFactory factory = new selectNetworkFactory();
		cellularPlan plan =factory.getPlan(network);
	    plan.getRate();	
        plan.processBill(min);
		
		
		
		
	}

}
