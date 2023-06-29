

/**
 *
 * @author Kristin
 */

public class Rectangulo {
    private int ancho;
    private int altura;

    public Rectangulo(int ancho, int altura) throws RectanguloExcep{
        setAncho(ancho);
        setAltura(altura);
    }

    public void setAncho(int ancho) throws RectanguloExcep{
        if (ancho <= 0) {
            throw new RectanguloExcep("EL ANCHO DEL RECTANGULO DEBE SER MAYOR A 0!!");
        }
        this.ancho = ancho;
    }

    public void setAltura(int altura) throws RectanguloExcep {
        if (altura <= 0) {
            throw new RectanguloExcep("LA ALTURA DEL RECTANGULO DEBE SER MAYOR A 0!!");
        }
        this.altura = altura;
    }

    public int calcularArea() {
        return ancho * altura;
    }
}

