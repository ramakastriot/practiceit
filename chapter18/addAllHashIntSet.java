public void addAll(HashIntSet s) {
    for(int i = 0; i < s.elementData.length; i++) {
        Node node = s.elementData[i];

        while(node != null) {
            if(!this.contains(node.data))
                this.add(node.data);
            node = node.next;
        }
    }
}
