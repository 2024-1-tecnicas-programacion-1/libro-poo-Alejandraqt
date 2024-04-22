package com.mycompany.libropoo;

public class Libro {    
     
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;
        
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/
    /**
    
     * Constructor de la clase Libro: Inicializa los atributos de mi clase
     * @param titulo
     * @param autor
     * @param anioPublicacion
     * @param genero
     * @param leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Libro(String titulo, String autor, int anioPublicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = false;
    }

    /**
     * Método para retornar la informacion del libro
     * @return String: Retorna la informacion del libro
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String mostrarInformacion(){
        String resultado = "Título:"+titulo+", Autor:"+autor+", Año de publicación:"+anioPublicacion+", Género:"+genero;
        return resultado;
    }
    
    /**
     * Método para marcar como leido
     * @return String: Valida la marcacion de un libro como leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public void marcarLeido(){
        leido = true;
    }
    
    /**
     * Método que permite retornar si un libro ya fue leido
     * @return boolean: True si el libro ya fue leido, false si no ha sido leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean isLeido(){
        return this.leido;
    }
    
    /**
     * Método para retornar la antiguedad de un libro
     * @return String: Valida si un libro tiene mas de 50 años de antiguedad
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean esAntiguo(){
        if (2024-anioPublicacion>50){
            leido = true;
        }
        return leido;
    }
}
