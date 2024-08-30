/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Admin
 * la clase deve estar en la paqueteria bean la cual deve tener la palabra action asi como las clases que se creen
 */
public class MostrarPersonaAction extends ActionSupport {
    Logger log = LogManager.getLogger(MostrarPersonaAction.class); 
   private String nombre;
    @Override
    public String execute(){ 
        log.info("El nombre es: "+ this.nombre);
         return SUCCESS ; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}