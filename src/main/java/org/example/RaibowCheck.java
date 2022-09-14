package org.example;

import java.util.*;

public class RaibowCheck {
    void run() {
        Set<String> rainbowColors = new HashSet<>(Arrays.asList(Rainbow.getRainbowColors()));

        rainbowColors.forEach(System.out::println);

        System.out.println("--\t Total de cores: " + rainbowColors.size() + "\t--");

        System.out.println("--\t Em Ordem Alfabetica \t--");
        Set<String> rainbowColors2 = new TreeSet<>(Arrays.asList(Rainbow.getRainbowColors()));

        System.out.println(rainbowColors2 + "\n");

        System.out.println("--\t Exiba as cores na ordem inversa da que foi informada \t--");
        List<String> rainbowColor3 = new ArrayList<>(Arrays.asList(Rainbow.getRainbowColors()));
        Collections.reverse(rainbowColor3);
        System.out.println(rainbowColor3 + "\n");

        System.out.println("--\t Exiba todas as cores que começam com a letra ”v” \t--");
        for(String cor : rainbowColors){
            if (cor.toLowerCase().startsWith("v")) System.out.println(cor);
        }

        System.out.println("\n" + "--\t Remova todas as cores que não começam com a letra “v” \t--");
        Iterator<String> iterator = rainbowColors.iterator();
        while (iterator.hasNext()){
            String cor = iterator.next().toLowerCase();
            if(cor.startsWith("v")) iterator.remove();
        }
        System.out.println(rainbowColors + "\n");

        System.out.println("--\t Limpe o conjunto” \t--");
        rainbowColors.clear();
        System.out.println(rainbowColors + "\n");

        System.out.println("--\t Confira se o conjunto está vazio” \t--");
        System.out.println(rainbowColors.isEmpty());


    }

}

class Rainbow {
    static String[] rainbowColors = {"Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"};


    static public String[] getRainbowColors() {
        return rainbowColors;
    }
}

