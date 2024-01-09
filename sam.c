#include <stdio.h>

int main(){
	char str[100];
	int n;
	scanf("%s%n", str, &n);
	for (int i = n; i>=1; printf("%-*.*s%*.*s\n", n, i,str, n, i,str),i--);		
	for (int i = 1; i<=n; printf("%-*.*s%*.*s\n", n, i,str, n, i,str),i++);		
	
	
	return 0;
}