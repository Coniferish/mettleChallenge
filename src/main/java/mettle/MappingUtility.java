package mettle;

import java.util.*;


public class MappingUtility <T> {

    private Map<T, T> mapping;

    public MappingUtility(Map<T, T> initialMapping) {
        mapping = new HashMap<>();
        if (initialMapping != null) {
            mapping.putAll(initialMapping);
        }
    }

    /**
     * Applies a mapping to an input array based on a given HashMap.
     *
     * @param input The input array to be mapped.
     * @return The output array with mapped values.
     */
    public T[] applyMapping(T[] input) {
        T[] output = Arrays.copyOf(input, input.length);

        for (int i = 0; i < input.length; i++) {
            if (mapping.containsKey(input[i])) {
                output[i] = mapping.get(input[i]);
            } else {
                output[i] = input[i];
            }
        }
        return output;
    }
}
