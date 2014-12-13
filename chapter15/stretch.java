public void stretch(int n) {
    int newSize = n * size;
    ensureCapacity(newSize);

    for(int i = size - 1; i >= 0; i--) {
        for(int j = 0; j < n; j++) {
            elementData[n * i + j] = elementData[i];
        }
    }

    size = newSize;
}
