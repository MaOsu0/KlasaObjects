package Zadanie1;

public class DataStore {

    private final static int MAX_COMPUTERS = 100;

    Computer[] computers = new Computer[MAX_COMPUTERS];

    int computerNumber = 0;


    public void add(Computer computer) {
        if (computerNumber < MAX_COMPUTERS && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }
    }















    public void getComputer() {
        if (computerNumber == 0) {
            System.out.println("Brak komputerów");
        } else {
            for (int i = 0; i < computerNumber; i++) {
                System.out.println(computers[i]);
            }
        }
    }















    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computerNumber; i++) {
            if (find.equals(computers[i]))
            count++;
        }

        return count;
    }
}
