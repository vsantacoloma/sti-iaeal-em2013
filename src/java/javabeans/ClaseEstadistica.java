/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author Andel
 */
public class ClaseEstadistica extends ActionForm {
   
   private String codigo1;
   private String codigo2;
   private String codigo3;
   private int periodoIni;
   private int periodoFin;

    public ClaseEstadistica() {
    }

    public ClaseEstadistica(String codigo1, String codigo2, String codigo3, int periodoIni, int periodoFin) {
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;
        this.periodoIni = periodoIni;
        this.periodoFin = periodoFin;
    }

    public String getCodigo1() {
        return codigo1;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

  public int getPeriodoIni() {
    return periodoIni;
  }

  public void setPeriodoIni(int periodoIni) {
    this.periodoIni = periodoIni;
  }

  public int getPeriodoFin() {
    return periodoFin;
  }

  public void setPeriodoFin(int periodoFin) {
    this.periodoFin = periodoFin;
  }
      
}