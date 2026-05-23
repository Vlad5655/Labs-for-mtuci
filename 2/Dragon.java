public class Dragon extends Monster {
    private String element;
    private int wingspan;
    private int firepower;
    
    public Dragon(String name, int health, int danger,
                  String element, int wingspan, int firepower) {
        super(name, health, danger);
        this.element = element;
        this.wingspan = wingspan;
        this.firepower = firepower;
    }
    
    public Dragon() {
        super("Dragon", 200, 10);
        this.element = "Fire";
        this.wingspan = 15;
        this.firepower = 50;
    }
    
    // ГЕТТЕРЫ
    public String getElement() {
        return element;
    }
    
    public int getWingspan() {
        return wingspan;
    }
    
    public int getFirepower() {
        return firepower;
    }
    
    // СЕТТЕРЫ
    public void setElement(String element) {
        this.element = element;
    }
    
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
    
    public void setFirepower(int firepower) {
        this.firepower = firepower;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Дракон: " + name + 
                ", элемент: " + element + 
                ", здоровье: " + health + 
                ", размах крыльев: " + wingspan);
    }
}
