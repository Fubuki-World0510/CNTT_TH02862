#include <stdio.h>

int chuc1(int xDep)
{
    if (xDep > 0)
        return 1;
    else
        return 0;
}

int ham(int so1, int so2, int so3)
{
    int max = so1;
    if (max < so2)
        max = so2;
    if (max < so3)
        max = so3;
    return max;
}

int ham2(int s1, int s2, int s3)
{
    int min = s1;
    if (min > s2)
        min = s2;
    if (min > s3)
        min = s3;
    return min;
}

int main()
{
    int menu;
    do
    {
        printf("========[MENU FR]=================================\n");
        printf("1. Check (+) va (-)\n");
        printf("2. Chan le momo\n");
        printf("3. Max cua 3 so\n");
        printf("4. Min cua 3 so\n");
        printf("5. Check tuoi offline\n");
        printf("6. Check diem trung binh toan ly hoa\n");
        printf("7. Nhap nguyen duong in ra le tu 1-n va dem cac so trong khoang 0-n\n");
        printf("Lua chon cua ban la [1 -> 11]: ");
        scanf("%d", &menu);

        switch (menu)
        {
        case 1:
        {
            printf("DAY LA LUA CHON 1\n");
            int xDep;
            printf("Nhap 1 so nguyen cho tao: ");
            scanf("%d", &xDep);
            if (chuc1(xDep) == 1)
                printf("Duong\n");
            else
                printf("Am\n");
            break;
        }

        case 2:
        {
            printf("DAY LA LUA CHON 2\n");
            int deptrai;
            printf("Nhap 1 so nguyen cho tao, lam on: ");
            scanf("%d", &deptrai);
            printf("Ok ban da lam rat tot, day la con so cua ban: %d\n", deptrai);
            if (deptrai % 2 == 0)
                printf("Chan\n");
            else
                printf("Le\n");
            break;
        }
        case 3:
        {
            int a, b, c;
            printf("Nhap 3 so di lam on: ");
            scanf("%d", &a);
            scanf("%d", &b);
            scanf("%d", &c);
            printf("Max = %d\n", ham(a, b, c));
            break;
        }

        case 4:
        {
            int y, z, t;
            printf("Nhap 3 so lan nua di lam on: ");
            scanf("%d", &y);
            scanf("%d", &z);
            scanf("%d", &t);
            printf("Min = %d\n", ham2(y, z, t));
            break;
        }
        case 5:{
            
        }
            break;

        case 6:
            break;

        case 7:
            break;

        default:
            break;
        }
    } while (menu != 7);

    return 0;
}
