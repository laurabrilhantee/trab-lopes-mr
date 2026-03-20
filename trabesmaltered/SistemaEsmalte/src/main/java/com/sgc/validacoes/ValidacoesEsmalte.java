package main.java.com.sgc.validacoes;

public class ValidacoesEsmalte {

    private ValidacoesEsmalte() {

    }

    // Validação do nome do esmalte
    public static boolean nomeEsmalteValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNomeEsmalte(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: o nome do esmalte nao pode ser vazio";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: o nome do esmalte nao pode conter numeros";
        }
        return "";
    }

    // Validação da marca do esmalte
    public static boolean marcaValida(String marca) {
        return !(marca == null || marca.trim().isEmpty());
    }

    public static String mensagemErroMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            return "Erro: a marca do esmalte nao pode ser vazia";
        }
        return "";
    }

    // Validação do preço
    public static boolean precoValido(double preco) {
        return preco >= 0 && preco <= 500;
    }

    public static String mensagemErroPreco(double preco) {
        if (preco < 0) {
            return "Erro: o preco nao pode ser negativo";
        } else if (preco > 500) {
            return "Erro: preco muito alto para um esmalte";
        }
        return "";
    }

    // Validação da quantidade em estoque
    public static boolean quantidadeValida(int quantidade) {
        return quantidade >= 0;
    }

    public static String mensagemErroQuantidade(int quantidade) {
        if (quantidade < 0) {
            return "Erro: a quantidade em estoque nao pode ser negativa";
        }
        return "";
    }
}