public class Mermaid extends Monster {
    private String ocean;
    private int singPower;
    private int speed;
    
    public Mermaid(String name, int health, int danger,
                   String ocean, int singPower, int speed) {
        super(name, health, danger);
        this.ocean = ocean;
        this.singPower = singPower;
        this.speed = speed;
    }
    
    public Mermaid() {
        super("Siren", 70, 4);
        this.ocean = "Pacific";
        this.singPower = 7;
        this.speed = 8;
    }
    
    // ГЕТТЕРЫ
    public String getOcean() {
        return ocean;
    }
    
    public int getSingPower() {
        return singPower;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    // СЕТТЕРЫ
    public void setOcean(String ocean) {
        this.ocean = ocean;
    }
    
    public void setSingPower(int singPower) {
        this.singPower = singPower;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Русалка: " + name + 
                ", океан: " + ocean + 
                ", здоровье: " + health + 
                ", сила пения: " + singPower);
    }
}
