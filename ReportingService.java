import java.util.List;

public class ReportingService {
    public void showReport(List<Log> habits) {
        System.out.println("\n=== Habit Report ===");

        if (habits.isEmpty()) {
            System.out.println("No Logs to show.");
            return;
        }

        for (Log h : habits) {
            System.out.println(h.getName() + " → Completed Days: " + h.getCompletedDays());
        }

        System.out.println("====================\n");
    }
}