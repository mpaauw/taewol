package engine.collection;

import util.Constants;

import java.util.Collection;
import java.util.Random;

/**
 * Contains methods for generating collections.
 */
public class Collections<T> {

    private long upperBoundSize = Constants.UPPER_BOUND_SIZE;
    private Random rand = new Random();

    public Collections(long upperBoundSize) {
        this.upperBoundSize = upperBoundSize;
    }

}
