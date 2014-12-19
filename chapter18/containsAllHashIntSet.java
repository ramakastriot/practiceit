public boolean containsAll(HashIntSet s) {
    for(int i = 0; i < s.elementData.length; i++) {
        Node node = s.elementData[i];

        while(node != null) {
            if(!this.contains(node.data))
                return false;
            node = node.next;
        }
    }

    return true;
}
