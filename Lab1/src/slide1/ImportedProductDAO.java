package slide1;

import java.util.Scanner;

public class ImportedProductDAO extends ImportedProdut{
	Scanner s=new Scanner(System.in);
	private ImportedProdut importedProdut;
	public void NewImportedProdut() {
		String id;
		do {
			System.out.print("Nhap ID: ");
			id = s.nextLine();			
		}while(!this.setId(id));
		
		System.out.print("Nhap ten SP: ");
		this.setName(s.nextLine());
		
		do {
			System.out.print("Nhap gia SP: ");
			double basePrice = s.nextDouble();
			if(!this.setBasePrice(basePrice)) {
				System.out.println("Ban phai nhap gia >0");
			}else {
				break;
			}			
		}while(true);
		
		do {
			System.out.print("Nhap thue: ");
			double importTaxRate = s.nextDouble();
			if(!this.SetTaxRate(importTaxRate)) {
				System.out.println("Ban phai nhap thue tu 0-1");
			}else {
				break;
			}		
		}while(true);
		
		do {
			System.out.print("Nhap phi ship: ");
			double shippingFee = s.nextDouble();
			if(!this.SetShippingFee(shippingFee)) {
				System.out.println("Ban phai nhap phi ship >=0");
			}else {
				break;
			}		
		}while(true);
	}
}
