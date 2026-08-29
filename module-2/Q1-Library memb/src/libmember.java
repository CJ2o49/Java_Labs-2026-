public class libmember {
    String memberName;
    int memberId;
    int validityYears;
    libmember() {
        memberName = "Guest";
        memberId = 0;
        validityYears = 1;
    }


    libmember(String memberName, int memberId, int validityYears) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.validityYears = validityYears;
    }

    public static void main(String[] args) {

        // Object using default constructor
        libmember card1 = new libmember();

        // Object using parameterized constructor
        libmember card2 =
                new libmember("Christopher", 101, 2);
        System.out.println("===== CARD 1 =====");
        System.out.println("Member Name: " + card1.memberName);
        System.out.println("Member ID: " + card1.memberId);
        System.out.println("Validity: " + card1.validityYears + " year(s)");

        System.out.println("\n===== CARD 2 =====");
        System.out.println("Member Name: " + card2.memberName);
        System.out.println("Member ID: " + card2.memberId);
        System.out.println("Validity: " + card2.validityYears + " year(s)");
    }
}