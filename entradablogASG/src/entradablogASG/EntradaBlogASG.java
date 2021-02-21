package entradablogASG;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se cre� el 21/02/202 por Adolfo sobrino.
 * Esta es la versi�n 2.4
 */
//
public class EntradaBlogASG {

	/**
	 *  Separador es el ccar�cter que separa ENTRADA DE del
	 *  nombre del autor
	 */
	
	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
	 *  de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
	 *  es negativo, lanza una excepci�n.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogASG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n " + texto;
		return cad;
	}

	/**
	 * Devuelve el n�mero de la entrada
	 * @return n�mero de la entrada
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Devuelve el texto completo de la entrada
	 * @return texto completo de la entrada
	 */
	public String getTexto() {
		return this.texto;
	}

	/**
	 * Devuelve el nombre del autor de la entrada en may�sculas
	 * @return nombre del autor de la entrada
	 */
	public String getAutor() {
		return this.autor.toUpperCase();
	}

	/**
	 * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return
	 */
	@Deprecated
	public String devuelveAutor() {
		return this.autor;
	}

	/**
	 * No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
		EntradaBlogASG e1=new EntradaBlogASG (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}