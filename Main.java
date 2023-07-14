package ejecutable;
import arbolbinario.ArbolBinario;
import arbolbinario.Nodo;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws Exception {
		ArbolBinario arbol;
		Nodo a1, a2, a;
		Stack pila = new Stack();
		
		a1 = nuevoArbol(null,"Maria",null);
		a2 = nuevoArbol(null,"Rodrigo",null);
		a = nuevoArbol(a1,"Esperanza",a2);
		Nodo dato = (Nodo) pila.push(a);
		System.out.println(dato.valorNodo());
		
		a1 = nuevoArbol(null,"Anyora",null);
		a2 = nuevoArbol(null,"Abel",null);
		a = nuevoArbol(a1,"Jesus",a2);
		pila.push(a);
		
		a2 = (Nodo) pila.pop();
		a1 = (Nodo) pila.pop();
		a = nuevoArbol(a1,"Esperanza",a2);
		arbol = new ArbolBinario(a);
		///----------------Implementacion de recorrido de un arbol binario
		System.out.println("\nRecorrido en preorden:");
		preorden(arbol.getRaiz());
		System.out.println();

		System.out.println("\nRecorrido en inorden:");
		inorden(arbol.getRaiz());
		System.out.println();

		System.out.println("\nRecorrido en postorden:");
		postorden(arbol.getRaiz());
		System.out.println();
		System.out.println("\nNumero de nodos en el arbol: " + numNodos(arbol.getRaiz()));

	}
	public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
		return new Nodo(ramaIzqda, dato, ramaDrcha);
	}
	// Recorrido de un árbol binario en preorden
	public static void preorden(Nodo r){
		if (r != null){
			r.visitar();
			preorden (r.subarbolIzdo());
			preorden (r.subarbolDcho());
		}
	}
	// Recorrido de un árbol binario en inorden
	public static void inorden(Nodo r){
		if (r != null){
			inorden (r.subarbolIzdo());
			r.visitar();
			inorden (r.subarbolDcho());
		}
	}
	// Recorrido de un árbol binario en postorden
	public static void postorden(Nodo r){
		if (r != null){
			postorden (r.subarbolIzdo());
			postorden (r.subarbolDcho());
			r.visitar();
		}
	}
	
	public static int numNodos(Nodo raiz){
		if (raiz == null)
			return 0;
		else
			return 1 + numNodos(raiz.subarbolIzdo()) + numNodos(raiz.subarbolDcho());
	}
}