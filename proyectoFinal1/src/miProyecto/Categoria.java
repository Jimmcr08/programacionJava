/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyecto;

/**
 *
 * @author CSU22
 */
public class Categoria {
    //Atributos
    public int id_categoria;
    public String nombre_categoria;
    
    //Constructor vacio

    public Categoria() {
    }
    
   //Constructor Completo
    public Categoria(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }
    
   //Constructor parcial
    public Categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
    //Metodos

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    public void imprimir(){
        System.out.println("La categoria de este objeto es: " + nombre_categoria);
    }
    
    public static void main (String[] args) {
        
        //Voy a crear mi primer objeto
        
        Categoria n1 = new Categoria(1, "Tecnologia");
        n1.imprimir();
    }
    
    
    
    
  
}
