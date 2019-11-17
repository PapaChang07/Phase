import java.util.ArrayList;
import java.util.List;

public class Driver extends Profile {

    private int capacity;
    private ArrayList<Profile> hotride;

    public Driver(String Name, int PhoneNumber, String username, int capacity){
        super(Name, PhoneNumber, username);
        this.capacity = capacity;
        this.hotride = new ArrayList<Profile>();
    }

    public void addToHotRide(Profile p){
        if (capacity > hotride.size()){
            hotride.add(p);
        }
    }

    public ArrayList<Profile> getHotride() {
        return hotride;
    }

    public int getCapacity() {
        return capacity;
    }
}
