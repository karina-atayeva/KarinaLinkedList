package lv.atayeva;

/**
 * Created with IntelliJ IDEA.
 * User: atayeva
 * Date: 8/13/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class CTCoListMain {
    public static void main(String[] args) {
        KarinaLinkedList<Integer> list = new KarinaLinkedList();
        //KarinaLinkedList<Integer> list;
        //list.get(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.get(0));
        System.out.println("Size: " + list.size());
        System.out.println("For each");
        for (Integer i: list)
            System.out.println(i);
        list.remove(2);
        System.out.println("Size: " + list.size());
        System.out.println("For each");
        for (Integer i: list)
            System.out.println(i);
    }
}
