public static void floyd(int[][] naboer, int[][] avstander, int[][] vei) {
	int n = avstand.length
	
	// Initialisering:
	for (int i=0; i<n; i++) {
		for (int j=0; j<n; j++) {
			avstand[i][j] = nabo[i][j];
			vei[i][j] = -1;
		}
	}
	
	// Finne veier:
	for (int k=0; k<n; k++) {
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (avstand[i][k] + avstand[k][j] < avstand[i][j]) {
					avstand[i][j] = avstand[i][k] + avstand[k][j];
					vei[i][j] = k;
				}
			}
		}
	}
}
