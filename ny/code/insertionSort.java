void insertionSort(int[] a ){
    int i;
    int t;
    int max = a.length - 1;

    for (int k=0; k<max; k++){
        // Invariant: a[0..k] sortert
        // nå sortere a[k+1] inn på riktig plass
        if (a[k] > a[k+1]){
            t = a[k+1];
            i = k;

            do { //gå bakover, skyv de andre
                 //og finn riktig plass for 't'
                a[i+1] = a[i];
                i--;
            } while (i>=0 && a[i]>t) {
                a[i+1] = t;
            }
        }
    }
}
