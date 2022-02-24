#!bin/bash

if [ $# -ne 1 ]
then
    echo "Usage: $0 <Lenguaje>"
    exit 1
fi

SELECTED_LANGUAGE_LOWER_CASE=$(echo $1 | tr 'A-Z' 'a-z')

case $SELECTED_LANGUAGE_LOWER_CASE in
python)
    echo "Ejecutando programa en Python:"
    python3 character_repetition.py
    ;;
c)
    echo "Ejecutando programa en C:"
    gcc -o character_repetition character_repetition.c
    ./character_repetition
    rm -rf ./character_repetition
    ;;
java)
    echo "Ejecutando programa en Java:"
    javac CharacterRepetition.java
    java CharacterRepetition
    rm -rf CharacterRepetition.class
    ;;
*)
    echo $"Usage: $0 {python | c | java}"
    exit 1
    ;;
esac