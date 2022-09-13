package org.example;

import java.util.*;

public class CheckCrimes {
    static List<String> quests = new ArrayList<>() {{
        add("Telefonou para a vítima?");
        add("Esteve no local do crime?");
        add("Mora perto da vítima?");
        add("Devia para a vítima?");
        add("Já trabalhou com a vítima?");
    }};

    static void run() {
        Scanner scanner = new Scanner(System.in);

        Iterator<String> iterator = quests.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            Answers.addResposta(scanner.nextLine());
        }

        Iterator<String> iterator1 = Answers.getRespostas().iterator();
        Integer resAmount = 0;
        while (iterator1.hasNext()) {
            String resp = iterator1.next();
            if (resp.equalsIgnoreCase("sim")) resAmount++;
        }
        System.out.println(resAmount);

        switch (resAmount) {
            case 2 -> System.out.println("Suspeito");
            case 3, 4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassina");

        }


    }

}

class Answers {
    static List<String> respostas = new ArrayList<>();

    static void addResposta(String resp) {
        respostas.add(resp);
    }

    public static List<String> getRespostas() {
        return respostas;
    }
}
