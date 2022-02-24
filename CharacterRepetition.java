import java.util.*;

public class CharacterRepetition {
    public static HashMap<Character, Integer> getUniqueLettersRepetition(String myString) {
        //Creamos un Map para almacenar la sgnt informacion:
        //  {
        //      "caracter":numero de veces que se repite
        //  }
        //  Ejemplo:
        //  {
        //      'a':2,
        //      'b':1          
        //  }
        //
        //
        HashMap<Character, Integer> uniqueLettersMap = new HashMap<>();

        //Recorremos la cadena ingresada 
        //y verificamos si es que la letra ya existe en el map
        //Si no existe lo agregamos e inicializamos la repeticion a 1
        //Sino incrementamos el valor de la repeticion para esa letra
        for (int i = 0; i < myString.length(); i++) {
            char currentLetter = myString.charAt(i);
            if (!uniqueLettersMap.containsKey(currentLetter)) {
                uniqueLettersMap.put(currentLetter, 1);
            } else {
                int repetitionOfCurrentLetter = uniqueLettersMap.get(currentLetter);
                uniqueLettersMap.replace(currentLetter, repetitionOfCurrentLetter + 1);
            }
        }

        return uniqueLettersMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String myString = scanner.nextLine();

        HashMap<Character, Integer> allUniqueLettersWithRepetition = CharacterRepetition
                .getUniqueLettersRepetition(myString);

        for (Map.Entry<Character, Integer> uniqueLetterWithRepetition : allUniqueLettersWithRepetition.entrySet()) {
            System.out.println("La Letra " + uniqueLetterWithRepetition.getKey() + " se repite "
                    + uniqueLetterWithRepetition.getValue() + " veces.");
        }

        scanner.close();

    }
}
