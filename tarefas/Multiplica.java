package tarefas;

public class Multiplica extends Thread {
    private String nome;
    private int valorMultiplicar;
    private int tempo;
    private boolean parada;
    public Multiplica(String name, int valor) {
        this.nome = name;
        this.valorMultiplicar = valor;
        this.parada = false;
        this.start();
    }

    public void run() {
        // System.out.println("Aqui Multiplica");
        System.out.println("Multiplicacao: " + this.nome);

        for (int x = 0; x <= 10; x++) {
            System.out.println(this.valorMultiplicar + " x " + x + " = " + (this.valorMultiplicar * x));
           
           
            try {
                this.sleep(tempo);

                while(parada){
                    
                }
                if( x == 5){
                    synchronized (this){
                        System.out.println("Parou Aqui: " + this.nome);
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
      }

      System.out.println("Fim da thread!!!");
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorMultiplicar() {
        return valorMultiplicar;
    }

    public void setValorMultiplicar(int valorMultiplicar) {
        this.valorMultiplicar = valorMultiplicar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    

    


}