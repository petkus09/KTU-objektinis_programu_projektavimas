
public class PaymentOnSpotMethod implements PaymentMethod {

	@Override
	public double calculateEntrance(SingleEntrance fee) {
		return fee.getCost() + 10;
		
	}

	@Override
	public double calculateEntrance(DiscountEntrance fee) {
		return fee.getCost() + 0;
	}

	@Override
	public double calculateEntrance(TeamEntrance fee) {
		return fee.etCost() + 5;
	}	
}
