/*
 *Dalton Augusto Pontes de Santis Filho 
 */


public class Equacao {

    private int a, b, c;

    public Equacao() {
    }

    public boolean setA(int a) {
        if (a != 0) {
            this.a = a;
            return true;
        } else {
            return false;
        }
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    private double delta() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public boolean temRaizesReais() {
        return delta() >= 0;
    }

    public double[] raizes() {
        double[] retorno = new double[2];

        double d = delta();

        if (d < 0) {
            retorno[0] = Double.NaN;
            retorno[1] = Double.NaN;
        } else {
            retorno[0] = (-this.b + Math.sqrt(d)) / (2 * this.a);
            retorno[1] = (-this.b - Math.sqrt(d)) / (2 * this.a);
        }

        return retorno;
    }
}

