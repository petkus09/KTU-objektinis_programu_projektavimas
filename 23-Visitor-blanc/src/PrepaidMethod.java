
public class PrepaidMethod implements PaymentMethod {

	@Override
	public double calculateEntrance(SingleEntrance fee) {
		return fee.getCost() + 5;
		
	}

	@Override
	public double calculateEntrance(DiscountEntrance fee) {
		return fee.getCost() - 5;
	}

	@Override
	public double calculateEntrance(TeamEntrance fee) {
		return fee.etCost() + 0;
	}

}
