void bubbleSort(int[] A){
    boolean swapped = true;
    while (swapped){
        swapped = false;
        for (int i=1; i<A.length; i++){
            // pair out of order
            if (A[i-1] > A[i]){
                swap(A[i-1],A[i]);
                swapped = true;
            }
        }
    }
}
