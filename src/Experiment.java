public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long start = System.nanoTime();
        if ("basic".equals(type)) {
            sorter.basicSort(copy);
        } else if ("advanced".equals(type)) {
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
        for (int size : sizes) {
            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = randomArr.clone();
            sorter.basicSort(sortedArr);

            System.out.println("Size: " + size);

            if (size <= 10) {
                System.out.print("Original array:  ");
                sorter.printArray(randomArr);
            }

            long basicRandom = measureSortTime(randomArr, "basic");
            long advRandom = measureSortTime(randomArr, "advanced");
            System.out.println("Basic (Bubble) random:   " + basicRandom + " ns");
            System.out.println("Advanced (Merge) random: " + advRandom + " ns");

            long basicSorted = measureSortTime(sortedArr, "basic");
            long advSorted = measureSortTime(sortedArr, "advanced");
            System.out.println("Basic (Bubble) sorted:   " + basicSorted + " ns");
            System.out.println("Advanced (Merge) sorted: " + advSorted + " ns");

            if (size <= 10) {
                int[] demonstrationArr = randomArr.clone();
                sorter.advancedSort(demonstrationArr);
                System.out.print("Sorted array:    ");
                sorter.printArray(demonstrationArr);
            }

            int target = randomArr[size / 2];
            long searchRandom = measureSearchTime(randomArr, target);
            long searchSorted = measureSearchTime(sortedArr, target);
            System.out.println("Linear Search random: " + searchRandom + " ns");
            System.out.println("Linear Search sorted: " + searchSorted + " ns");
            System.out.println("-------------------");
        }
    }
}
