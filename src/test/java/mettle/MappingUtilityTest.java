package mettle;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import java.util.*;

/**
 * Unit tests for valid input values and valid mappings in the HashMap
 */
public class MappingUtilityTest {

    @Test
    public void testApplyMapping_BasicCase() {
        // Input: [1, 2, 3, 1, 5]
        // Mapping: {1: 10, 2: 33}
        // Expected Output: [10, 33, 3, 10, 5]
        Integer[] input = {1, 2, 3, 1, 5};
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 10);
        m.put(2, 33);
        Integer[] expectedOutput = {10, 33, 3, 10, 5};
        
        // Create an instance of MappingUtility with the initial mapping
        MappingUtility<Integer> mappingUtility = new MappingUtility<>(m);
        Integer[] output = mappingUtility.applyMapping(input);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_EmptyInput() {
        // Input: []
        // Mapping: {1: 10, 2: 33}
        // Expected Output: []
        Integer[] input = {};
        Map<Integer, Integer> m = new HashMap<>();
        Integer[] expectedOutput = {};
        
        // Create an instance of MappingUtility with the initial mapping
        MappingUtility<Integer> mappingUtility = new MappingUtility<>(m);
        Integer[] output = mappingUtility.applyMapping(input);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_EmptyMapping() {
        // Input: [1, 2, 3]
        // Mapping: {}
        // Expected Output: [1, 2, 3]
        Integer[] input = {1, 2, 3};
        Map<Integer, Integer> m = new HashMap<>();
        Integer[] expectedOutput = {1, 2, 3};
        
        // Create an instance of MappingUtility with the initial mapping
        MappingUtility<Integer> mappingUtility = new MappingUtility<>(m);
        Integer[] output = mappingUtility.applyMapping(input);
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testApplyMapping_MissingKeys() {
        // Input: [1, 2, 3]
        // Mapping: {4: 40, 5: 50}
        // Expected Output: [1, 2, 3]
        Integer[] input = {1, 2, 3};
        Map<Integer, Integer> m = new HashMap<>();
        m.put(4, 40);
        m.put(5, 50);
        Integer[] expectedOutput = {1, 2, 3};
        
        // Create an instance of MappingUtility with the initial mapping
        MappingUtility<Integer> mappingUtility = new MappingUtility<>(m);
        Integer[] output = mappingUtility.applyMapping(input);
        assertArrayEquals(expectedOutput, output);
    }
}