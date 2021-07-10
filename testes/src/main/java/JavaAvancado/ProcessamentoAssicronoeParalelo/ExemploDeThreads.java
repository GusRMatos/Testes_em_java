package JavaAvancado.ProcessamentoAssicronoeParalelo;

public class ExemploDeThreads {

    public static void main(String[] args) {
        //INICIALIZAÇÃO DAS THREADS
        Geradorpdf IniciarGerarpdf = new Geradorpdf();
        Carregamento IniciarCarregamento = new Carregamento(IniciarGerarpdf);

        //INICIAR O PROCESSO DE PROGRAMA
        IniciarGerarpdf.start();
        IniciarCarregamento.start();
    }
}
//PRIMEIRA THREAD QUE GERA O PDF HERDA DA API THREAD
class Geradorpdf extends Thread{
        //OVERRIDE PARA SOBRESCREVER O METODO
        @Override
        public void run(){
            //TRY COM PRINT DE INICIO E CONTAGEM DE 5MIL MILISEGUNDOS PARA EXEMPLIFIAR
            try {
                System.out.println("INICIANDO GERAÇÃO DO PDF");
                Thread.sleep(5000);
            //CATCH PARA INTERROMPER O PROCESSO DE SLEEP E PRINTAR O PDF GERADO
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("PDF GERADO!");
        }
    }
//SEGUNDA THREAD QUE GERA O CARREGAMENTO TAMBEM HERDANDO DA API THREAD
class Carregamento extends Thread {
    //CONSTRUTOR DO METODO GERAR PDF PARA O LOADING PARAR QUANDO O PDF FOR GERADO
    private Thread iniciarGerarpdf;

    public Carregamento(Thread iniciarGerarpdf) {
        this.iniciarGerarpdf = iniciarGerarpdf;
    }
    @Override
    public void run() {
        //LOOP PARA PRINTAR VARIAS VEZES O LOADING
        while (true) {
            //TRY ESTIPULANDO TEMPO DE PRINT CONTROLADO PARA 500 MILISEGUNDOS
            try {
                Thread.sleep(500);
                //IF PARA PARAR O WHILE TRUE
                if (!iniciarGerarpdf.isAlive()) {
                    break;
                }
                System.out.println("LOADING...");
              //CATCH PARA PARAR INTERROMPER O TRY
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
