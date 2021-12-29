public class List {
    //Реализация полей
    private Node head;
    private Node tail;
    public List(){
        head = null;
        tail = null;
    }

    //Проверка на пустоту списка
    private boolean isEmpty(){
        return head == null;
    }

    //Добавление в начало
    public void addFirst(int data){
        Node temp = new Node(data);

        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    //Добавление по индексу(кроме крайних добавлений, для этого создал addFirst и addLast)
    public void addByIndex(int data, int index){
        Node cur = head;
        int c = 0;

        while(cur!=null && c!=index){
            cur = cur.next;
            c++;
        }

        Node temp = new Node(data);
        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;

    }

    //Добавление в хвост
    public void addLast(int data){
        Node temp = new Node(data);
        if(isEmpty())
            head = temp;
        else
            tail.next=temp;
        temp.prev = tail;
        tail = temp;
    }

    //Распечатка
    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
