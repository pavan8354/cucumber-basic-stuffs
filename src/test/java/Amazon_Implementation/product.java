package Amazon_Implementation;

import java.util.ArrayList;
import java.util.List;

public class product {
	private String productname;
	private int price;

	public product(String productname, int price) {
		
		this.productname = productname;
		this.price = price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getproductlist(){
		
		List<String> productlist =new ArrayList<>();
		
		productlist.add("Apple Mac Book");
		productlist.add("Apple Mac Book");
		productlist.add("Philips");
		
		return productlist;
		
	}
}
