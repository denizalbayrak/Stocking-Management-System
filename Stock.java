import java.util.HashMap;
import java.util.Map;

public class Stock {

	HashMap<String, Product> food ;
	HashMap<String, Product> drink ;
	HashMap<String, Product> other;

	//singleton
	private static Stock stock = new Stock(); 
	private Stock() {
		this.food = new HashMap<String, Product>();
		this.drink = new HashMap<String, Product>();
		this.other  = new HashMap<String, Product>();
	}
	public static Stock getStock() {
		return stock;
	}
	

	public HashMap<String, Product> getFood() {
		return food;
	}

	public void setFood(HashMap<String, Product> food) {
		this.food = food;
	}

	public HashMap<String, Product> getDrink() {
		return drink;
	}

	public void setDrink(HashMap<String, Product> drink) {
		this.drink = drink;
	}

	public HashMap<String, Product> getOther() {
		return other;
	}

	public void setOther(HashMap<String, Product> other) {
		this.other = other;
	}
	public String[][] getFoodString(){


		String[][] temp = new String[food.size()][3];
		int i = 0;
		for (Map.Entry<String, Product> element : food.entrySet()) {
			String[] temp2= new String[3];
			temp2[0]=element.getValue().getProductName();
			temp2[1]=Integer.toString(element.getValue().getNumberOfProduct());
			temp2[2]=element.getValue().getEntryDate().toString();

			for (int j = 0; j < 3; j++) {
				temp[i][j]=temp2[j];
			}
			i++;
		}

		return temp;

	}
	public String[][] getDrinkString(){

		String[][] temp = new String[drink.size()][3];
		int i = 0;
		for (Map.Entry<String, Product> element : drink.entrySet()) {
			String[] temp2= new String[3];
			temp2[0]=element.getValue().getProductName();
			temp2[1]=Integer.toString(element.getValue().getNumberOfProduct());
			temp2[2]=element.getValue().getEntryDate().toString();

			for (int j = 0; j < 3; j++) {
				temp[i][j]=temp2[j];
			}
			i++;
		}

		return temp;

	}
	public String[][] getOtherString(){

		String[][] temp = new String[other.size()][3];
		int i = 0;
		for (Map.Entry<String, Product> element : other.entrySet()) {
			String[] temp2= new String[3];
			temp2[0]=element.getValue().getProductName();
			temp2[1]=Integer.toString(element.getValue().getNumberOfProduct());
			temp2[2]=element.getValue().getEntryDate().toString();

			for (int j = 0; j < 3; j++) {
				temp[i][j]=temp2[j];
			}
			i++;
		}

		return temp;

	}

}
