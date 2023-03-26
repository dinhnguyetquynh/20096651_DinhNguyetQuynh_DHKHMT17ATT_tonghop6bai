package TUAN2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception {
		if(ma!="") {
			this.maCD=ma;
		}else throw new Exception("ma khong duoc bo trong");
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if(tua!="") {
			this.tuaCD=tua;
		}else throw new Exception("tua khong de trong");
		
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngay) throws Exception {
		if(ngay!=null) {
			this.ngayPH=ngay;
		}else throw new Exception("ngay khong de trong");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double gia) {
		this.donGia = gia;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int so) throws Exception {
	       if(so>0) {
		        this.soBH=so;
	       }else throw new Exception("so bai hat phai >0");
	}
	
	//dinh dang thoi gian
	
	
	public CD() {
		Calendar c1= Calendar.getInstance();
		this.maCD="x001";
		this.tuaCD="mua ha";
		this.ngayPH=c1;
		this.donGia=10000;
		this.soBH=0;
	
	}
	public CD(String ma, String tua, Calendar ngay, double gia, int so) throws Exception {
	
		if(ma!="") {
			this.maCD=ma;
		}else throw new Exception("ma khong duoc bo trong");
		
		if(tua!="") {
			this.tuaCD=tua;
		}else throw new Exception("tua khong de trong");
		
		if(ngay!=null) {
			this.ngayPH=ngay;
		}else throw new Exception("ngay khong de trong");
	    
		
		this.donGia = gia;
		if(so>0) {
	        this.soBH=so;
       }else throw new Exception("so bai hat phai >0");
		
	}
	
	public double getThanhTien() {
		return getDonGia()*getSoBH();
	}
	
	public void tieuDe() {
		System.out.println("TIEU DE");
		for(int i=0;i<=80;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%15s|%12s|%10s|%10s|%15s|","MaCD","TuaCD","Ngay","DonGia","SoBH","ThanhTien");
		System.out.println();
		for (int i=0;i<=80;i++) {
			System.out.printf("-");
		}
	}
	
	Locale lc= new Locale("vi","VN");
	DateFormat df = DateFormat.getDateInstance(1, lc);
	NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
	
	
	@Override
	public String toString() {
		String s="";
		System.out.println();
		s+=s.format("|%10s|%15s|%12s|%10s|%10s|%15s|",getMaCD(),getTuaCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
		return s;
	}
	
	
	

}
