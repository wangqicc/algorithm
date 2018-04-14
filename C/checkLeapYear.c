#include <stdio.h>
int checkLeap(int year) {
	if ((year % 4 == 0 && year / 100 != 0) || year % 400 == 0) {
		return 1;
	}
	return 0;
}
int main(){
    int year;
    scanf("%d", &year);
    if (checkLeap(year) == 1) {
    	printf("%d is a leap year!\n", year);
    } else {
    	printf("%d isn't a leap year!\n", year);
    }
    return 0;
}
