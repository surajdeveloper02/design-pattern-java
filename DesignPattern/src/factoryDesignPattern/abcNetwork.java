package factoryDesignPattern;

public class abcNetwork extends cellularPlan {

	@Override
	void getRate() {
		rate=1.50;
		System.out.println("rate : "+rate);
	}

}
