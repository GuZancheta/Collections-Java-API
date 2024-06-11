package main.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GenericsExampleList {

    static Logger logger = Logger.getLogger(GenericsExampleList.class.getName());

    public static void main(String[] args) {

        // Exemplo sem Generics
         List listaSemGenerics = new ArrayList<>();
         listaSemGenerics.add("Elemento 1");
         listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        List<String> listaStringGenerics = new ArrayList<>();
        listaStringGenerics.add("Elemento 1");
        listaStringGenerics.add("Elemento 2");

        // Iterando sobre lista com Generics
        listaStringGenerics.forEach(System.out::println);

        // Iterando sobre a lista sem Generics
        listaSemGenerics.forEach(object -> {
            String str = (String) object;
            System.out.println(object);
//            logger.info(str);
        });
    }
}
