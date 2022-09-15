package org.example;

import java.util.*;

public class MapLearn {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Séclo 21", 432));
        }};

        Set<Map.Entry<String, Livro>> entries = meusLivros.entrySet();
        entries.forEach(s-> System.out.println(s.getKey() + " - " + s.getValue().getNome()));

        System.out.println("--\t Ordem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>((l1, l2) -> l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome()));
        meusLivros3.addAll(meusLivros.entrySet());

        meusLivros3.forEach(System.out::println);

    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}



