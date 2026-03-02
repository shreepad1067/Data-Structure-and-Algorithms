#include <stdio.h>

int minOperations(char* s, int k) {
    int count = 0;
    for (int i = 0; i <= k; i++) {
        if (s[i] == '\0') return -1; /* string too short */
        if (s[i] == '0') {
            s[i] = '1';
            count++;
        } else if (s[i] == '1') {
            /* already 1, nothing to do */
        } else {
            return -1; /* invalid character */
        }
    }
}

int main() {
    char string;
    int x,k;
    printf("Enter the string and k value:");
    scanf("%s",string);
    //printf("Enter the k value :");
    scanf("%d", &k);
    x=minOperations(&string, k);
    printf("The minimum number of operations required is : %d",x);
    return 0;
}