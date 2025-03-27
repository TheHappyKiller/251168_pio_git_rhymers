package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_CAPACITY = 12;
    public static final int EMPTY_STACK_VALUE = -1;

    private final int[] numbers = new int[MAX_CAPACITY];
    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == MAX_CAPACITY - 1;
    }

    protected int peekAtTop() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }
}
