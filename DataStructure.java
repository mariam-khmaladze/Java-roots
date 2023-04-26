import java.util.*;

public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    // fill the array with ascending integer values
    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    //pseudo-iterator takes Integer and returns Boolean, how is that an iterator?
    public void print(java.util.function.Function<Integer, Boolean> pseudoIterator){
        for (Integer element : this.arrayOfInts) {
            if (pseudoIterator.apply(element)){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public void printWithDataStructureIterator(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void printEven() {        
        // Print out values of even indices of the array
        EvenIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        // Check if the current element is the last in the array
        public boolean hasNext() {            
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printWithDataStructureIterator(new DataStructureIterator(){
            private int nextIndex = 1;

            // Check if the current element is the last in the array
            public boolean hasNext() {            
                return (nextIndex <= SIZE - 1);
            }        
            
            public Integer next() {
                
                // Record a value of an even index of the array
                Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);
                
                // Get the next even element
                nextIndex += 2;
                return retValue;
            }
        }
        );
        ds.print(x -> (x%2 != 0));
    }
}



























