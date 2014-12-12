public void mirror() {
    int newSize = 2 * size;
    ensureCapacity(newSize);

    for(int i = 0; i < size; i++) {
        elementData[newSize - i - 1] = elementData[i];
    }

    size = newSize;
}
