package JavaCollections.Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploComparatorList {

    public static void main(String[] args) {

        //INICIALIZA UMA LISTA
        List<Funcionario> funcionarios = new ArrayList<>();

        //INSERE OS OBJETOS A LISTA
        funcionarios.add(new Funcionario("Gustavo", 23));
        funcionarios.add(new Funcionario("Italo", 28));
        funcionarios.add(new Funcionario("Joseph", 35));
        funcionarios.add(new Funcionario("Maria", 19));
        funcionarios.add(new Funcionario("Carla", 24));
        funcionarios.add(new Funcionario("Roberta", 18));

        //APRESENTA OS OBJETOS EM ORDEM DE INSERÇÃO
        System.out.printf("\n----------ORDEM DE INSERÇÃO----------\n%s\n",funcionarios);

        //APRESENTA OS OBJETOS EM ORDEM NATURAL DOS VALORES DA IDADE
        funcionarios.sort(Comparator.comparingInt(Funcionario::getIdade));
        System.out.printf("\n----------ORDEM NATURAL DOS NUMEROS COM BASE NA IDADE----------\n%S\n",funcionarios);

        //PRESENTA OS OBJETOS NA ORDEM REVERSA DA IDADE
        funcionarios.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.printf("\n----------ORDEM REVERSA DOS NUMEROS COM BASE NA IDADE----------\n%S\n",funcionarios);
    }
}