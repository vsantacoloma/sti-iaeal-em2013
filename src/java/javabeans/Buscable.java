/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author betocols
 */
public class Buscable {
    
    String dato;
    int cont;

    public Buscable() {
    }
    
    public Buscable(String dato, int cont) {
        this.dato = dato;
        this.cont = cont;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
}
