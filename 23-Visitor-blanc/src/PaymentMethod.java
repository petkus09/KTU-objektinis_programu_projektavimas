
public interface PaymentMethod {

	public double calculateEntrance(SingleEntrance fee);
	public double calculateEntrance(DiscountEntrance fee);
	public double calculateEntrance(TeamEntrance fee);
	
}
