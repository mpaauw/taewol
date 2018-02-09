package engine.scalar;

import util.Common;
import util.Constants;
import exception.ScalarException;

import java.util.Collection;
import java.util.Random;

/**
 * Contains methods for generating scalar values.
 */
public abstract class Scalar<T> {

    private Random rand = new Random();
    private Common<T> common = new Common<T>();

    public abstract T generateRandomScalar();

    public T chooseRandomScalarFromArray(T[] arr) throws ScalarException {
        if(arr.length == 0) {
            throw new ScalarException(Constants.COLLECTION_EMPTY_EXCEPTION);
        }
        return arr[this.rand.nextInt(arr.length)];
    }

    public T chooseRandomScalarFromCollection(Collection<T> collection) throws ScalarException {
        if(collection.size() == 0) {
            throw new ScalarException(Constants.COLLECTION_EMPTY_EXCEPTION);
        }
        int index = this.rand.nextInt(collection.size());
        for(T item : collection) {
            if(--index <= 0) {
                return item;
            }
        }
        throw new ScalarException(Constants.GENERIC_SCALAR_EXCEPTION);
    }

    public T generateRandomScalarNotInArray(T[] arr) {
        if(arr.length == 0) {
            return generateRandomScalar();
        }
        T value = generateRandomScalar();
        while(common.arrayContains(arr, value)) {
            value = generateRandomScalar();
        }
        return value;
    }

    public T generateRandomScalarNotInCollection(Collection<T> collection) {
        if(collection.size() == 0) {
            return generateRandomScalar();
        }
        T value = generateRandomScalar();
        while(collection.contains(value)) {
            value = generateRandomScalar();
        }
        return value;
    }

}
