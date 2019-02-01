
/**
 * @author Diego M. Candela Pomares
 * @version 1.2
 */
public class Rectangulo_DCP extends FiguraGeometrica_DCP {
	private double l1;
	private double l2;
	
	/**
	 * Método constructor de clase rectángulo
	 * @param tipoFigura  Tipo de figura geométrica
	 * @param lG  		Longitud del lado más grande
	 * @param lP		Longitud del lado más pequeño
	 */
	public Rectangulo_DCP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Método que calcula el área del rectángulo
	 * @return 	Área de la figura
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Método que calcula el perímetro del rectángulo
	 * @return 	Perímetro de la figura
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
