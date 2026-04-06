package ejercicio04;

public class Electrodomestico {

    protected double precioBase = 100;
    protected double peso = 5;
    protected Color color = Color.blanco;
    protected Consumo consumoEnergetico = Consumo.F;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Consumo consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    private void comprobarConsumoEnergetico(char letra) {
        String letraStr = String.valueOf(letra).toUpperCase();
        try {
            this.consumoEnergetico = Consumo.valueOf(letraStr);
        } catch (IllegalArgumentException e) {
            this.consumoEnergetico = Consumo.F;
        }
    }

    private void comprobarColor(String color) {
        try {
            this.color = Color.valueOf(color.toLowerCase());
        } catch (IllegalArgumentException e) {
            this.color = Color.blanco;
        }
    }

    public double precioFinal() {
        double plus = 0;
        
        switch (consumoEnergetico) {
            case A: plus += 100; break;
            case B: plus += 80; break;
            case C: plus += 60; break;
            case D: plus += 50; break;
            case E: plus += 30; break;
            case F: plus += 10; break;
        }

        if (peso >= 0 && peso <= 19) {
            plus += 10;
        } else if (peso >= 20 && peso <= 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 60;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }

    @Override
    public String toString() {
        return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + "]";
    }
}