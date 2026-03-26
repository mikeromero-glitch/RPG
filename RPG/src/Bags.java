class Bag {
    int Badgadevalue;
    int overheadopen;

    HashMap<Integer, Item> items = new HashMap<>();

    public Bag(int Badgadevalue) {
        this.Badgadevalue = Badgadevalue;
        this.overheadopen = Badgadevalue;
    }

    public void checkIn() {
        System.out.println("Bag checked in at the airport.");
    }

    public void addItem(Item item) {
        if (overheadopen > 0) {
            int slot = -1;

            for (int i = 1; i <= Badgadevalue; i++) {
                if (!items.containsKey(i)) {
                    slot = i;
                    break;
                }
            }

            items.put(slot, item);
            overheadopen--;

            System.out.println(item.name + " placed into slot " + slot);
        } else {
            System.out.println("Bag is full!");
        }
    }

    public void removeItem(int slot) {
        if (items.containsKey(slot)) {
            System.out.println(items.get(slot).name + " removed from bag.");
            items.remove(slot);
            overheadopen++;
        } else {
            System.out.println("No item in that slot.");
        }
    }

    public void useItem(int slot) {
        if (items.containsKey(slot)) {
            Item item = items.get(slot);
            item.use(this, slot);
        } else {
            System.out.println("No item in that overhead space.");
        }
    }

    public void showItems() {
        System.out.println("Bag contains: " + items);
    }
}
