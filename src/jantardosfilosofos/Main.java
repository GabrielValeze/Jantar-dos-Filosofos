// @author Gabriel Valeze e Juan Carlos
package jantardosfilosofos;

// Esta classe será responsável por iniciar o código.
public class Main {

    public static void main(String[] args) {
        // Cria um objeto da mesa de jantar.
        MesaJantar mesa = new MesaJantar();

        // Cria os filosofos
        new Filosofo("Lucas", mesa, 1).start();
        new Filosofo("João", mesa, 2).start();
        new Filosofo("Cleiton", mesa, 3).start();
        new Filosofo("Matheus", mesa, 4).start();
        new Filosofo("Sandro", mesa, 5).start();
    }
}
