package Zadanie0;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer computer = new Computer("Asus", 200);
        Computer computer1 = new Computer("Asus", 200);
        Computer computer2 = new Computer("HP", 5000);
        Computer computer3 = new Computer("Acer", 300);
        Computer computer4 = new Computer("HP", 4000);

        dataStore.add(computer);
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);

        System.out.println(dataStore.checkAvailability(computer1));

        System.out.println("Wszystkie komputery to: ");
        for (Computer comps : dataStore.getComputers()) {
            System.out.println(comps);
        }


        System.out.println(dataStore.getInfo());

    }
}
