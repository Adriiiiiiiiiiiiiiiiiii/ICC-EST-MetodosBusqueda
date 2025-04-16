import Controllers.MetodosBusqueda;
import views.ShowConsole;
import Models.Persona;

import java.util.Scanner;
import Controllers.MetodosBusqueda;
import Models.Persona;

public class App {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Pedro");
        personas[2] = new Persona(103, "Luis");
        personas[3] = new Persona(104, "Carlos");
        personas[4] = new Persona(105, "Juan");
        personas[5] = new Persona(106, "Pedro");
        personas[6] = new Persona(107, "Luis");
        System.out.println("La lista ingresada es: ");
        MetodosBusqueda mB = new MetodosBusqueda(personas);

    }
}