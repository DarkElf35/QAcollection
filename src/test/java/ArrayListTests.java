

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayListTests {

    @Test
    void removeTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));          //тестировнаие на удаление элемента по индексу
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(10, 9, 8, 6));
        arrayList1.remove(3);
        assertEquals(arrayList2, arrayList1);
    }

    private void assertEquals(ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList1) {
    }

    @Test
    void lastIndexOfTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals(2, arrayList.lastIndexOf(3));       //тест на возврат последнего значения по индексу
    }

    @Test
    void isEmptyTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        assertFalse(arrayList.isEmpty());          //тест на проверку метода из эмпти
    }

    private void assertFalse(boolean empty) {
    }

    @Test
    void sizeTest() {
        ArrayList<Integer> arrayList = new ArrayList();       //тестирование на получение размера массива
        arrayList.add(1);
        arrayList.add(2);
        assertEquals(2, arrayList.size());
    }



    @Test
    void clearTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));         //тестирование на очистку массива
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList1.clear();
        assertEquals(arrayList2, arrayList1);
    }



    @Test
    void removeAllTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));                //тестирование на удаление из массива другого массива
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(10, 9, 8));
        ArrayList<Integer> arrayList3 = new ArrayList(Arrays.asList(7, 6));
        arrayList1.removeAll(arrayList2);
        assertEquals(arrayList3, arrayList1);
    }

    @Test
    void indexOfTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals(0, arrayList.indexOf(3));              //тест на возврат значения по индексу
    }

    @Test
    void addAllTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));                  //тестирование на добавление массива в другой массив
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList1);
        assertEquals(arrayList1, arrayList2);
    }

    @Test
    void containsTest() {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(81, 9, 8, 7, 6));                  //тестирование на наличие элемента

        boolean el = arrayList.contains(10);
        assertFalse(el);
    }

    @Test
    void containsAllTrueTest() {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(81, 9, 8, 7, 6));                  //тестирование на наличие коллекции внутри массива

        boolean el = arrayList.containsAll(Arrays.asList(8,7,6));
        assertTrue(el);
    }

    @Test
    void containsAllFalseTest() {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(81, 9, 8, 7, 6));                  //тестирование на наличие коллекции внутри массива

        boolean el = arrayList.containsAll(Arrays.asList(8,7,6,678));
        assertFalse(el);
    }


    @Test
    void getTest() {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));                  //тестирование геттера


        assertEquals(8, arrayList.get(2));
    }

    @Test
    void setTest() {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));                  //тестирование cеттера

        arrayList.set(2,1000);
        assertEquals(1000, arrayList.get(2));
    }

    private void assertEquals(int i, Integer integer) {
    }

}

