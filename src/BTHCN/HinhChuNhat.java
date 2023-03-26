package BTHCN;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float cd) throws Exception {
		if(cd>0) {
			this.chieuDai=cd;
		} else throw new Exception("chieu dai phai lon hon 0");
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float cr) throws Exception {
		if(cr>0) {
			this.chieuRong = cr;
		}else throw new Exception("chieu rong phai lon hon 0");
	
	}
	
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(float chieuDai, float chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public float getCV() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public float getDT() {
		return getChieuDai()*getChieuRong();
	}
	
	

}
