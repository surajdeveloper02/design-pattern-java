package factoryDesignPattern;

abstract class cellularPlan {
	double rate ;
	
	abstract void getRate();
	public void processBill(int min ) {
	
		System.out.println(" Your total bill amount : "+min*rate);
		
	}

}
