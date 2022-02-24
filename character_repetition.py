def getUniqueLettersWithRepetition(myString):
    uniqueLetters = {}

    for i in myString:
        if not i in uniqueLetters:
            uniqueLetters[i] = 1
        else:
            uniqueLetters[i] = uniqueLetters[i]+1

    return uniqueLetters

def main():
    myString = input("Ingrese una cadena: ")
    print(myString)

    uniqueLetters = getUniqueLettersWithRepetition(myString)

    for i in uniqueLetters:
        print('La letra', i, 'se repite', uniqueLetters[i], "vez/veces.")


main()
