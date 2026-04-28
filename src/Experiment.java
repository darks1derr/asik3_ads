import java.util.Arrays;

public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        System.out.println("Basic sort: Selection Sort");
        System.out.println("Advanced sort: Merge Sort");
        System.out.println("Search: Binary Search");
        System.out.println();

        for (int size : sizes) {
            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = makeSortedArray(size);

            System.out.println("Array size: " + size);

            System.out.println("Random array:");
            System.out.println("Selection Sort: " + measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Merge Sort: " + measureSortTime(randomArray, "advanced") + " ns");

            System.out.println("Sorted array:");
            System.out.println("Selection Sort: " + measureSortTime(sortedArray, "basic") + " ns");
            System.out.println("Merge Sort: " + measureSortTime(sortedArray, "advanced") + " ns");

            int target = sortedArray[size / 2];
            System.out.println("Binary Search: " + measureSearchTime(sortedArray, target) + " ns");

            System.out.println("------------------------------");
        }
    }

    private int[] makeSortedArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        return arr;
    }
}