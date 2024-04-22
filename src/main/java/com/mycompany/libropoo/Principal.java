package com.mycompany.libropoo;

public class Principal {
    /**
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        String autor = sc.nextLine();
        String genero = sc.nextLine();
        int anioPublicacion = sc.nextInt();
        
        Libro miLibro = new Libro(titulo, autor, anioPublicacion, genero);
        
        miLibro.marcarLeido();
        
        System.out.println(miLibro.mostrarInformacion());

        if(miLibro.isLeido()){
            System.out.println("Ya fue leido");
        }else{
            System.out.println("No ha sido leido");
        }
        
        if(miLibro.esAntiguo()){
           System.out.println("Es antiguo");
        }
    }
}
