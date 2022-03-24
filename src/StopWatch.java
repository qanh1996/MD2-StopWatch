public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;

    public StopWatch() {
    }

    public StopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }


    public long stop() {
        this.stopTime = System.currentTimeMillis();
        return this.stopTime;
    }


    public long getElapsed() {
        long elapsed;
        elapsed = (this.stopTime - this.startTime);
        return elapsed;
    }

    @Override
    public String toString() {
        return "Stopwatch{" +
                "\n startTime=" + startTime +
                "\n stopTime=" + stopTime +
                "\n elapsedTime = " + this.getElapsed() +
                '}';
    }
}
