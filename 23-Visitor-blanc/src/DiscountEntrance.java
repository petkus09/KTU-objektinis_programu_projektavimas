
public class DiscountEntrance implements EntranceType {

	double baseCost = 0;
	
	public DiscountEntrance(double price){
		baseCost = price;
		System.out.println("Entrance with discount cost: " + baseCost);
		
	}
	
	public double getCost(){
		return baseCost;
	}

	@Override
	public double addTariff(PaymentMethod tariff) {
		return tariff.calculateEntrance(this);
	}	
	
}
