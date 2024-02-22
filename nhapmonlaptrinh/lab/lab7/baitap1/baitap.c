#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char sus[50];

    printf("Nhap ten: ");
    gets(sus);
    int na, pa, i;
    na = 0;
    pa = 0;

    for (i = 0; i < strlen(sus); i++) // Xem độ dài chuỗi
    {
        char ch = tolower(sus[i]); // Ký tự hoa

        if (isalpha(ch))
        {
            if (ch == 'u' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i')
            {
                na++;
            }
            else
            {
                pa++;
            }
        }
    }
    printf("\nSo nguyen am la: %d", na);
    printf("\nSo phu am la: %d", pa);
    return 0;
}