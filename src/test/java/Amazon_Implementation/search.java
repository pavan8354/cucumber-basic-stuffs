package Amazon_Implementation;

public class search {

	
public String displaytheproduct(product productname) {
	
	if(productname.getproductlist().contains(productname.getProductname())) {
		
		return productname.getProductname();
	}
	return null;
	
}
	
	
	
}
