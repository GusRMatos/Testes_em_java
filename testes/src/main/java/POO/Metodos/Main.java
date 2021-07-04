package POO.Metodos;

public class Main {

    public static void main(String[] args){

        //criação de novo objeto com atributos obrigatorios
        Carro carro = new Carro("fiat ","strada ",2018);

        //input do atributo opcional
        carro.setVariante(" Pickup");

        //print dos atributos do veiculo
        System.out.println (carro.getMarca() + carro.getNome() + carro.getAno() + carro.getVariante());

    }


}

