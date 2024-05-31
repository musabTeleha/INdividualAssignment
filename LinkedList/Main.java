package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPos(1, 1);
        list.insertAtPos(2, 2);
        list.insertAtPos(3, 3);
        list.insertAtPos(4, 2);

        System.out.println("After insertions:");
        list.printList();

        list.deleteAtPosition(3);
        System.out.println("After deleting at position 3:");
        list.printList();

        list.deleteAfterNode(list.head);
        System.out.println("After deleting after head:");
        list.printList();

        System.out.println("Search for node with data 3: " + list.searchNode(3));
        System.out.println("Search for node with data 4: " + list.searchNode(4));

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }
}

