public class Runner {
    public static void main(String[] args) {
        List list = new List();
        list.addFirst(4);
        list.addFirst(2);
        list.addLast(5);
        list.addByIndex(3,1);
        list.addByIndex(10,3);
        list.addFirst(1);
        list.print();
    }
}
