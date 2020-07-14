/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

/**
 *
 * @author Lqr
 */
public class TablaDeErrores {

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int getLinea() {
        return Linea;
    }

    public void setLinea(int Linea) {
        this.Linea = Linea;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
    
    String tipoError;
    String variable;
    int Linea;
    String Comentario;
    
    public TablaDeErrores( String tipoError, String variable, int Linea,String Comentario){
        this.tipoError=tipoError;
        this.variable = variable;
        this.Linea = Linea;
        this.Comentario = Comentario;   
    }
    
    
    
    
    
}
