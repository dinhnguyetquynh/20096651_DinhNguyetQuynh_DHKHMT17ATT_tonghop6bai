package tuan5;

import java.util.Scanner;

public class Test {
	public static CD nhap() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin cho CD:");
		System.out.println("Nhap ma CD");
		int maCD= sc.nextInt();
		System.out.println("Nhap tua CD: ");
		String tua = sc.nextLine();
		System.out.println("Nhap so bai hat: ");
		int soBH= sc.nextInt();
		System.out.println("Nhap gia: ");
		double gia = sc.nextDouble();
		CD cdr= new CD(maCD, tua, soBH, gia);
		return cdr;
		
	}
	public static void inCD() {
		for(int i=0;i<50;i++) {
			System.out.printf("=");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|\n","Ma","Tua","SoBH","Gia");
		for(int i=0;i<50;i++) {
			System.out.printf("=");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		ListCD ls=new ListCD(5);
		
		for(int i=0;i<3;i++) {
			ls.themCD(nhap());
		}
		inCD();
		System.out.println("Ket qua");
		ls.inKQ();
	}
	

}
