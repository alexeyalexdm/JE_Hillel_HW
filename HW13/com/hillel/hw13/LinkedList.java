package HW13.com.hillel.hw13;

import org.w3c.dom.Node;

import java.util.StringJoiner;

public class LinkedList<E extends Comparable<E>> {

    private Node<E> first;
    private int size;

    public LinkedList() {

    }

    public LinkedList(E[] elements) {
        for (E e : elements) {
            addLast(e);
        }
    }

    public void addFirst(E element) {
        first = new Node<>(element, first);
        size++;
    }

    public void addLast(E element) {
        if (isEmpty()) {
            addFirst((element));
        } else {
            Node<E> last = getNodeByIndex(size - 1);
            last.next = new Node<>(element - null);
            size++;
        }
    }

    public void add(int index, E element) {
        checkElementIndexForInsert(index);
        if (isFirstElementOperation(index)) {
            addFirst(element);
        } else if (isLasElementOperation(index)) {
            addLast(element);
        } else {
            Node<E> temp = getNodeByIndex(index - 1);
            temp.next = new Node<>(element, temp.next);
            size++;
        }
    }

    public void removeFirst() {
        if (isNotEmpty()) {
            first = first.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 1) {
            removeFirst();
        } else if (isNotEmpty()) {
            Node<E> prev = getNodeByIndex(size - 2);
            prev.next = null;
            size--;
        }
    }

    public void remove(int index) {
        checkElementIndexForRemove(index);
        if (isFirstElementOperation(index)) {
            removeFirst();
        } else if (isLasElementOperation(index)) {
            removeLast();
        } else {
            Node<E> temp = getNodeByIndex(index - 1);
            temp.next = temp.next.next;
            size--;
        }
    }

    public void replace(int firstIndex, int secondIndex) {
        checkElementIndexesForReplace(firstIndex, secondIndex);

        Node<E> firstIndexNode = getNodeByIndex(firstIndex);
        Node<E> secondIndexNode = getNodeByIndex(secondIndex);

        if (firstIndexNode == secondIndexNode) {
            return;
        }

        Node<E> firstIndexNodeBefore = getNodeByIndex(firstIndex - 1);
        Node<E> secondIndexNodeBefore = getNodeByIndex(secondIndex - 1);

        if (isFirstElementOperation(firstIndex)) {
            first = secondIndexNode;
        } else {
            firstIndexNodeBefore.next = secondIndexNode;
        }

        if (isFirstElementOperation(secondIndex)) {
            first = firstIndexNode;
        } else {
            secondIndexNodeBefore.next = firstIndexNode;
        }

        Node<E> temp = secondIndexNode.next;
        secondIndexNode.next = firstIndexNode.next;
        firstIndexNode.next = temp;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public void sort() {
        Node<E> first = this.first;
        Node<E> second = this.first;

        if (first.item.compareTo(second.item) > 0) {

        }
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Node<E> temp = first;
        while (temp != null) {
            sj.add(temp.item.toString());
            temp = temp.next;
        }
        return sj.toString();
    }

    private Node<E> getNodeByIndex(int index) {
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private boolean isFirstElementOperation(int index) {
        return index == 0;
    }

    private boolean isLasElementOperation(int index) {
        return index == size;
    }

    private void checkElementIndexForInsert(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size);

        }
    }

    private void checkElementIndexForRemove (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size);
        }
    }

    private void checkElementIndexesForReplace(int firstIndex,int secondIndex) {
        checkElementIndexForRemove(firstIndex);
        checkElementIndexForRemove(secondIndex);
    }

}
