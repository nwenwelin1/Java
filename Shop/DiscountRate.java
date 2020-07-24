package prj2;

public class DiscountRate {
	public static String memberType;
	static double serviceDiscountPlatinum=0.2;
	static double serviceDiscountSilver=0.1;
	static double serviceDiscountGold=0.15;
	static double productDiscountPlatinum=0.1;
	static double productDiscountSilver=0.1;
	static double productDiscountGold=0.1;
	
	static double getServiceDiscountRate(String memberType) {
		if(memberType == "platinum") {
			return serviceDiscountPlatinum;
		}
		else if(memberType == "sliver") {
			return serviceDiscountSilver;
		}
		else {
			return serviceDiscountGold;
		}
	}
	static double getProductDiscountRate(String memberType) {
		if(memberType == "platinum") {
			return productDiscountPlatinum;
		}
		else if(memberType == "sliver") {
			return productDiscountSilver;
		}
		else {
			return productDiscountGold;
		}
	}
}
