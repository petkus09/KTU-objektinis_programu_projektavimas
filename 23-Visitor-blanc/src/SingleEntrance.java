
public class SingleEntrance implements EntranceType {

	double baseCost = 0;
	
	public SingleEntrance(double price){
		baseCost = price;
		System.out.println("Single person cost: " + baseCost);
	}
	
	public double getCost(){
		return baseCost;
	}

	@Override
	public double addTariff(PaymentMethod tariff) {
		return tariff.calculateEntrance(this);
	}
	

	
}
