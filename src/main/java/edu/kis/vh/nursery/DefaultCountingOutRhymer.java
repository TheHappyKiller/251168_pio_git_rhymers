package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_STACK_CAPACITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int MAX_STACK_INDEX = MAX_STACK_CAPACITY - 1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    private final int[] numbers = new int[MAX_STACK_CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_STACK_INDEX;
    }

    protected int peekAtTop() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
