package tuan3_Account;

public class Test {
	public static void main(String[] args) throws Exception {
		Account ac= new Account();
		ac.tieuDe();
		System.out.println(ac);
		
		Account ac1 = new Account(72354, "Ted Murphy", 100000);
		System.out.println(ac1);
		
		Account ac2= new Account(69713, "Jane Smith", 40000);
		System.out.println(ac2);
		
		Account ac3= new Account(93757, "Edward Demsey", 700000);
		System.out.println(ac3);
		
	}
}
