class NumberContainers {
    Map<Integer, Integer> indexToNumber;
    Map<Integer, TreeSet<Integer>> numberToIndices;
    public NumberContainers() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);
            numberToIndices.get(oldNumber).remove(index);
            if (numberToIndices.get(oldNumber).isEmpty()) {
                numberToIndices.remove(oldNumber);
            }
        }
        indexToNumber.put(index, number);
        if (!numberToIndices.containsKey(number)) {
            numberToIndices.put(number, new TreeSet<>());
        }
        numberToIndices.get(number).add(index);
    }
    
    public int find(int number) {
        if (numberToIndices.containsKey(number)) {
            TreeSet<Integer> indices = numberToIndices.get(number);
            if (!indices.isEmpty()) {
                return indices.first();
            }
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */