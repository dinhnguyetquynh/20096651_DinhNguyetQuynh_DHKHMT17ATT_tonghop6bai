package tuan5;



public class ListCD {
	CD[] ls;
	int count;
	public ListCD(int n) {
		ls = new CD[n];
		count =0;
	}
	public boolean themCD(CD cdr) {
		for(int i=0;i<count;i++) {
			if(cdr.getMaCD()==ls[i].getMaCD())
				return false;
		}
		ls[count]=cdr;
		count++;
		return true;
	}
	public void inKQ() {
		for (CD cdr : ls) {
			if(cdr!=null)
				System.out.println(cdr);
			
		}
	}
	
	public void tangKT() {
		if(ls.length==count) {
			CD[] tam = null;
			System.arraycopy(ls, 0, tam, 0, count);
			ls=tam;
		}
	}
	public void sapXep() {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				CD tam = null;
				if(ls[i].getMaCD()>ls[j].getMaCD()) {
					tam=ls[i];
					ls[i]=ls[j];
					ls[j]=tam;
				}
			}
		}
      }
	public int findCDbyMaCD(int ma) {
		int vt=-1;
		for(int i=0;i<ls.length;i++)
			if(ls[i].getMaCD()==ma)
				return i;
		return -1;
	}
	
	
	public boolean delete(int maCD) {
		int vt= findCDbyMaCD(maCD);
		if(vt==-1)
		return false;
		for(int i=vt;i<ls.length-1;i++)
			ls[i]=ls[i+1];
		return true;
	}

}
