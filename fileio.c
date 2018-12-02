/*
 * 2017.12.04
 * Hannam University
 * C programming
 * Final-term: File I/O
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int SelectMenu()
{
    int key = 0;
    printf("\n<Select Menu>)\n");
    printf(" 1: Create File \n 2: Copy \n 3: Add contents \n 4: Rename \n 5: Delete File \n");
    printf("Select number : ");
    scanf("%d", &key);
    return key;
}
int NewFile(void)
{   FILE* fp;
    char name[200];
    char ch[200];
    printf("Name(with Directory) : ");
    scanf("%s", name);
    fp = fopen(name, "r");
    if (fp != NULL)
    {
        perror("Exist same name");
        exit(0);
    }
    fp = fopen(name, "w");
    printf("Insert contents\n");
    getchar();
    gets(ch);
    fputs(ch, fp);
    printf("Success!\n");
    fclose(fp);
    return 0;
}

int FileCopy(void)
{
    FILE *in, *out;
    char file1[30], file2[30];
    char ch[100], temp;

    printf("File1(Original) : ");
    scanf("%s", file1);

    printf("File2(To this file) : ");
    scanf("%s", file2);


    in = fopen(file1, "r");
    if(in == NULL)
    {
        printf("%s file open error. \n", file1);
        return 0;
    }
    out = fopen(file2, "w");
    if(out == NULL)
    {
        printf("%s file open error. \n", file2);
        return 0;
    }

    fflush(out);
    fflush(in);

    while ( (temp = fgetc(in)) != EOF)
        fputc(temp, out);
    printf("OK ... \n", file1, file2);
    fclose(in);
    fclose(out);
    return 0;

}

int AddInform(void)
{
    FILE* fp;
    char file[100];
    char ch[100];

    printf("Add contents-Select your file");
    scanf("%s", file);

    fp = fopen(file, "a+");
    fflush(fp);

    if (fp == NULL)
    {
        perror("Not exists");
        return 0;
    }
    printf("File name: \n");

    getchar();
    gets(ch);
    fputs(ch, fp);

    printf("Complete!\n");
    fclose(fp);
    return 0;
}
int FileName(void)
{
    char before_name[100];
    char after_name[100];

    printf("Current Name : ");
    getchar();
    gets(before_name);
    printf("Change Name : ");
    gets(after_name);
    if (rename(before_name, after_name) != '\0')
        perror("Complete");
    else
        printf("Error");
}
int DeleteFile()
{
    FILE *fp;
    char file[100];
    char buffer[100];

    printf("Delete your file?(Directory):  ");
    scanf("%s", file);

    if (remove(file) == -1)
        printf("\n%sFile wasn't deleted.\n", file);
    else
        printf("%sfile was deleted.\n", file);
}
int main(void) {
    int num;
    int key = 0;
    while ((key = SelectMenu()) != 0)
    {
        switch (key)
        {
            case 1:
                NewFile();
                break;
            case 2:
                FileCopy();
                break;
            case 3:
                AddInform();
                break;
            case 4:
                FileName();
                break;
            case 5:
                DeleteFile();
                break;
            default:
                printf("\n Error!!!\n ");
                break;
        }
    }
    printf("\n! ! ! what?!? ! ! !\n\n");
    return 0;
}
