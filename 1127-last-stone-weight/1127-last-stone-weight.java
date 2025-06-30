class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int stone: stones) {
           heap.add(stone);
        }

        while (heap.size() > 1) {
            int y = heap.poll();
            int x = heap.poll();

            if (x != y) {
                heap.add(y - x);
            }
        }

        return heap.isEmpty() ? 0 : heap.poll();
    }
}