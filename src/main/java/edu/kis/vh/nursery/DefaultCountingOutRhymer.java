package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    public static final int CALLCHECK = -1;
    public static final int FULLINDEX = 11;
    public static final int ERROR = -1;
    private int[] numbers = new int[CAPACITY];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALLCHECK;
    }

    public boolean isFull() {
        return total == FULLINDEX;
    }

    protected int peekAtTop() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
