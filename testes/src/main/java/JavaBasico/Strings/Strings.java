package JavaBasico.Strings;

public class Strings {

    public static void main(String[] args){

        var nome = "Paulo";
        var sobrenome = " Silva";
        final var nomecompleto = nome + sobrenome;
        var builder = "";

        System.out.println(nomecompleto);

        var string = " Deus é meu pastor ";

        System.out.println("Mostra a string: " + string);

        System.out.println("Mostra o Char na posição: "+ string.charAt(3));

        System.out.println("Mostra o tamanho da string: " + string.length());

        System.out.println("Remove o trim ou espaço em branco na string: " + "[" + string.trim() + "]");

        System.out.println("Deixa tudo em minusculo: " + string.toLowerCase());

        System.out.println("Deixa tudo em maiusculo: " + string.toUpperCase());

        System.out.println("Verifica se existe uma letra na string: " + string.contains("D"));

        System.out.println("Troca um dado por outro: " + string.replace("e", "&"));

        System.out.println("Verifica se uma string é igual a outra: " + string.equals(" Deus é meu pastor "));

        System.out.println("Verifica se uma string é igual a outra sem ligar pra maiuscula ou minuscula: "
                + string.equalsIgnoreCase(" DeUs é mEu pAstOr "));

        System.out.println("Mostra uma parte especifica da string: " + string.substring(1,5));

        System.out.println(String.format("Formata dados numa string: " +
                "Meu nome é %s e meu sobrenome é %s ", nome , sobrenome));

        System.out.println(String.format("Arredonda numeros: " + "Arredondando 1.2503 para %.2f", 1.2503));

        System.out.println("Transforma string em array: Deus é meu pastor".toCharArray());

    }
}
