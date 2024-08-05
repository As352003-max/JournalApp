#include <stdio.h>

// Pascal's Triangle
// given a number print pascal's triangle upto that number

int factorial(int);
int combination(int, int);

int main() {
	int n;

	printf("Limit n: ");
	scanf("%d", &n);
	
	// for lines
	for(int i = 0; i <= n; i++) {

		// starting space power times spaces
		for(int s = n; s >= i; s--) {
			printf(" ");
		}
		
		// for the iterations for combinations from nC0 to nCn
		for(int j = 0; j <= i; j++) {
			int result = combination(i, j); // equivalent to iCj
			printf("%d ", result);
		}

		// end space same logic
		for(int s = n; s >= i; s--) {
			printf(" "); 	
		}
		
		printf("\n");
	}

	return 0;
}

int factorial(int n) {
	if(n == 0 || n == 1) {
		return 1;
	}
	return n * factorial(n-1);
}

int combination(int n, int r) {
	return factorial(n) / (factorial(r) * factorial(n-r));
}