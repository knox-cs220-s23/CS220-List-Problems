public class Floyd {
    public static void main(String[] args) throws Exception {
        KList<Integer> a = KList.construct(new Integer[] {1,2,3,4,5,6,7,8,9,10}, -1);
        KList<Integer> b = KList.construct(new Integer[] {1,2,3,4,5,6,7,8,9,10}, 3);
        KList<Integer> c = KList.construct(new Integer[] {1,2,3,4,5,6,7,8,9,10}, 0);

        //System.out.println(l.toString());
        System.out.println(findLoop(a));
        System.out.println(findLoop(b));
        System.out.println(findLoop(c));
    }

    public static boolean findLoop(KList<Integer> list) {
        KList<Integer> red = list;
        if(red.next == null) {
            return false;
        }

        KList<Integer> blue = list.next;

        while(red != blue) {
            if (blue.next == null) return false;
            blue = blue.next;
            if (blue == red) return true;
            blue = blue.next;
            if (blue == red) return true;
            red = red.next;
        }
        return false;
    }
}
