package mettle;

import java.util.HashMap;


public class MappingUtility {

    /**
     * Applies a mapping to an input array based on a given HashMap.
     *
     * @param input The input array to be mapped.
     * @param map The HashMap representing the mapping.
     * @return The output array with mapped values.
     */
    public static int[] applyMapping(int[] input, HashMap<Integer, Integer> map) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])) {
                output[i] = map.get(input[i]);
            } else {
                output[i] = input[i];
            }
        }
        return output;
    }
}
