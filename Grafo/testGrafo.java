 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 *  2011
 *
 */
public class testGrafo {
    public static void main(String []args){

        Grafo g = new Grafo(5);

        g.agregaVertice("A");
        g.agregaVertice("B");
        g.agregaVertice("C");
        g.agregaVertice("D");
        g.agregaVertice("E");
        g.getIndice("C");

		g.mostrarVertices();

        g.agregaArista("A", "B", 10);
        g.agregaArista("B", "A", 10);
        g.agregaArista("A", "D", 2);
        g.agregaArista("D", "A", 2);
        g.agregaArista("A", "E", 5);
        g.agregaArista("E", "A", 5);
        g.agregaArista("B", "D", 1);
        g.agregaArista("D", "B", 1);
        g.agregaArista("C", "D", 3);
        g.agregaArista("D", "C", 3);
        g.agregaArista("C", "E", 8);
        g.agregaArista("E", "C", 8);
        g.agregaArista("D", "E", 4);
        g.agregaArista("E", "D", 4);
 
        g.mostrarMatriz();

        System.out.println("\nRecorrido en profundidad");
        g.dFS("A");
        System.out.println("");

        Grafo ga = new Grafo(5);

        ga.agregaVertice("A");
        ga.agregaVertice("B");
        ga.agregaVertice("C");
        ga.agregaVertice("D");
        ga.agregaVertice("E");
        ga.getIndice("C");

        ga.mostrarVertices();

        ga.agregaArista("A", "B", 10);
        ga.agregaArista("B", "A", 10);
        ga.agregaArista("A", "D", 2);
        ga.agregaArista("D", "A", 2);
        ga.agregaArista("A", "E", 5);
        ga.agregaArista("E", "A", 5);
        ga.agregaArista("B", "D", 1);
        ga.agregaArista("D", "B", 1);
        ga.agregaArista("C", "D", 3);
        ga.agregaArista("D", "C", 3);
        ga.agregaArista("C", "E", 8);
        ga.agregaArista("E", "C", 8);
        ga.agregaArista("D", "E", 4);
        ga.agregaArista("E", "D", 4);

        System.out.println("\nRecorrido en Anchura");
        ga.bFS("A");
        
    }
}
