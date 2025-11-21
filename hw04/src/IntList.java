

public class IntList {
    int first;
    IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. Must use recursion.
     *
     * This method is non-destructive, i.e. it must not modify the original list.
     */
    public static IntList incrRecursiveNondestructive(IntList L, int x) {
        // TODO: Fill in this code

        if (L.rest == null){
            return new IntList(L.first + x, null);
        }
        IntList newList = new IntList(L.first + x, L.rest);
        newList.rest = incrRecursiveNondestructive(L.rest, x);
        return newList;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrRecursiveDestructive(IntList L, int x) {
        // TODO: Fill in this code
        if (L.rest == null){
            L.first = L.first + x;
            return L;
        }
        L.first = L.first + x;
        L.rest = incrRecursiveDestructive(L.rest, x);
        return L;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed
     * to use recursion. May not modify the original list.
     */
    public static IntList incrIterativeNondestructive(IntList L, int x) {
        // TODO: Fill in this code
        IntList newList = new IntList(L.first + x, null);
        IntList currentNode = newList;

        IntList p = L.rest;
        while(p != null){
            IntList newNode = new IntList(p.first + x, null);
            currentNode.rest = newNode;
            currentNode = currentNode.rest;
            p = p.rest;
            

        }
        return newList;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed
     * to use recursion. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrIterativeDestructive(IntList L, int x) {
        // TODO: Fill in this code
        IntList p = L;
        while(p != null){
            p.first = p.first + x;
            p = p.rest;
        }
        return L;
    }

    /**
     * Returns an IntList consisting of the elements of L1 followed by the
     * elements of L2.
     */
    public static IntList concatenate(IntList L1, IntList L2) {
        // TODO: Fill in this code

        if(L1 == null && L2.rest ==null){
            return new IntList(L2.first, null);
        }

        if (L1 ==null && L2.rest != null){
            IntList newList = new IntList(L2.first, L2.rest);
            newList.rest = concatenate(null, L2.rest);
            return newList; 
        }

        if(L1.rest == null){
            IntList newList = new IntList(L1.first, L2);
            newList.rest = concatenate(null, L2);
            return newList;
            
        }
        IntList newList = new IntList(L1.first, L1.rest);
        newList.rest = concatenate(L1.rest, L2);
        return newList;
    }

    /*
     * =================================================================
     * OPTIONAL METHODS
     * =================================================================
     */

    /**
     * Returns the sum of all elements in the IntList.
     */

    private int sum(IntList p){
        if (p.rest == null){
            return p.first;
        }
        return p.first + sum(p.rest);
    }
    public int sum() {
        // Optional: Fill in this code

        return sum(this);
    }

    private void addLast(IntList p, int x){
        if (p.rest == null){
            p.rest = new IntList(x, null);
            return;
        }
        IntList(p.rest,x);
    }

    /**
     * Destructively adds x to the end of the list.
     */
    public void addLast(int x) {
        // Optional: Fill in this code
        addLast(this,x);
    }

    /**
     * Destructively adds x to the front of this IntList.
     * This is a bit tricky to implement. The standard way to do this would be
     * to return a new IntList, but for practice, this implementation should
     * be destructive.
     */
    public void addFirst(int x) {
        // Optional: Fill in this code
        IntList newNode = new IntList(first, rest);
        first = x;
        rest = newNode;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7,null);
        L.rest.rest = new IntList(9, null);

        IntList M = incrIterativeDestructive(L, 3);
        System.out.println(L.get(0));
        // System.out.println(M.first);
        // System.out.println(M.rest.first);
        // System.out.println(M.rest.rest.first);
    }
}
