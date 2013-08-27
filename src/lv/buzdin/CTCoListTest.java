package lv.buzdin;

import lv.atayeva.KarinaLinkedList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CTCoListTest {

    private KarinaLinkedList<String> list;

    @Before
    public void setUp() {
        list = new KarinaLinkedList<>();
    }

    @Test
    public void testAdd(){
        list.add("1");

        assertThat(list.get(0), equalTo("1"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIfEmptyList(){
        list.get(0);
    }

    @Test
    public void testSize(){
        list.add("1");

        assertThat(list.size(), equalTo(1));
    }

    @Test
    public void testDeletion(){
        list.add("1");
        list.add("2");
        list.add("3");

        list.remove(1);

        assertThat(list.get(1), equalTo("3"));
    }

    @Test
    public void testForEach(){
        list.add("1");
        list.add("2");
        list.add("3");

        int count = 0;

        for (String item : list) {
            count++;
        }
        assertThat(count, is(3));
    }

    @Test
    public void testEmptyIteratorHasNext(){
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext(), is(false));
    }

    @Test
    public void testIteratorHasNext(){
        list.add("2");

        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext(), is(true));
    }

    @Test
    public void testIteratorRemove(){
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();

        iterator.next();
        iterator.remove();

        assertThat(iterator.next(), is(equalTo("2")));
    }

    @Test
    public void testInsertNull(){
        list.add(null);
        list.add("2");

        assertThat(list.size(), is(2));
    }
}

