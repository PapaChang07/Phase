public class Profile {
    private String Name;
    private int PhoneNumber;
    private String username;

    public Profile(String Name, int PhoneNumber, String username){
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.username = username;

    }

    public String getName() {
        return Name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return Name;
    }

    public String repr(){
        return "I'm " + Name + " with a Phone Number of " + PhoneNumber + " with an Username of " + username;
    }
}
