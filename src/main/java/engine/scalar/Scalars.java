package engine.scalar;

import util.Constants;

import java.util.Random;

/**
 * Contains methods for generating scalar values.
 */
public class Scalars<T extends Comparable<T>> {

    private long upperBoundSize = Constants.UPPER_BOUND_SIZE;
    private Random rand = new Random();

    public Scalars() {}

    public Scalars(long upperBoundSize) {
        this.upperBoundSize = upperBoundSize;
    }

}
