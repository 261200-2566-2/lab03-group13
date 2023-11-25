public class Character {

    // Character attributes
    private double maxHp;
    private double hp;
    private double maxMana;
    private double mana;
    private double baseSpeed;
    private double maxBs;
    private double speed;
    private int level;

    // Equipped items
    private Sword equippedSword;
    private Shield equippedShield;

    public Character() {
        this.level = 1;
        this.maxHp = 100 + 10 * level;
        this.maxMana = 50 + 2 * level;
        this.baseSpeed = 100;
        this.maxBs = baseSpeed * (0.1 + 0.03 * level);
        this.hp = maxHp;
        this.mana = maxMana;
        this.speed = 100;
    }

    public void levelUp() {
        level++;
        maxHp = 100 + 10 * level;
        maxMana = 50 + 2 * level;
        maxBs = baseSpeed * (0.1 + 0.03 * level);
    }

    public void equipSword(Sword sword) {
        unequipSword(); // Unequip any previously equipped sword
        equippedSword = sword;
        speed -= speed * (0.1 + 0.04 * sword.getLevel());
    }

    public void equipShield(Shield shield) {
        unequipShield(); // Unequip any previously equipped shield
        equippedShield = shield;
        speed -= speed * (0.1 + 0.08 * shield.getLevel());
    }

    public void unequipSword() {
        if (equippedSword != null) {
            speed += speed * (0.1 + 0.04 * equippedSword.getLevel());
            equippedSword = null;
        }
    }

    public void unequipShield() {
        if (equippedShield != null) {
            speed += speed * (0.1 + 0.08 * equippedShield.getLevel());
            equippedShield = null;
        }
    }

    public void attack(Character opponent) {
        double damage = equippedSword.getDamage() - opponent.equippedShield.getDefense();
        if (damage > 0) {
            opponent.hp -= damage;
        }
    }

    // Getters for character attributes
    public double getMaxHp() {
        return maxHp;
    }

    public double getHp() {
        return hp;
    }

    public double getMaxMana() {
        return maxMana;
    }

    public double getMana() {
        return mana;
    }

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public double getMaxBs() {
        return maxBs;
    }

    public double getSpeed() {
        return speed;
    }

    public int getLevel() {
        return level;
    }

    public Sword getEquippedSword() {
        return equippedSword;
    }

    public Shield getEquippedShield() {
        return equippedShield;
    }
}
