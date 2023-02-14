package ejercico3_files;

import java.io.Serializable;

public class TelefonoMovil implements Serializable {
     private int numero;
    private double credito;
    public TelefonoMovil(int numero ,double credito ){
        this.credito=credito;
        this.numero=numero;
    }
    public String toString(){
        return "numero : "+ numero + " \n"+ "credito : " + credito;
    }
    public void recarga( int s){
        this.credito= this.credito+s;
    }
    public void llamada(int mins){
        setCredito(this.credito=this.credito-(mins*2));
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
