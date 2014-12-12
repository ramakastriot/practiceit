public void removeFront(int n) {
    for(int i = n; i < size; i++) {
        elementData[i - n] = elementData[i];
    }

    size -= n;
}
