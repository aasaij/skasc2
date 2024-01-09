#include <stdio.h>

int main(){
	long long int n, sum = 0;
	scanf("%lld", &n);
	while (sum=sum*10+n%10,n/=10);
	printf("%lld", sum);
	return 0;
}