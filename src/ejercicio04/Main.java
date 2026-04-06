package ejercicio04;

public class Main {

    public static void main(String[] args) {
        
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico(200, 60, "verde", 'C');
        listaElectrodomesticos[1] = new Lavadora(150, 30);
        listaElectrodomesticos[2] = new Television(500, 80, "negro", 'E', 42, false);
        listaElectrodomesticos[3] = new Electrodomestico();
        listaElectrodomesticos[4] = new Electrodomestico(600, 20, "gris", 'D');
        listaElectrodomesticos[5] = new Lavadora(300, 40, "blanco", 'Z', 40);
        listaElectrodomesticos[6] = new Television(250, 70);
        listaElectrodomesticos[7] = new Lavadora(400, 100, "rojo", 'A', 15);
        listaElectrodomesticos[8] = new Television(200, 60, "naranja", 'T', 30, true);
        listaElectrodomesticos[9] = new Electrodomestico(50, 10);

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;

        for (Electrodomestico e : listaElectrodomesticos) {
            
            double precio = e.precioFinal();
            
            System.out.println("Tipo: " + e.getClass().getSimpleName() + " | Precio final: " + precio + "€");

            sumaElectrodomesticos += precio;

            if (e instanceof Lavadora) {
                sumaLavadoras += precio;
            }
            if (e instanceof Television) {
                sumaTelevisiones += precio;
            }
        }

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Total Electrodomésticos: " + sumaElectrodomesticos + "€");
        System.out.println("Total Lavadoras: " + sumaLavadoras + "€");
        System.out.println("Total Televisiones: " + sumaTelevisiones + "€");
    }
}