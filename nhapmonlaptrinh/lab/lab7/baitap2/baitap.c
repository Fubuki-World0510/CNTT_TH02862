#include <stdio.h>
#include <string.h>

int main()
{
    char user1[] = "Admin";
    char user2[50], password[50];
    char pass[] = "1tthaamn";

    printf("Nhap User: ");
    gets(user2);
    printf("Nhap Password: ");
    gets(password);

    if (strcmp(user2, user1) == 0 && strcmp(password, pass) == 0) // So sánh string
    {
        printf("Full Access");
    }
    else
    {
        printf("Sai mat khau, xoa system32 trong 10 giay");
    }
}