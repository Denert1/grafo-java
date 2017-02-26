public class Cola{
	private int frente, fondo, tam, n;
	private int[] cola;

	public Cola(){
		tam=10;
		cola = new int[tam];
		frente=0;
		fondo=-1;
	}
	public Cola(int tama){
		tam=tama;
		cola = new int [tam];
		frente=-1;
		fondo=-1;
	}

	public void encolar(int num){
		if(estaLlena()==true){
			System.out.println("Tu cola esta llena");
		}
		else{
			fondo=(fondo+1)%tam;
			cola[fondo]=num;
		}
		if(frente==-1)
			frente++;	
	}

	public int desencolar(){
		int r=0;
		if(frente==-1){
			System.out.println("Tu cola esta vacia");
		}
		else{
			r=cola[frente];
			frente=(frente+1)%tam;
			
		}
		if(frente==fondo+1){
			frente=-1;
			fondo=-1;
		}		
		return r;
	}

	public boolean estaVacia(){
		if(frente==-1){
			return true;
		}
		else
			return false;
	}

	public boolean estaLlena(){
		if(fondo==tam-1 && frente==0 || fondo+1==frente){
			return true;
		}
		else
			return false;
	}

	public void mostrar(){
		int i=fondo;
		if(estaVacia()==true)
			System.out.println("Esta Vacio");
		else{
			if(frente<fondo){
				for(i=frente; i<=fondo;i++){
					System.out.print(cola[i]);
				}
			}
			else{
				if(frente==fondo){
					System.out.println(cola[frente]);
				}
				else{
					for(i=frente; i<tam; i++)
						System.out.print(cola[i]);
					for(i=0; i<=fondo; i++)
						System.out.print(cola[i]);
				}
				
			}					
		}
			System.out.print("\n");	
	}	

	public void estatus(){
		System.out.println("fondo:" + fondo);
		System.out.println("frente:" + frente);
	}

	public int peek(){
		int c;
		c=cola[frente];
		return c;
	}

	public int getNumElementos(){
		int i, n=0;
		if(frente<fondo){
			for(i=frente; i<=fondo;i++){
				n++;
			}
		}
		else{
			if(frente==fondo){
				System.out.println("1");
			}
			else{
				for(i=frente; i<tam; i++)
					n++;
				for(i=0; i<=fondo; i++)
					n++;
			}
				
		}	
		System.out.println(n);
		return n;							
	}

}