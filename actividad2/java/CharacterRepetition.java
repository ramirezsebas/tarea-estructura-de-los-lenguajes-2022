import java.util.*;

public class CharacterRepetition {
    public static HashMap<Character, Integer> getUniqueLettersRepetition(String myString) {
        HashMap<Character, Integer> uniqueLettersMap = new HashMap<>();

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

    public static void printLettersRepetition(HashMap<Character, Integer> uniqueLettersMap) {
        for (Map.Entry<Character, Integer> uniqueLetterWithRepetition : uniqueLettersMap.entrySet()) {
            System.out.println("La Letra " + uniqueLetterWithRepetition.getKey() + " se repite "
                    + uniqueLetterWithRepetition.getValue() + " veces.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String myString = scanner.nextLine();

        HashMap<Character, Integer> allUniqueLettersRepetition = CharacterRepetition
                .getUniqueLettersRepetition(myString);

        CharacterRepetition.printLettersRepetition(allUniqueLettersRepetition);

        scanner.close();

    }
}
