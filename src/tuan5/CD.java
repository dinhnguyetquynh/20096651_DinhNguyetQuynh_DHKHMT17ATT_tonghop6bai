package tuan5;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBH;
	private double giaThanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int ma) throws Exception {
		if(ma>0) {
			this.maCD=ma;
		}else throw new Exception("ma >0");
	}
	
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if(tua!=null) {
			this.tuaCD=tua;
		}else throw new Exception("tua khong de trong");
	}
	
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int so) throws Exception {
		if(so>0) {
			this.soBH=so;
		}else throw new Exception("So bh >0");
	}
	
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double gia) throws Exception {
		if(gia>0) {
			this.giaThanh=gia;
		}else throw new Exception("gia>0");
	}
	public CD() {
		super();
	}
	public CD(int ma, String tua, int so, double gia) throws Exception {
		if(ma>0) {
			this.maCD=ma;
		}else throw new Exception("ma >0");
	    
		if(tua!=null) {
			this.tuaCD=tua;
		}else throw new Exception("tua khong de trong");
		
		if(so>0) {
			this.soBH=so;
		}else throw new Exception("So bh >0");
		
		if(gia>0) {
			this.giaThanh=gia;
		}else throw new Exception("gia>0");
}
	Locale lc = new Locale("vi","VN");
	NumberFormat nf= NumberFormat.getCurrencyInstance(lc);
 
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|",getMaCD(),getTuaCD(),getSoBH(),nf.format(getGiaThanh()));
		return s;
	}
	
	

}
