public class ElapsedTime {
    private long startTime;
    private long endTime;
    private long time;
    
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        startTime = System.currentTimeMillis();
        endTime = startTime + time;
    }

    public ElapsedTime(long time) {
        setTime(time);
    }

    public long getTimeRemain() {
        return endTime - System.currentTimeMillis();
    }

    public boolean timesUp() {
        return getTimeRemain() <= 0;
    }
}
