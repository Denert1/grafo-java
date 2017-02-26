/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public class Grafo {

    private Vertice []vertices; //arreglo de vértices
    private int A[][];   //Representación con matriz de adyacencia
    private int orden;
    private int numVer; //contador de vertices
    private int arreglo[] = new int [numVer];

    public Grafo(int n){
        vertices = new Vertice[n];
        A = new int[n][n];
        orden = n;
        numVer = 0;
    }

    public Grafo(){
        this(15);
    }

    public void agregaVertice(String n){

        if(numVer < orden){
            Vertice v = new Vertice(n);
            vertices[numVer++] = v;
        }
        else
            System.out.println("Numero de vertices excedido");
    }

    //obtener el indice del vertice con nombre v
    public int getIndice(String v){
        int i =0;
        int posicion=0;
        while(i<vertices.length&&vertices[i].getNombre().compareTo(v)!=0){
           
            i++;
        } 
        if(vertices[i].getNombre().compareTo(v)==0)
            posicion=i;
        else
            posicion=-1;
        return posicion;
    }

    public void agregaArista(String vo, String vd, int peso){
      A[getIndice(vo)][getIndice(vd)]=peso;
    }

    public void mostrarMatriz(){
        System.out.println("\nMatriz de Adyacencia");
        for(int i=0; i<numVer; i++) {
            for(int j=0; j<numVer; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }

    //mostrar la lista de v�rtices
    public void mostrarVertices(){
        System.out.println("\nLista de vertices");
        for(int i=0; i<numVer; i++)
        {
            if(vertices[i] != null )
                System.out.println("Vertice: "+vertices[i].getNombre()+" indice: "+i);
        }

    }

    //Agregar Recorrido en profundidad (DFS)
    /*public void dFS(String vi){
        int i=getIndice(vi);
        vertices[i].setVisitado(true);
        if(vertices[i].isVisitado()){
            System.out.print("-"+vertices[i].getNombre());
        }
            
        for(int j=0; j<numVer; j++){
            if(A[i][j]>0){

                if(!vertices[j].isVisitado()){
                    dFS(vertices[j].getNombre());
                }   
            }
        }
    }*/

    //Recorrido en Profundidad (pila)
    public void dFS(String vi){
        Pila prof = new Pila(10);
        
        prof.push(getIndice(vi));
        vertices[getIndice(vi)].setVisitado(true);
        System.out.print("-"+vertices[getIndice(vi)].getNombre());
        while(!prof.vacia()){
            int i=prof.pop();
            for(int j=0; j<numVer; j++){
                if(A[i][j]>0 && !vertices[j].isVisitado()){
                    vertices[j].setVisitado(true);
                    prof.push(j);
                    
                    System.out.print("-"+vertices[prof.peek()].getNombre());   
                }
            }
        }
    }

    public void bFS(String vi){
        Cola anchura = new Cola(20);

        anchura.encolar(getIndice(vi)); //encolo mi primer vector
        vertices[getIndice(vi)].setVisitado(true);
        
        System.out.println("-"+vertices[anchura.peek()].getNombre()); //imprimo elementos de la cola
        while(!anchura.estaVacia()){ 
            //anchura.mostrar();
            int i = anchura.desencolar(); //me introduzco al elemento i de mi matriz
            
            //System.out.println(i);    
            for(int j=0; j<numVer; j++){ //recorro el renglon i de mi matriz
                //System.out.println(A[i][j] + " "+ j+ " "+ i);
                if(A[i][j]>0 && !vertices[j].isVisitado()){ //si un elemento es mayor a 0 es adyacente y si no esta visitado...
                    anchura.encolar(j); //encolamos cada elemento adyacente
                //    anchura.mostrar();
                    vertices[j].setVisitado(true); //visitamos cada elemento adyacente
                    System.out.println("-"+ vertices[j].getNombre()); //imprimimos elementos de la cola
                }
                
            }        
        }
    }
   
    //recorrido en anchura BFS

    //Dijkstra

}
