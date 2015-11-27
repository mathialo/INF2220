void optBubbleSort(int[] A){
    int i = 0;

    while (i < A.length){
        if (A[i] > A[i+1]){
            swap(A[i], A[i+1]);
            if (i > 0){
                i -= 1;
            } else {
                i += 1;
            }
        }
    }
}
