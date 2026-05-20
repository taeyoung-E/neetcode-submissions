class Node{
    Node next;
    int value;

    public Node(int val,Node next){
        this.next = next;
        this.value = val;
    }

    public Node(int val){
        this(val,null);
    }
}


class LinkedList {
    int size;
    Node head;
    Node tail;

    public LinkedList() {
        this.size = 0;
        head = null;
        tail = head;
    }

    public int get(int index) {
        if(head == null)
            return -1;
        if(index == 0){
            return head.value;
        }
        if(index >= size)
            return -1;
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.value;
    }

    public void insertHead(int val) {
        Node element = new Node(val);
        if(head == null){
            head = element;
            tail = head;
            ++size;
        }
        else{
            element.next = head;
            head = element;
            ++size;
        }
    }

    public void insertTail(int val) {
        Node element = new Node(val);
        if(tail == null){
            head = element;
            tail = element;
            ++size;
        }
        else{
            tail.next = element;
            tail = element;
            ++size;
        }
    }

    public boolean remove(int index) {
        Node curr = head;
        if(head == null)
            return false;
        if(index == 0){
            Node remove = head;
            head = head.next;
            remove.next = null;
            --size;
            return true;
        }
        if(index == size-1){
            Node ref = head;
            for(int i = 0; i < index-1; i++){
                ref = ref.next;
            }
            tail = ref;
            --size;
            return true;
        }
        if(index >= size)
            return false;
        Node prev = head;
        for(int i = 0; i < index - 1;i++)
            prev = prev.next;
        Node remove = prev.next;
        prev.next = remove.next;
        remove.next = null;
        --size;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> container = new ArrayList<>();
        Node curr = head;
        while(curr!= null){
            container.add(curr.value);
            curr = curr.next;
        }
        return container;

    }
}
