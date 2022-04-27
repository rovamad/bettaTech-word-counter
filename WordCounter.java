import java.io.*;
import java.text.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args){
        String parrafo = "Hola hola, buenas tardes. Este es un ejercicio planteado por el canal de " +
        "youtube de bettaTech, el lo hizo en javascript/typescript pero yo quería hacerlo con Java y" + 
        "este es el resultado.";
    
        System.out.println(counter(parrafo));
    }

    public static Map<String, Integer> counter(String parrafo) {
        Map<String, Integer> resultado = new HashMap<>();
        parrafo = normalize(parrafo);
        String[] parrafoDividido = parrafo.split(" ");

        for (int i=0; i<parrafoDividido.length; i++) {
            if (resultado.get(parrafoDividido[i]) != null) {
                resultado.replace(parrafoDividido[i], resultado.get(parrafoDividido[i]) + 1);
            } else {
                resultado.put(parrafoDividido[i], 1);
            }
        }

        return resultado;
    }

    private static String normalize(String parrafo) {
        return parrafo.toLowerCase().replaceAll("[^a-zA-Z0-9\\s\\n\\w]" ,"");
    }
}