package ClassWork2;


class Home{
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

//    public Home(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimPool, boolean hasStatues, boolean hasGarden) {
//        this.windows = windows;
//        this.doors = doors;
//        this.rooms = rooms;
//        this.hasGarage = hasGarage;
//        this.hasSwimPool = hasSwimPool;
//        this.hasStatues = hasStatues;
//        this.hasGarden = hasGarden;
//    }

    public int getWindows() {
        return windows;
    }

    public Home setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public Home setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getRooms() {
        return rooms;
    }

    public Home setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public Home setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public Home setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
        return this;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public Home setHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
        return this;
    }

    public boolean isHasPets() {
        return hasGarden;
    }

    public Home setHasPets(boolean hasPets) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public String toString() {
        return "Home=>" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimPool=" + hasSwimPool +
                ", hasStatues=" + hasStatues +
                ", hasGarden=" + hasGarden;
    }
}




public class ClassWork2 {
    public static void main(String[] args) {
//        Home home = new Home(10, 10, 10, true, true, true, true);
//        System.out.println(home);
//Home home=new Home().setDoors(5).setWindows(5).setRooms(5)
//.setHasGarage(true).setHasSwimPool(true).setHasStatues(true)
//.setHasPets(true);
//System.out.println(home);
        Home home = new Home();
        home.setDoors(4);
        home.setWindows(2);
        home.setRooms(3);
        home.isHasGarage();
        System.out.println(home);

    }

}
