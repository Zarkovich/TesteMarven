package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckTemperature {
    static List<Temperature> tempList = new ArrayList<>() {{
        add(new Temperature(31, "Janeiro"));
        add(new Temperature(30, "Fevereiro"));
        add(new Temperature(23, "Março"));
        add(new Temperature(22, "Abril"));
        add(new Temperature(28, "Maio"));
        add(new Temperature(25, "Junho"));
    }};

    static void run() {
        System.out.println(tempList);
        checkMonth();
    }

    static void checkMonth() {
        Double media = mediaTemp();
        Integer indice = 1;

        Iterator<Temperature> iterator = tempList.iterator();
        while (iterator.hasNext()) {
            Temperature num = iterator.next();
            if(num.getTemp() > media) System.out.println( indice++ + " - " + num.getMounth());

        }
    }

    static double mediaTemp() {
        Double soma = 0d;

        Iterator<Temperature> iterator = tempList.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next().getTemp();
        }

        return soma / tempList.size();
    }

}

class Temperature {
    private Integer temp;
    private String mounth;

    public Temperature(Integer temp, String mounth) {
        this.temp = temp;
        this.mounth = mounth;
    }

    public Integer getTemp() {
        return temp;
    }

    public String getMounth() {
        return mounth;
    }

    @Override
    public String toString() {
        return "{" +
                "temp=" + temp +
                ", mounth='" + mounth + '\'' +
                '}';
    }
}