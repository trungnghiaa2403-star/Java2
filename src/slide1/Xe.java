package slide1;

public class Xe {
	private String hangXe;
	private int namSanXuat;
	public String getHangXe() {
		return hangXe;
	}
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
    public void xuat() {
        System.out.println("Hang xe: "+this.hangXe);
        System.out.println("Nam san xuat: "+this.namSanXuat);
    }
	
	
}
