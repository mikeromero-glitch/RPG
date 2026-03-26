class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }
    public void use(Bag bag, int slot) {
        System.out.println("You can't use this item.");
    }

    public String toString() {
        return name;
    }
}
class Tool extends Item {
    int damage;
    public Tool(String name, int damage) {
        super(name);
        this.damage = damage;
    }
    public void use(Bag bag, int slot) {
        System.out.println("You swing the " + name + " and deal " + damage + " damage!");
    }
}
class Consumable extends Item {
    int effect;

    public Consumable(String name, int effect) {
        super(name);
        this.effect = effect;
    }
    public void use(Bag bag, int slot) {
        System.out.println("You eat the 67 " + name + " and restore " + effect + " energy!");
        bag.removeItem(slot);
    }
}
class Projectile extends Item {
    int quantity;

    public Projectile(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }
    public void use(Bag bag, int slot) {
        if (quantity > 0) {
            quantity--;
            System.out.println("You throw a " + name + "! How much HTLA Airlines got left: " + quantity);

            if (quantity == 0) {
                System.out.println("You ran out of " + name + "!");
                bag.removeItem(slot);
            }
        }
    }
    public String toString() {
        return name + " (" + quantity + ")";
    }
}
class QuestItem extends Item {
    public QuestItem(String name) {
        super(name);
    }
    public void use(Bag bag, int slot) {
        System.out.println("You use the " + name + " to unlock the airplane door! oooo welcome to Mikey Ochoa Airlines");
    }
}

