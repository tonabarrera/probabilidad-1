package calculos;

/**
 * Created by Tona on 13/11/2016.
 */
public class Integracion {
    private double mu = 0;
    private double rho = 1;
    private double n = 1;

    public double integrar(double rho, double mu, double a, double b, int n) {
        this.mu = mu;
        this.rho = rho;
        this.n = n;
        double altura = (b-a)/n;
        double resultado = -1;
        double suma_resultado = sumar(altura, a);
        resultado = (1/(rho*Math.sqrt(2*Math.PI)))*(altura*(((funcionDencidad(a)+funcionDencidad(b))/2)+suma_resultado));
        setParametros(0, 1, 1);
        return resultado;
    }

    public double integrar(double b, int n) {
        return integrar(rho, mu, -6, b, n);
    }

    private double sumar(double altura, double a){
        double suma = 0;
        for(int i = 1; i<n; i++)
            suma += funcionDencidad(a+(i*altura));
        return suma;
    }

    private double funcionDencidad(double x) {
        double valor = Math.exp(-0.5*(Math.pow((x-mu)/rho, 2)));
        return valor;
    }

    public void setParametros(double mu, double rho, int n){
        this.mu = mu;
        this.rho = rho;
        this.n = n;
    }
}
