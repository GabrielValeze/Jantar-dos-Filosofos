// @author Gabriel Valeze e Juan Carlos
package jantardosfilosofos;

// Esta classe será responsável por iniciar o código.
public class Main {

    public static void main(String[] args) {
        MesaJantar mesa = new MesaJantar();
        for (int filosofo = 0; filosofo < 5; filosofo++) {
            new Filosofo("Filosofo_" + filosofo, mesa, filosofo).start();
        }
    }

}
