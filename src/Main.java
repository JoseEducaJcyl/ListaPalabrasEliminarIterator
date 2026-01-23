import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<String>();
        palabras.add("Arbol");
        palabras.add("Carrera");
        palabras.add("Macarrones");
        palabras.add("Telefono");
        palabras.add("CPU");
        Iterator<String> iterador = palabras.iterator();
        while (iterador.hasNext()) {
            String palabra = iterador.next();
            for (int i = 0; i <= palabra.length()-1; i++) {
                char letra = palabra.charAt(i);
                if (letra == 'a' || letra == 'A') {
                    iterador.remove();
                    break;
                }
            }
        }
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}