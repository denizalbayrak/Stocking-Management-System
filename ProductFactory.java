
public class ProductFactory {
	

	public Product addProduct(Product product, String productType) {
		if(productType == null){
			return null;
			}
		if(productType.equalsIgnoreCase("Food")) {
			return new Food(product.getProductName(), product.getNumberOfProduct(),  product.getUnitPurchasePrice(),
					product.getUnitSalePrice());
		}
		else if(productType.equalsIgnoreCase("Drink")) {
			return new Drink(product.getProductName(), product.getNumberOfProduct(),  product.getUnitPurchasePrice(),
					product.getUnitSalePrice());
		}
		else if(productType.equalsIgnoreCase("Other")) {
			return new Other(product.getProductName(), product.getNumberOfProduct(),  product.getUnitPurchasePrice(),
					product.getUnitSalePrice());
		}
		return null;
		
		
	}

}
