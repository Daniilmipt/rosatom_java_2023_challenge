import java.util.LinkedList;

public class Task3_LinkedListReversal {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Исходный список:");
        System.out.println(linkedList);

        reverseLinkedList(linkedList);

        System.out.println("Инвертированный список:");
        System.out.println(linkedList);
    }

    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
