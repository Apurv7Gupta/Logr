public class Log {
    String name;
    int completedDays;

    public Log(String name) {
        this.name = name;
        this.completedDays = 0;
    }

    public String getName() {
        return name;
    }

    public int getCompletedDays() {
        return completedDays;
    }

    public void markCompleted() {
        completedDays++;
    }
}