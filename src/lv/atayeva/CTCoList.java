package lv.atayeva;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: atayeva
 * Date: 8/13/13
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CTCoList<T> extends Iterable<T> {

    void add(T value);

    T get(int i);

    void clear();

    int size();

    boolean remove(int i);

    Iterator<T> iterator();
}

//T - tip, kotorij na moment runtime podajotsa kak parametr; mozno ispoljzovatj kak gde ugodno kak tip
//V interfaisah public ne ispoljzuetsa
