package filas;

public class FilaInt {
	
	public final int N = 10;
	int [] dados = new int[N];
	int ini, fim, count;
	
	public void init() {
		ini = fim = count = 0;
	}
	
	public boolean isEmpty() {
		if(count==0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(count==N)
			return true;
		else
			return false;
	}
	
	public void enqueue(int elem) {
		if(!isFull()) {
			dados[fim]=elem;
			fim=(fim+1)%N;
			count++;
		} else {
			System.out.println("Fila cheia!");
		}
	}
	
	public int dequeue() {
		int aux = dados[ini];
		ini=(ini+1)%N;
		count --;
		return aux;
	}
	
	public int first() {
		return dados[ini];
	}
	

}
