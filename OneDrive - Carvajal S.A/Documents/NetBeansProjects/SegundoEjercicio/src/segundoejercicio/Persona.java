/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejercicio;
/**
 *
 * @author yazvivbe
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int id;
    
    Persona(String nombre, String apellido, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id=id;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
