public void removeAll(int n) {
    int i = 0;

    while(i < size) {
        if(elementData[i] == n) {
            remove(i);
        } else {
            i++;
        }
    }
}
