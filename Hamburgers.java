package berger;

public class Hamburgers {
int basePrice;
Addition ad;
public Hamburgers(int basePrice,Addition ad)
{
	this.basePrice = basePrice;
	this.ad = ad;
}
public static void main(String[] args) {
Addition ad = new Addition("lettuce ", null, null, 10, 0, 0);
	Hamburgers h = new Hamburgers(50,ad);
	int l = ad.getlPrice()+ad.getcPrice()+ad.gettPrice();

	finalPrize(h.basePrice,l);
	
}
private static void finalPrize(int basePrice, int l) {
	// TODO Auto-generated method stub
	System.out.println("Addition Items Cost     =   "+ l);
	System.out.println("Price  of  base Burger  =  "+basePrice);
	System.out.print("Total Price                       =  ");
	System.out.println(l+basePrice);
}
}
