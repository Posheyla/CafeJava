public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeFiltro = 1.0;
        double precioCafeLeche = 2.5;
        double precioCapuchino = 5.0;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = false;
        
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        if (estaListoOrden4){
            System.out.println("Su orden esta lista");
        }
        if (estaListoOrden2){
            System.out.println(cliente2 + " su orden esta lista");
            System.out.println("El precio es: " + 2*precioCafeLeche);
        }
        if (estaListoOrden3){
            System.out.println(cliente3 + " su orden esta lista");
            System.out.println("Usted debe pagar " + (precioCafeLeche-precioCafeFiltro));
        }
    }
}