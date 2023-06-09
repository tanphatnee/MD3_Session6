
// Lớp Main
public class Main {
    // Phương thức sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Khởi tạo mảng chứa 100,000 số nguyên ngẫu nhiên
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Tạo đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopwatch.start();

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(arr);

        // Dừng đo thời gian
        stopwatch.stop();

        // Lấy thời gian đã trôi qua
        long elapsedTime = stopwatch.getElapsedTime();

        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + elapsedTime + " milliseconds.");
    }
}