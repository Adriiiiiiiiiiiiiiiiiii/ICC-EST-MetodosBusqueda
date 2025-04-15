public class App {
    public static void main(String[] args) {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
                int[] numeros = {10, 25, 3, 14, 87, 42, 65, 31, 19, 50};
        
        int elementoBuscar1 = 87;  
        int elementoBuscar2 = 100; 
        
        
        int resultado1 = metodosBusqueda.busquedaLineal(numeros, elementoBuscar1);
        
        if (resultado1 != -1) {
            System.out.println("El elemento " + elementoBuscar1 + " fue encontrado en la posición " + resultado1);
        } else {
            System.out.println("El elemento " + elementoBuscar1 + " no fue encontrado en el arreglo");
        }
        
        int resultado2 = metodosBusqueda.busquedaLineal(numeros, elementoBuscar2);
        
        if (resultado2 != -1) {
            System.out.println("El elemento " + elementoBuscar2 + " fue encontrado en la posición " + resultado2);
        } else {
            System.out.println("El elemento " + elementoBuscar2 + " no fue encontrado en el arreglo");
        }
    }
}

