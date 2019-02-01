
/**
 * @author Diego M. Candela Pomares
 * @version 1.2
 */
public class Rectangulo_DCP extends FiguraGeometrica_DCP {
	private double l1;
	private double l2;
	
	/**
	 * M�todo constructor de clase rect�ngulo
	 * @param tipoFigura  Tipo de figura geom�trica
	 * @param lG  		Longitud del lado m�s grande
	 * @param lP		Longitud del lado m�s peque�o
	 */
	public Rectangulo_DCP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * M�todo que calcula el �rea del rect�ngulo
	 * @return 	�rea de la figura
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * M�todo que calcula el per�metro del rect�ngulo
	 * @return 	Per�metro de la figura
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
