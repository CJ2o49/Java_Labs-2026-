public class timeslott {
    int startHour;
    int endHour;

    timeslott(int startHour, int endHour) {
        this.startHour = startHour;
        this.endHour = endHour;
    }

    // Merge two time slots and return a new TimeSlot object
    static timeslott mergeSlots(timeslott a, timeslott b) {

        // Check whether the slots overlap
        if (a.endHour < b.startHour || b.endHour < a.startHour) {
            System.out.println("Warning: The time slots do not overlap.");
        }

        int start = Math.min(a.startHour, b.startHour);
        int end = Math.max(a.endHour, b.endHour);

        return new timeslott(start, end);
    }

    public static void main(String[] args) {

        // Create two overlapping time slots
        timeslott slot1 = new timeslott(10, 12);
        timeslott slot2 = new timeslott(11, 14);

        // Method returns a new TimeSlot object
        timeslott merged = mergeSlots(slot1, slot2);

        System.out.println("Merged Start: " + merged.startHour);
        System.out.println("Merged End: " + merged.endHour);
    }
}