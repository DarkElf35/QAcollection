

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTests {


    @Test
    void peekFirstTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "e"));
        assertEquals("a", linkedList.peekFirst());                      //тест на первый элемент списка
    }

    @Test
    void peekLastTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "e"));            //тест на последний элемент списка
        assertEquals("e", linkedList.peekLast());
    }



    @Test
    void pollLastTest() {
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));           //тестирование на выгрузку элемента и сравнение
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("1", "2", "3"));
        linkedList1.pollLast();
        assertEquals(linkedList2, linkedList1);
    }

    @Test
    void pollFirstTest() {
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));     //тестирование на выгрузку элемента и сравнение
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("2", "3", "4"));
        linkedList1.pollFirst();
        assertEquals(linkedList2, linkedList1);
    }



    @Test
    void getElementFirstTest() {
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование геттера
        assertEquals(1, linkedList1.getFirst());
    }

    @Test
    void addFirstTest() {
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(0, 1, 2, 3));
        linkedList1.addFirst(0);
        assertEquals(linkedList2, linkedList1);                           //тест на сравнение двух списков
    }

    @Test
    void peekLastIsEmptyTest() {
        LinkedList<String> linkedList = new LinkedList<>();                      //тест на пустой лист c возвращением пустого элемента
        assertEquals(null, linkedList.peekLast());
    }

    @Test
    void pollFirstIsEmptyTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList());                          //тест на пустой лист c возвращением удаленного пустого элемента , потом продолжить
        assertEquals(null, linkedList.pollFirst());
    }

    @Test
    void getElementLastTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование геттера
        assertEquals(4, linkedList.getLast());
    }

    @Test
    void getAddElementLastTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование на добавление в конец
        linkedList.addLast(234);
        assertEquals(234, linkedList.getLast());
    }

    @Test
    void getAddElementFirstTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование на добавление в начало
        linkedList.addFirst(10);
        assertEquals(10, linkedList.getFirst());
    }

    @Test
    void removeFirstElementTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование на удаление элемента из начала очереди
        assertEquals(1, linkedList.pop());
    }

    @Test
    void pushFirstElementTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));           //тестирование на добавление элемента в начало очереди
        linkedList.push(1128);
        assertEquals(1128,linkedList.getFirst() );
    }



}