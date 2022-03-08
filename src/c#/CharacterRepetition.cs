using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ingrese una Cadena: \n");
        string input = Console.ReadLine();

        Dictionary<char, int> uniqueLettersMap = new Dictionary<char, int>();

        foreach (char c in input)
        {
            if (uniqueLettersMap.ContainsKey(c))
            {
                uniqueLettersMap[c]++;
            }
            else
            {
                uniqueLettersMap.Add(c, 1);
            }
        }

        foreach (KeyValuePair<char, int> letterRepetition in uniqueLettersMap)
        {
            Console.WriteLine(
                "La Letra {0} se repite {1} vez/veces.",
                letterRepetition.Key,
                letterRepetition.Value
            );
        }
    }
}
