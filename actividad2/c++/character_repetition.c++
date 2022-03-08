
#include <iostream>
#include <iterator>
#include <map>
using namespace std;

int main()
{

    map<char, int> uniqueLettersMap;

    string input;
    printf("Ingrese una cadena: ");
    getline(cin, input);

    for (auto it = input.begin(); it != input.end(); it++)
    {
        if (uniqueLettersMap.find(*it) != uniqueLettersMap.end())
        {
            uniqueLettersMap[*it]++;
        }
        else
        {
            uniqueLettersMap[*it] = 1;
        }
    }

    for (auto it = uniqueLettersMap.begin(); it != uniqueLettersMap.end(); it++)
    {
        cout << "La Letra " << it->first << " se repite " << it->second << " vez/veces." << endl;
    }

    return 0;
}