#include <stdio.h>
#include <math.h>
int main(){
	int x = 10, y, z;
	y = x++;
	z = ++x + y++;
	printf("%d %d %d", x, y, z);
return 0;
}