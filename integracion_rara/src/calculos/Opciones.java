package calculos;

/**
 * Created by Tona on 13/11/2016.
 */
public class Opciones extends Integracion{

    public double integrarDefinida(double rho, double mu, double a, double b, int n) {
        return super.integrar(rho, mu, a, b, n);
    }

    public void integrarHastaSeis(int n) {
        for(double i = -5.99; i<6; i +=0.01) {
            i = (double)Math.round(i*100)/100;
            System.out.println("b = " + i + " Resultado = " + integrar(i, n));
        }
    }
}
