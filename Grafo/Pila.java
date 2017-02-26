import java.util.Scanner;
public class Pila{
	Scanner esc= new Scanner(System.in);

	private int[] pila;
	private int tope,n,max, t;
	

	public Pila(){
		max=10;
		pila = new int [max];
		tope=-1;
	}

	public Pila(int tam){
		max=tam;
		pila = new int [max];
		tope=0;
	}	

	public void push(int n){
		if(tope<max){
			
			pila[tope]=n;
			tope++;
		}
		else
			System.out.println("Tu pila esta llena");
	}

	public int pop(){
		if(tope>0){
			t=pila[tope-1];
			tope--;
		}
		else
			System.out.println("La pila esta vacia\n");
		return t;
	}

	public int peek(){
		int i=pila[tope-1];
		return i;
	}

	public boolean llena(){
		if(tope==max){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean vacia(){
		if(tope==0)
			return true;
		else 
			return false;
	}

	public void mostrar(){
		for(int j=tope-1; j>=0; j--)
			System.out.println("\t" + pila[j]);
	}


}