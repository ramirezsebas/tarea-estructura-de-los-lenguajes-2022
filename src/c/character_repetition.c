#include <stdio.h>

struct Key
{
    char c;
};

struct Value
{
    int frec;
};

struct HashMap
{
    struct Key key;
    struct Value value;
};

int main()
{
    struct HashMap map[100];
    for (size_t i = 0; i < 100; i++)
    {
        map[i].key.c = ' ';
        map[i].value.frec = 0;
    }

    char input[100];
    printf("Ingrese una cadena: ");
    gets(input);

    int i = 0;
    while (input[i] != '\0')
    {
        char character = input[i];
        int index = input[i] % 100;
        map[index].key.c = input[i];
        printf("La letra %c se repite ", map[index].key.c);
        map[index].value.frec = map[index].value.frec + 1;
        printf("%d vez/veces\n", map[index].value.frec);
        i++;
    }

    return 0;
}