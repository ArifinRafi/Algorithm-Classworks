package practice;

	public void DoublyLink(int [] cir, int start, int size){
    int a[] = new int [size];
    int st = start = 0;
    for(int i = 0; i<size; i++){
        a[i] = cir[st++];
        if(st == cir.length) st = 0;
    }
    Arrays.sort(a);
    int secondMaximum = a[a.length-2];
    int secondMinimum = a[1];
    int maxIndex = -1;
    int minIndex = -1;
    for(int i = 0; i<cir.length; i++){
        if(secondMax == cir[i]) maxIndex = i;
        if(secondMin == cir[i]) minIndex = i;
    } 
    //using insert Method that inserts at given index of circular Array;
    insertAt(maxIndex-1, secondMaximum+secondMinimum);
    insertAt(minIndex+1, secondMaximum*secondMinimum);
    
}

}
