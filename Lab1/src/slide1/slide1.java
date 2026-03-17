package slide1;

import java.util.ArrayList;

public class slide1 {
	public static void main(String[] args) {
		ArrayList<Product> dsProduct = new ArrayList<Product>();
		ImportedProdut iP = new ImportedProdut();
		iP.setId("A1");
		iP.setName("Ao thun");
		iP.setBasePrice(10);
		iP.SetTaxRate(0.1);
		iP.SetShippingFee(2);
		dsProduct.add(iP);
		
		ImportedProdut iP2 = new ImportedProdut();
		iP2.setId("Q!");
		iP2.setName("Quan thun");
		iP2.setBasePrice(15);
		iP2.SetTaxRate(0.2);
		iP2.SetShippingFee(1);
		dsProduct.add(iP2);
		
		for(int i=0;i<2;i++) {
			ImportedProductDAO iP3=new ImportedProductDAO();
			iP3.NewImportedProdut();
			dsProduct.add(iP3);
		}
		
		for(Product p : dsProduct) {
			System.out.println(p.toString());
		}
	}
}
