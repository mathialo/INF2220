void quickSort(int[] a, int l, int r){
    int i = l;
    int j = r;
    int t;
    int part = a[(l+r)/2];

    while (i <= j){
        while (a[i] < part){
            i++; //hopp over små
        }
        while (part < a[j]){
            j--; //hopp over store
        }

        if (i <= j){
            t = a[j];
            a[j] = a[i];
            a[i] = t;

            i++;
            j--;
        }
    }
    if (l < j){
        quicksort(a,l,j);
    }
    if (l < r){
        quicksort(a,i,r);
    }
}
