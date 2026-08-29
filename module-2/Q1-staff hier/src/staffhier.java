public class staffhier {

    String name;
    int staffId;

    // Constructor
    staffhier(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    // Display staff information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Staff ID: " + staffId);
    }
}

class Manager extends staffhier {

    int teamSize;

    // Constructor using super()
    Manager(String name, int staffId, int teamSize) {
        super(name, staffId);
        this.teamSize = teamSize;
    }

    // Override parent method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }

    public static void main(String[] args) {

        Manager manager = new Manager("Christopher", 101, 8);

        manager.displayInfo();
    }
}