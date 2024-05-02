package CLASES;

import java.util.List;

public class Objeto {
    private String nombre;
    private String forma;
    private double peso;
    private double precio;
    
    
    public Objeto(){}
    
    public Objeto(String nombre, String forma, double peso, double precio) {
        this.nombre = nombre;
        this.forma = forma;
        this.peso = peso;
        this.precio = precio;
    }

    
    public void GenerarElementos(List<Objeto> lista){
        System.out.println();
        lista.add( new Objeto("Manzana","circular",0.2,0.5));
        lista.add(new Objeto("Manzana", "circular", 0.2, 0.5));
        lista.add(new Objeto("Agua", "cilíndrica", 0.5, 2));
        lista.add(new Objeto("Cuaderno", "rectangular", 0.5, 20));
        lista.add(new Objeto("Pelota", "circular", 0.5, 40));
        lista.add(new Objeto("Lentes", "no che", 0.1, 100));
        lista.add(new Objeto("Chompa", "rectangular", 10.0, 50.0));
        lista.add(new Objeto("Reloj", "circular", 0.3, 150.0));
        lista.add(new Objeto("Zapatos", "rectangular", 1.5, 200.0));
        lista.add(new Objeto("Bolsa de dormir", "rectangular", 2.0, 100.0));
        lista.add(new Objeto("Tablet", "rectangular", 0.7, 800.0));
        lista.add(new Objeto("Cámara fotográfica", "rectangular", 0.5, 1500.0));
        lista.add(new Objeto("Microondas", "rectangular", 15.0, 400.0));
        lista.add(new Objeto("Impresora multifuncional", "rectangular", 12.0, 600.0));
        lista.add(new Objeto("Televisor de pantalla grande", "rectangular", 20.0, 1800.0));
        lista.add(new Objeto("Silla de escritorio ergonómica", "rectangular", 12.0, 300.0));
        lista.add(new Objeto("Barril de cerveza", "circular", 25.0, 1000.0));
        lista.add(new Objeto("Maletín con laptop", "rectangular", 3.0, 1200.0));
        lista.add(new Objeto("Calculadora gráfica", "rectangular", 0.5, 300.0));
        lista.add(new Objeto("Kit de arte con pinturas", "rectangular", 2.0, 150.0));
        lista.add(new Objeto("Libros de texto", "rectangular", 5.0, 50.0));
        lista.add(new Objeto("Kit de química", "rectangular", 4.0, 250.0));
        lista.add(new Objeto("Instrumento musical (guitarra)", "rectangular", 3.0, 600.0));
        lista.add(new Objeto("Telescopio", "rectangular", 2.5, 400.0));
        lista.add(new Objeto("Kit de robótica", "rectangular", 5.0, 350.0));
        lista.add(new Objeto("Microscopio", "rectangular", 4.0, 500.0));
        
        System.out.println("OBJETOS QUE LE PODRIAN INTERESAR: contador:  "+ lista.size());
        
        for (int i = 0; i < lista.size(); i++) { 
            Objeto objeto = lista.get(i);
            System.out.printf("%d. %s: [%.2f kg, %s, %.2f$]\n", i + 1, objeto.getNombre(), objeto.getPeso(), objeto.getForma(), objeto.getPrecio());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
