package curso.joel.ejerciciosintroduccion;

public class Coche {
    int numeroDePuerta;
    public Coche(int numeroDePuerta) {
        this.numeroDePuerta = numeroDePuerta;
    }
    public void numeroDePuertaAumentado (int numeroParaAumentarPuerta) {
        System.out.print(numeroDePuerta + numeroParaAumentarPuerta);
    }
}
