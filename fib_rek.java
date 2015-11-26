public int recursiveFib(int n) {
	if (n == 1 || n == 2) {
		return 1;
	else {
		return recursiveFib(n-1) + recursiveFib(n-2);
	}
}
