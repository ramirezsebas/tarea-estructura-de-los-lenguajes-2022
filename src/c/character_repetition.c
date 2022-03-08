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
        map[index].value.frec = map[index].value.frec + 1;
        i++;
    }

    for (size_t i = 0; i < 100; i++)
    {
        if (map[i % 100].value.frec > 0)
        {
            printf("La letra %c se repite ", map[i].key.c);
            printf("%d vez/veces\n", map[i].value.frec);
        }
    }

    return 0;
}