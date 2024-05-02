package EJECUTOR;
import CLASES.Objeto;
import CLASES.Mochila;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class LlenarMochila {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            
            
            //crear la mochila para iniciar el programa
            Mochila Mochilitauwu= new Mochila();
            Mochilitauwu.Inicio();
            
            //crear objetos para llenar a la mochila
            Objeto objeto = new Objeto();
            List<Objeto> lista = new ArrayList<>();
            
            
            
            objeto.GenerarElementos(lista);
            //ejecutar el ordenamieto 
            ordenarPorPrecio(lista);

        // Seleccionar objetos priorizando precio
        int objetosSeleccionados = 0;
        double valorTotal = 0;
        double pesoTotal = 0;
        for (int i = 0; i < lista.size() && objetosSeleccionados < 15; i++) {
            Objeto obj = lista.get(i);
            if (pesoTotal + obj.getPeso() <= Mochilitauwu.getLimPeso() && i < lista.size() - 1) {
                lista.set(objetosSeleccionados, obj);
                valorTotal += obj.getPrecio();
                pesoTotal += obj.getPeso();
                objetosSeleccionados++;
            }
        }
        // Llenar hasta el límite de peso si hay objetos restantes
        int i=0;
        do {
            Objeto obj = lista.get(i);

            // Verificar si el objeto cabe en la mochila
            if (pesoTotal + obj.getPeso() <= Mochilitauwu.getLimPeso()) {
                if (objetosSeleccionados < lista.size()) { 
                    lista.set(objetosSeleccionados, obj);
                    valorTotal += obj.getPrecio();
                    pesoTotal += obj.getPeso();
                    objetosSeleccionados++;
                } else {
                    System.out.println("\nMochila llena, finalizando selección de objetos.");
                    break;
                }
            } else {
                // objeto demasiado pesado pero aún hay espacio
                System.out.println("\n**Objeto demasiado pesado para agregar:** " + obj.getNombre());
                System.out.printf("Peso actual: %.2f kg, Peso máximo: %.2f kg\n", pesoTotal, Mochilitauwu.getLimPeso());

                // Llenar con el siguiente objeto si hay espacio
                if (i + 1 < lista.size()) {
                    i++;
                } else {
                    // No hay más objetos, finalizar el loop
                    break;
                }
            }

            i++;
        } while (i < lista.size() && (objetosSeleccionados < lista.size() || pesoTotal < Mochilitauwu.getLimPeso()));



        // Mostrar el resultado
        System.out.println("\nOBJETOS SELECCIONADOS EN LA MOCHILA (PRIORIZANDO VALOR):");
        for (int j = 0; j < objetosSeleccionados; j++) {
            Objeto obj = lista.get(j);
            System.out.printf("%d. %s: [%.2f kg, %s, %.2f$]\n", j + 1, obj.getNombre(), obj.getPeso(), obj.getForma(), obj.getPrecio());
        }

        System.out.println("\nVALOR TOTAL: $" + valorTotal);
        System.out.println("PESO TOTAL: " + pesoTotal + " kg");
    }

    // Método para ordenar objetos por precio
    private static void ordenarPorPrecio(List<Objeto> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                Objeto objetoActual = lista.get(i);
                Objeto objetoAComparar = lista.get(j);
                double valorUnitarioActual = objetoActual.getPrecio() / objetoActual.getPeso();
                double valorUnitarioComparar = objetoAComparar.getPrecio() / objetoAComparar.getPeso();

                if (valorUnitarioComparar > valorUnitarioActual) {
                    lista.set(i, objetoAComparar);
                    lista.set(j, objetoActual);
                }
            }
        }
    }
}
    

