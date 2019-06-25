// @author Gabriel Valeze e Juan Carlos
package jantardosfilosofos;

// Esta classe será responsável por manter o estado de cada filósofo, se está comendo ou pensando.
public class Filosofo extends Thread {

    final static int tempoProcessamento = 5000; // 5 segundos.
    MesaJantar mesa;
    String nome; // nome do filosofo
    int filosofo;

    public Filosofo(String nome, MesaJantar mesadejantar, int fil) {
        super(nome);
        mesa = mesadejantar;
        filosofo = fil;
    }

    @Override
    public void run() {
        while (true) {
            pensar(tempoProcessamento);
            getGarfos();
            comer(tempoProcessamento);
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
        mesa.pegarGarfos(filosofo);
    }

    public void returnGarfos() {
        mesa.returningGarfos(filosofo);
    }
}
