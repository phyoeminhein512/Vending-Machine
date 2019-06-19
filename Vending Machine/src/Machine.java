
public class Machine {
	private String drink;
	private int price;
	private int money;
	
	public int change(int money){
	    return money - price;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	Machine(String drink, int price) {
		this.drink = drink;
		this.price = price;

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


}
