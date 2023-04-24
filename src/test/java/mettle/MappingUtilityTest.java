package mettle;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import java.util.HashMap;

/**
 * Unit tests for valid input values and valid mappings in the HashMap
 */
public class MappingUtilityTest {

    @Test
    public void testApplyMapping_BasicCase() {
        // Input: [1, 2, 3, 1, 5]
        // Mapping: {1: 10, 2: 33}
        // Expected Output: [10, 33, 3, 10, 5]
        int[] input = {1, 2, 3, 1, 5};
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(1, 10);
        m.put(2, 33);
        int[] expectedOutput = {10, 33, 3, 10, 5};
        int[] output = MappingUtility.applyMapping(input, m);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_EmptyInput() {
        // Input: []
        // Mapping: {1: 10, 2: 33}
        // Expected Output: []
        int[] input = {};
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] expectedOutput = {};
        int[] output = MappingUtility.applyMapping(input, m);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_EmptyMapping() {
        // Input: [1, 2, 3]
        // Mapping: {}
        // Expected Output: [1, 2, 3]
        int[] input = {1, 2, 3};
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] expectedOutput = {1, 2, 3};
        int[] output = MappingUtility.applyMapping(input, m);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_MissingKeys() {
        // Input: [1, 2, 3]
        // Mapping: {4: 40, 5: 50}
        // Expected Output: [1, 2, 3]
        int[] input = {1, 2, 3};
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(4, 40);
        m.put(5, 50);
        int[] expectedOutput = {1, 2, 3};
        int[] output = MappingUtility.applyMapping(input, m);
        assertArrayEquals(expectedOutput, output);
    }
}