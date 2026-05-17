package VariaveiseETipos;

public class Exercicio5 {
    public static void main (String[] args){
        String titulo = "Um Tom Mais Escuro de Magia";
        String autor = "V.E Schwab";
        int numeroDePaginas = 440;
        double precoDoLivro = 43.27;
        String categoria = "F";

        if (categoria.equalsIgnoreCase("F")) {
            categoria = "ficção";
        } else if (categoria.equalsIgnoreCase("N")) {
            categoria = "não-ficção";
        } else if (categoria.equalsIgnoreCase("T")) {
            categoria = "tecnologia";
        } else if (categoria.equalsIgnoreCase("H")) {
            categoria = "história";
        }

        System.out.println("Livro cadastrado:" +  titulo +
                ", de " + autor +
                ".\nEle possui " + numeroDePaginas +
                " páginas, custa R$" + precoDoLivro +
                " e pertence à categoria " + categoria + ".");
    }
}
