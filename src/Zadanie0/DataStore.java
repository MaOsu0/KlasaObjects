package Zadanie0;

public class DataStore {

    private int computerNumber = 0;
    private final int MAX_COMPUTERS = 100;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computerNumber];
        for (int i = 0; i < computerNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    Computer[] computers = new Computer[MAX_COMPUTERS];

    public void add(Computer computer) {
        if (computerNumber < MAX_COMPUTERS && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }
    }


    public String getInfo() {
        String results = "";
        if (computerNumber == 0) {
            System.out.println("Brak komputerów");
        }
        for (int i = 0; i < computerNumber; i++) {
            results = results + computers[i].toString() + "\n";
        }
        return results;
    }

    public String checkAvailability(Computer computer) {
        int counting = 0;
        for (int i = 0; i < computerNumber; i++) {
            if (computers[i].equals(computer)){
                counting++;
            }
        }
        String result = "";
        if (counting != 1){
           result  = "Liczba podobnych komputerów w sklepie: " + counting + "\n";
        } else {
            result = "Jest to jedyny egzemplarz w sklepie" + "\n";

        }

        return result;
    }
}
