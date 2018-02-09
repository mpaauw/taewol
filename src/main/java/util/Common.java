package util;

/**
 * Contains implementations for commonly-used functions.
 */
public class Common<T> {

    public boolean arrayContains(T[] arr, T value) throws NullPointerException {
        if(arr == null) {
            throw new NullPointerException(Constants.COLLECTION_NULL_EXCEPTION);
        }
        for(T item : arr) {
            if(item.equals(value)) {
                return true;
            }
        }
        return false;
    }

}
