package pilhas;

public class Pilhas {
	
	private class NO {
		int dado;
		NO prox;
	}
	
	NO topo;
	
	public void init() {
		topo=null;
	}

	public boolean isEmpty() {
		if(topo==null)
			return true;
		else
			return false;
	}
	
	public void push(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		novo.prox = topo;
		topo = novo;
	}
	
	
}
