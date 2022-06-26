package curso.joel.ejerciciosintroduccion;

public class MainEjercicioTresA {
    public static void main(String[] args) {
        //Crear una función con tres parámetros que sean números que se suman entre sí.
        //Llamar a la función en el main y darle valores.
        int numeroUno = 2;
        int numeroDos = 4;
        int numeroTres = 23;

        sumaDeTresNumeros(numeroUno, numeroDos, numeroTres);
    }

    public static void sumaDeTresNumeros(int numeroUno, int numeroDos, int numeroTres) {
        System.out.println(numeroUno + numeroDos + numeroTres);
    }
}