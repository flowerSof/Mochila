package CLASES;
import java.util.Scanner;
public class Mochila {
    private double limPeso;
    private int cantObjetos;
    private Objeto[]  objetos;
    
    public void Inicio(){
        Scanner teclado=new Scanner(System.in);
        System.out.println(".... ...Iniciando programa.....");
        System.out.println("..");
        System.out.println(".");
        System.out.print("Ingrese limite de peso de la mochila....");
        this.limPeso = teclado.nextDouble();
        System.out.println("....");
        System.out.println("Limite de la mochila: "+this.limPeso);
        System.out.println("..");
        System.out.println(".");
        
        System.out.println("__________________________________________________");
    }
    
    public double getLimPeso() {
        return limPeso;
    }

    public void setLimPeso(double limPeso) {
        this.limPeso = limPeso;
    }

    public int getCantObjetos() {
        return cantObjetos;
    }

    public void setCantObjetos(int cantObjetos) {
        this.cantObjetos = cantObjetos;
    }

    public Objeto[] getObjetos() {
        return objetos;
    }

    public void setObjetos(Objeto[] objetos) {
        this.objetos = objetos;
    }
    
    
   
    
}
