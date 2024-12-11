package weekFive.labFive;
import java.util.Scanner;
public class HotelOccupancy {

    int totalRooms;
    int OccupiedRooms;
    int floors;

    public HotelOccupancy() {
        totalRooms = 0;
        OccupiedRooms = 0;
        floors = 0;
        }

        public void getInput() {
            Scanner scn = new Scanner(System.in);

            System.out.print("Enter the number of floors in the hotel: ");
            floors = scn.nextInt();

            for (int floor = 1; floor <= floors; floor++){
                System.out.print("Enter the number of rooms on floor " + floor + ": ");
                int roomsOnFloor = scn.nextInt();
                System.out.print("Enter the number of room occupied on each floor" + floor + ": ");
                int roomOccupiedOnFloor = scn.nextInt();

                totalRooms += roomsOnFloor;
                OccupiedRooms += roomOccupiedOnFloor;
            }
        }

        double calculateOccupanceRate(){
        if (totalRooms == 0){
            return 0;
        }
        return (double) OccupiedRooms / totalRooms;
        }

        public void displayInfo(){
        int vacantRooms = totalRooms - OccupiedRooms;
        double occupancyRate = calculateOccupanceRate() * 100;
        double occupancyDecimal = calculateOccupanceRate();

            System.out.println("\n --- Hotel Occupancy Report ---");
        System.out.println("Number of floors: " + floors);
        System.out.println("Total number of rooms: " + totalRooms);
        System.out.println("Number of occupied rooms: " + OccupiedRooms);
        System.out.println("Number of vacant rooms: " + vacantRooms);
        System.out.println("Occupany Rate:" + " " + occupancyRate + "%" + "(" + occupancyDecimal + ")");
    }
    public static void main(String[] args) {
        HotelOccupancy hotel = new HotelOccupancy();
        hotel.getInput();
        hotel.displayInfo();
    }

}