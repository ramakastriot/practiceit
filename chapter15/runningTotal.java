public ArrayIntList runningTotal() {
    ArrayIntList result = new ArrayIntList(size);
    int runningSum = 0;

    for(int i = 0; i < size; i++) {
        runningSum += elementData[i];
        result.add(runningSum);
    }

    return result;
}
