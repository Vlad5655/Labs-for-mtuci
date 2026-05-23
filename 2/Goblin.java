public class Goblin extends Monster {
    private String tribe;
    private int cunning;
    private int weapon;
    
    public Goblin(String name, int health, int danger, 
                  String tribe, int cunning, int weapon) {
        super(name, health, danger);
        this.tribe = tribe;
        this.cunning = cunning;
        this.weapon = weapon;
    }
    
    public Goblin() {
        super("Goblin", 50, 2);
        this.tribe = "Wild";
        this.cunning = 5;
        this.weapon = 10;
    }
    
    // ГЕТТЕРЫ для своих полей
    public String getTribe() {
        return tribe;
    }
    
    public int getCunning() {
        return cunning;
    }
    
    public int getWeapon() {
        return weapon;
    }
    
    // СЕТТЕРЫ для своих полей
    public void setTribe(String tribe) {
        this.tribe = tribe;
    }
    
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Гоблин: " + name + 
                ", племя: " + tribe + 
                ", здоровье: " + health + 
                ", хитрость: " + cunning);
    }
}
