package Exemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LanguageFav {
    public static void main(String[] args) {
        Set<Language> myLanguage = new HashSet<>(){{
            add(new Language("C#", 2000, "Visual Studio"));
            add(new Language("Python", 1980, "PyCharm"));
            add(new Language("Java", 1996, "Intellij"));
        }};

        myLanguage.forEach(System.out::println);

        System.out.println("\n--\t Ordem de inserção\t--");

        Set<Language> myLanguage2 = new LinkedHashSet<>(){{
            add(new Language("C#", 2000, "Visual Studio"));
            add(new Language("Python", 1980, "PyCharm"));
            add(new Language("Java", 1996, "Intellij"));
        }};
        myLanguage2.forEach(System.out::println);


    }
}

class Language {
    private String name;
    private Integer ageCreation;
    private String ide;

    public Language(String name, Integer ageCreation, String ide) {
        this.name = name;
        this.ageCreation = ageCreation;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public Integer getAgeCreation() {
        return ageCreation;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return name.equals(language.name) && ageCreation.equals(language.ageCreation) && ide.equals(language.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ageCreation, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", ageCreation=" + ageCreation +
                ", ide='" + ide + '\'' +
                '}';
    }
}
