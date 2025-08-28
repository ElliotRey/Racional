package mx.uaemex.fi.paradigmas.numeros;

/**
 * data type
 */
public class Racional {
    private int numerador;
    private int denominador;

    public Racional Potencia(int n){
        Racional res;
        int num, den;

        num= (int) Math.pow(this.numerador,n);
        den= (int) Math.pow(this.denominador,n);

        res = new Racional(num,den);
        return res;
    }

    public Racional Suma(int n){
        this.numerador=n;
    }
    public Racional(){
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(Racional r){
        this.numerador = r.numerador;
        this.denominador = r.denominador;
    }

    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public String toString(){
        return this.numerador + "/" + this.denominador;
    }

}
