class DynamicArray {
    int size;
    int[] arr;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity)
            resize();
        arr[size] = n;
        ++size;
    }

    public int popback() {
        int endVal = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return endVal;
    }

    private void resize() {
        capacity *= 2;
        int[] temp = new int[capacity * 2];

        for(int i = 0; i < size; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
