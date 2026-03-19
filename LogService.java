import java.util.ArrayList;
import java.util.List;

public class LogService {
    private List<Log> habits = new ArrayList<>();

    public void addHabit(String name) {
        habits.add(new Log(name));
        System.out.println("Log added successfully!");
    }

    public void deleteHabit(String name) {
        boolean removed = habits.removeIf(h -> h.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Log deleted.");
        } else {
            System.out.println("Log not found.");
        }
    }

    public void viewHabits() {
        if (habits.isEmpty()) {
            System.out.println("No Logs found.");
            return;
        }
        System.out.println("Your Logs:");
        for (Log h : habits) {
            System.out.println("- " + h.getName() + " | Completed Days: " + h.getCompletedDays());
        }
    }

    public void markCompleted(String name) {
        for (Log h : habits) {
            if (h.getName().equalsIgnoreCase(name)) {
                h.markCompleted();
                System.out.println("Marked complete!");
                return;
            }
        }
        System.out.println("Log not found.");
    }

    public List<Log> getHabits() {
        return habits;
    }
}