package factorymethod;

public class GoatCheese extends FarmProduct {

	@Override
	public void prepare() {
		System.out.println("Preparing cow cheese");
	}

}
