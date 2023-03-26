package tuan4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Test {
public static void main(String[] args) throws Exception {
	ListHTP list= new ListHTP();
	HangThucPham tp = new HangThucPham();
	tp.tieuDe();
	HangThucPham htp1= new HangThucPham("123", "aaa", new GregorianCalendar(2022,10,01), new GregorianCalendar(2023,01,05), 10000, 100);
	list.themHang(htp1);
	list.intKQ();
	
}
}
