public abstract class Monster {
    protected String name;
    protected int health;
    protected int danger;
    protected static int count = 0;
    
    public Monster(String name, int health, int danger) {
        this.name = name;
        this.health = health;
        this.danger = danger;
        count++;
    }
    
    public Monster() {
        this("Unknown", 100, 1);
    }
    
    // ВСЕ ГЕТТЕРЫ
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getDanger() {
        return danger;
    }
    
    public static int getCount() {
        return count;
    }
    
    // ВСЕ СЕТТЕРЫ
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setDanger(int danger) {
        this.danger = danger;
    }
    
    public abstract void showInfo();
    
    // ПЕРЕГРУЗКА метода hit
    public void hit(int damage) {
        health -= damage;
    }
    
    public void hit(int damage, String type) {
        System.out.println("Атака типа: " + type);
        hit(damage);
    }
}
