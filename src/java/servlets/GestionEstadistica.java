
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Calendar;
import javabeans.Buscable;
import javabeans.est;
import javabeans.ClaseEstadistica;
import javabeans.Tratado;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.DatabaseEstadistica;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import java.util.Date;
/**
 *
 * @author Andel
 */
public class GestionEstadistica extends MappingDispatchAction {
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
  
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            ClaseEstadistica b = (ClaseEstadistica) form;
            est Estad;
            Estad = DatabaseEstadistica.getInstance().BuscarEstadistica(b);
            System.out.println("PERIODOOOS");
            System.out.println(b.getPeriodoIni());
            System.out.println(b.getPeriodoFin());
            
            request.setAttribute("est", Estad);
            System.out.println("ESTADISTICAAAAAAAAAAAAAAAAAA " + Estad.getPrimero());
            System.out.println("ESTADISTICAAAAAAAAAAAAAAAAAA " + Estad.getSegundo());
            System.out.println("ESTADISTICAAAAAAAAAAAAAAAAAA " + Estad.getTercero());
            System.out.println(Estad.getAno1());
            System.out.println(Estad.getAno2());
            return mapping.findForward(SUCCESS);

    }
}
