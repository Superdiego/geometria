
public class Circulo_DCP extends FiguraGeometrica_DCP {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_DCP(double r, String tipoFigura) {
		super(tipoFigura);
		if (r<0) {
			r=(-1)*r;
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
