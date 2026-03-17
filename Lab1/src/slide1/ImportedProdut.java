package slide1;


public class ImportedProdut extends Product{
	private double importTaxRate;
	private double shippingFee;
	
	public boolean SetTaxRate(double importTaxRate) {
		if(importTaxRate >=0 && importTaxRate <=1) {
			this.importTaxRate =importTaxRate;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean SetShippingFee(double shippingFee) {
		if(shippingFee >=0) {
			this.shippingFee=shippingFee;
			return true;
		}else {
			return false;
		}
	}
	
	

	public ImportedProdut(String id, String name, double basePrice) {
		super(id, name, basePrice);
	}
	public ImportedProdut() {
	    super("", "", 0);
	}

	@Override
	public double finalPrice() {
		return super.finalPrice() + super.finalPrice()*this.importTaxRate + this.shippingFee;
	}
	@Override
	public String toString() {
		return super.toString() + "ImportedProduct [importTaxRate=" + importTaxRate + ", shippingFee=" + shippingFee + "]";
 	}
}
