public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag(5);
        Tool wrench = new Tool("Maintenance Wrench", 15);
        Consumable crackers = new Consumable("Mikeys Airplane Crackers", 5);
        Projectile peanuts = new Projectile("Peanuts", 3);
        QuestItem keycard = new QuestItem("Pilot Keycard");
        bag.checkIn();
        bag.addItem(wrench);
        bag.addItem(crackers);
        bag.addItem(peanuts);
        bag.addItem(keycard);

        bag.showItems();

        System.out.println("\nUsing items...\n");

        bag.useItem(1);
        bag.useItem(2);
        bag.useItem(3);
        bag.useItem(3);
        bag.useItem(3);
        bag.useItem(4);

        System.out.println("\nFinal bag:");
        bag.showItems();
    }
}
