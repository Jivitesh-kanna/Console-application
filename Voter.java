import java.util.Random;
public class Voter {
    private String name;
    private int age;
    private String address;
    private String voterID;
    public Voter(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.voterID = generateVoterID();
    }
    private String generateVoterID() {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(14);
        Random random = new Random();

        for (int i = 0; i < 14; i++) {
            int index = random.nextInt(alphanumeric.length());
            sb.append(alphanumeric.charAt(index));
        }
        return sb.toString();
    }
    public void setDetails(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getDetails() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nVoter ID: " + voterID;
    }
    public String getVoterID() {
        return voterID;

    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
