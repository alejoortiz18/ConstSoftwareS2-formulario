/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class Ventanas {
    private JFInicio _inicio;
    private JFPag1 _page1;

    public Ventanas(JFInicio inicio, JFPag1 pag1 ) {
        this._inicio = inicio;
        this._page1 = pag1;
    }
    
    public void EstablecerVentana(int VentanaId){
        if(VentanaId ==1)
        {
            _inicio.setVisible(false);
            _page1.setVisible(true);
            
        }
    }
}
