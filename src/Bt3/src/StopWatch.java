import java.util.Arrays;

// Lớp StopWatch
class StopWatch {
    private long startTime;
    private long endTime;

    // Phương thức getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Phương thức getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức khởi tạo không tham số
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Phương thức start
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Phương thức stop
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Phương thức tính thời gian đã trôi qua
    public long getElapsedTime() {
        return endTime - startTime;
    }
}