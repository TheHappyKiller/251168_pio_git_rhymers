package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza klasę DefaultCountingOutRhymer i modyfikuje metodę countIn,
 * aby śledzić liczbę odrzuconych elementów, które nie spełniają określonego warunku.
 * Reprezentuje specjalny rodzaj "rhymera" w grze wieża Hanoi, gdzie liczba odrzuconych elementów
 * jest zliczana.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów.
     *
     * @return liczba odrzuconych elementów.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Przesyła element do stosu, jeśli spełnia określony warunek.
     * Jeśli element jest większy niż szczyt stosu (jeśli stos nie jest pusty), jest odrzucany.
     *
     * @param in element, który ma zostać dodany do stosu.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekAtTop())
            totalRejected++;
        else
            super.countIn(in);
    }
}
