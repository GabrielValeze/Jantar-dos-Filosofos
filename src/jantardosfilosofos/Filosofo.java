// @author Gabriel Valeze e Juan Carlos
package jantardosfilosofos;

// Esta classe será responsável por manter o estado de cada filósofo, se está comendo ou pensando.
public class Filosofo extends Thread {

    String nome; // nome do filosofo.
    MesaJantar mesa; // mesa que o filosofo está.
    int numeroFilosofo; // numero de identificacao do filosofo.

    // Cria um filosofo com os valores passados por parametro.
    public Filosofo(String nomeFilosofo, MesaJantar mesadejantar, int numFilosofo) {
        nome = nomeFilosofo;
        mesa = mesadejantar;
        numeroFilosofo = numFilosofo;
    }

    @Override
    public void run() {
        while (true) {
            pensar(5000); // pensa por 5 segundos.
            getGarfos();
            comer(5000); // come por 5 segundos.
            returnGarfos();
        }
    }

    public void pensar(int tempo) {
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filófoso pensou em demasia");
        }
    }

    public void comer(int tempo) {
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filósofo comeu em demasia");
        }
    }

    public void getGarfos() {
        mesa.pegarGarfos(numeroFilosofo);
    }

    public void returnGarfos() {
        mesa.returningGarfos(numeroFilosofo);
    }
}
