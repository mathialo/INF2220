public int dynamicFib(int n) {
	int last = 1, lastlast = 1, fibNum = 1;
	
	for (int i=3; i<=n; i++) {
		fibNum = last + lastlast;
		lastlast = last;
		last = fibNum;
	}
	
	return fibNum;
}
