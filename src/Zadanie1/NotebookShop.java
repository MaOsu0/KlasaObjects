package Zadanie1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        Computer comp1 = new Computer("Asus", 2000);
        Computer comp2 = new Computer("Asus", 2000);
        Computer comp3 = new Computer("Asus", 3000);
        Computer comp4 = new Computer("Acer", 4000);
        Computer comp5 = new Computer("HP", 5000);
        Computer comp6 = new Computer("HP", 5000);
        Computer comp7 = new Computer("HP", 5000);
        Computer comp8 = new Computer("HP", 5000);

        dataStore.add(comp1);
        dataStore.add(comp2);
        dataStore.add(comp3);
        dataStore.add(comp4);
        dataStore.add(comp5);
        dataStore.add(comp6);
        dataStore.add(comp7);
        dataStore.add(comp8);
        dataStore.getComputer();
        System.out.println(dataStore.checkAvailability(comp1));
    }
}
