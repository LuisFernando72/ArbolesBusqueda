package ordenarnuma;

import java.util.ArrayList;
import java.util.Arrays;

/* * @author Luis Fernando Paxel
 */
public class ArbolBinario {

    NodoArbol raiz;
    private int lleva[];
    private int dos;
    private int d;
    ArrayList<Integer> lista_numeros = new ArrayList<>();
    ArrayList<Integer> lista_InOrden = new ArrayList<>();
    ArrayList<Integer> lista_osOrden = new ArrayList<>();

    public ArbolBinario(int dos) {
        this.dos = dos;
    }

    public ArbolBinario(int[] lleva) {
        this.lleva = lleva;
    }

    public int[] getLleva() {
        return lleva;
    }

    public void setLleva(int[] lleva) {
        this.lleva = lleva;
    }

    public ArbolBinario() {
        raiz = null;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    //Metodo para insertar un nodo en el arbol
    public void agregarNodo(int d) {
        NodoArbol nuevo = new NodoArbol(d);

        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }

                }
            }
        }
    }

    public boolean Vacio() {
        return raiz == null;

    }

    //Metodo para recorrer en INORDEN
    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            lista_InOrden.add(r.dato);
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer en PREORDEN
    public void preOrden(NodoArbol r2) {
        if (r2 != null) {
            lista_numeros.add(r2.dato);
            preOrden(r2.hijoIzquierdo);
            preOrden(r2.hijoDerecho);

        }
        //    System.out.println(" " + String.valueOf(lista_numeros));
    }

  
    //Metodo para recorrer en INORDEN
    public void postOrden(NodoArbol r3) {
        if (r3 != null) {
            postOrden(r3.hijoIzquierdo);// Hijo izquierdo
            postOrden(r3.hijoDerecho); // Hijo derecho
            lista_osOrden.add(r3.dato);
            // System.out.print(r3.dato + ",");// Raiz
        }
    }
      public String uno() {
        String dos22 = String.valueOf(lista_numeros);

        return dos22;
    }

    public String Ino() {
        String in = String.valueOf(lista_InOrden);

        return in;
    }

      public String ps() {
        String post = String.valueOf(lista_osOrden);

        return post;
    }

}
