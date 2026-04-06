package ejercicio04;

public class Television extends Electrodomestico {
    
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {
        super();
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioAcumulado = super.precioFinal();
        
        if (resolucion > 40) {
            precioAcumulado += (precioAcumulado * 0.30);
        }
        
        if (sintonizadorTDT) {
            precioAcumulado += 50;
        }
        
        return precioAcumulado;
    }
}