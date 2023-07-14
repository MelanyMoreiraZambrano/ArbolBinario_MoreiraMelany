package arbolbinario;

public class ArbolBinario{
	
	protected Nodo raiz;
	
	public ArbolBinario(){
		raiz = null;
	}
	
	public ArbolBinario(Nodo raiz){
		this.raiz = raiz;
	}
	
	public Nodo getRaiz() {
		return raiz;
	}
	/*getRaiz es como
	public Nodo raizArbol(){
		return raiz;
	}*/
	
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	//Comprueba el estatus del árbol
	boolean esVacio(){
		return raiz == null;
	}
}
