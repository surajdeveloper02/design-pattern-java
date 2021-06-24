package factoryDesignPattern;

public class selectNetworkFactory {
	
	public cellularPlan getPlan(String network)
	{
		if(network == null) {
			return null;
		}
		else if(network.equalsIgnoreCase("abcNetwork")) {
			return new abcNetwork();
		}
		else if(network.equalsIgnoreCase("xyzNetwork")) {
			return new xyzNetwork();
		}else if(network.equalsIgnoreCase("pqrNetwork")) {
			return new pqrNetwork();
		}else {
			System.out.println("No factory found");
		}
		return null;
	}
}
