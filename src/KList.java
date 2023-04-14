
public class KList<K> {
    public K value;
    public KList<K> next;

    public KList(K value) {
        this.value = value;
    }

    public String toString(){
        return this.value.toString() + "->" + ((this.next != null) ? this.next.toString() : "null");
    }

    public static KList<Integer> construct(Integer[] values, int loop) {
        KList<Integer> head = new KList<Integer>(values[0]);
        KList<Integer> curr = head;
        KList<Integer> loopNode = (loop == 0) ? head : null;        

        for(int i = 1; i < values.length; i++) {
            KList<Integer> next = new KList<Integer>(values[i]);
            curr.next = next;
            curr = next;
            if (loop == i) {
                loopNode = curr;
            }
        }

        curr.next = loopNode;
        return head;
    }
}
