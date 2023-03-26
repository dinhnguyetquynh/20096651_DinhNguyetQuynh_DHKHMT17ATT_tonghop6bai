package tuan3_Account;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long soTaiKhoan;
	private String tenTaiKhoan;
	private double soDu;
	private final double RATE = 0.035;
	
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(long soTK) throws Exception {
		if(soTK>0) {
			this.soTaiKhoan = soTK;
		}else throw new Exception("Loi ");
		
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTK) throws Exception {
		if(tenTK!=null) {
			this.tenTaiKhoan = tenTK;
		}else throw new Exception("Ten khong duoc rong");
		
	}
	
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double du) throws Exception {
		if(du>=5000) {
			this.soDu=du;
		}else throw new Exception("so du >=5000");
	}
	public double getRATE() {
		return RATE;
	}
	public Account() {
		// TODO Auto-generated constructor stub
		this.soTaiKhoan =999999 ;
		this.tenTaiKhoan = "chua xac dinh";
		this.soDu = 50000;
	}
	public Account(long soTK, String tenTK, double du) throws Exception {
		if(soTK>0) {
			this.soTaiKhoan = soTK;
		}else throw new Exception("Loi ");
		
		if(tenTK!=null) {
			this.tenTaiKhoan = tenTK;
		}else throw new Exception("Ten khong duoc rong");
		
		if(du>=5000) {
			this.soDu=du;
		}else throw new Exception("so du>=5000");
		
	}
	public Account(long soTK, String tenTK) throws Exception {
		if(soTK>0) {
			this.soTaiKhoan = soTK;
		}else throw new Exception("Loi ");
		
		if(tenTK!=null) {
			this.tenTaiKhoan = tenTK;
		}else throw new Exception("Ten khong duoc rong");
		
	 }
	public void tieuDe() {
		System.out.println("ACCOUNT");
		System.out.println();
		for(int i=0;i<=70;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%15s|%10s|","SoTK","HoTen","SoDu");
		System.out.println();
		for(int i=0;i<=70;i++) {
			System.out.printf("-");
		}
		System.out.println();
		
	}
	//dinh dang ngay thang, tien te
	Locale local = new Locale("vi", "vn");
	NumberFormat sf= NumberFormat.getCurrencyInstance(local);
	
	
	
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%15s|%10s|", getSoTaiKhoan(),getTenTaiKhoan(),sf.format(getSoDu()));
		return s;
	}
	
	
	
	
	

}
