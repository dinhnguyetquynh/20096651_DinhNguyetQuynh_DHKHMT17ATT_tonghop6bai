package tuan4;

import java.util.ArrayList;
import java.util.List;

public class ListHTP {
	List<HangThucPham> ls;
	public ListHTP() {
		ls = new ArrayList<HangThucPham>();
		
		
	}
	public boolean themHang(HangThucPham htp) {
		return ls.add(htp);
	}
	public List<HangThucPham> xuat(){
		return ls;
	}
	public void intKQ() {
		for (HangThucPham htp : ls) {
			System.out.println(htp);
			
		}
	}
	
	

}
