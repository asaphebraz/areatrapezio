public class Trapezio {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return (baseMaior + baseMenor) * altura / 2.0;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        double baseMaior = 5.0;
        double baseMenor = 3.0;
        double altura = 4.0;

        Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);
        double area = trapezio.calcularArea();
        System.out.println("A área do trapézio é: " + area);
    }
}
