
public class VisitorApp {

	public static void main(String[] args){
	
		SingleEntrance method1 = new SingleEntrance(25);
		DiscountEntrance method2 = new DiscountEntrance(20);
		TeamEntrance method3 = new TeamEntrance(22);
		
		PrepaidMethod prepaidMethod = new PrepaidMethod();
	
		System.out.println("Prepaid entrance for single person: " + method1.addTariff(prepaidMethod) );
		System.out.println("Prepaid entrance with discount: " + method2.addTariff(prepaidMethod) );
		System.out.println("Prepaid entrance with team: " + method3.addTariff(prepaidMethod) );
		
		PaymentOnSpotMethod paymentOnSpotMethod = new PaymentOnSpotMethod();

		System.out.println("Paid on spot entrance for single person: " + method1.addTariff(paymentOnSpotMethod) );
		System.out.println("Paid on spot entrance with discount: " + method2.addTariff(paymentOnSpotMethod) );
		System.out.println("Paid on spot entrance with team: " + method3.addTariff(paymentOnSpotMethod) );
		
	
	}
	
}
