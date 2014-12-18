
public class TeamEntrance implements EntranceType {


	double baseCost = 0;
	
	public TeamEntrance(double price){
		baseCost = price;
		System.out.println("Team entrance cost: " + baseCost);
	}
	
	public double etCost(){
		return baseCost;
	}

	@Override
	public double addTariff(PaymentMethod tariff) {
		return tariff.calculateEntrance(this);
	}	
			
	
}
