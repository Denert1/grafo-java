# grafo-java
//Clase Vertice

public class Vertice {
    private String nombre;
    private boolean visitado;

    public Vertice(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

}

//Clase grafo

public class Grafo {

    private Vertice []vertices; //arreglo de vértices
    private int A[][];   //Representación con matriz de adyacencia
    private int orden;
    private int numVer; //contador de vertices

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
        while(i<vertices.length){
            if(v.equals(vertices[i].getNombre()))
                posicion=i;
            else
                return posicion=-1;
            i++;
        }
        return posicion;
    }

    public void agregaArista(String vo, String vd, int peso){
       Arista arista = new Arista(vo, vd, peso);


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

    public void DFS(String v){

    }
}

//Clase main de grafo

public class testGrafo {
    public static void main(String []args){

        Grafo g = new Grafo(5);

        g.agregaVertice("A");
        g.agregaVertice("B");
        g.agregaVertice("C");
        g.agregaVertice("D");
        g.agregaVertice("E");

		g.mostrarVertices();

        g.agregaArista("A", "B", 10);
        g.agregaArista("A", "D", 2);
        g.agregaArista("A", "E", 5);
        g.agregaArista("B", "D", 1);
        g.agregaArista("C", "D", 3);
        g.agregaArista("C", "E", 8);
        g.agregaArista("D", "E", 4);
 
        g.mostrarMatriz();

        System.out.println("\nRecorrido en profundidad");
        g.DFS("A");
        System.out.println("");
        
    }
}
