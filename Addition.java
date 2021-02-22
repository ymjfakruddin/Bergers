package berger;

public class  Addition {
	private String lettuce;
   private 	String tomato;
private String carrot;
private 	int lPrice;
	private int tPrice;
	private int cPrice;
	 Addition(String lettuce,String tomato,String carrot,int lPrice,int tPrice,int cPrice)
	{
	    this.lettuce = lettuce;
		this.tomato = tomato;
		this.carrot = carrot;
		this.lPrice = lPrice;
		this.tPrice = tPrice;
		this.cPrice = cPrice;
	}
	public String getLettuce() {
		return lettuce;
	}
	public void setLettuce(String lettuce) {
		this.lettuce = lettuce;
	}
	public String getTomato() {
		return tomato;
	}
	public void setTomato(String tomato) {
		this.tomato = tomato;
	}
	public String getCarrot() {
		return carrot;
	}
	public void setCarrot(String carrot) {
		this.carrot = carrot;
	}
	public int getlPrice() {
		return lPrice;
	}
	public void setlPrice(int lPrice) {
		this.lPrice = lPrice;
	}
	public int gettPrice() {
		return tPrice;
	}
	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	 
	 

}
