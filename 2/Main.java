public class Main {
    public static void main(String[] args) {
        
        // Создание объектов
        Goblin g = new Goblin("Gruk", 60, 3, "Shadow", 8, 15);
        Mermaid m = new Mermaid("Ariel", 80, 5, "Atlantic", 9, 8);
        Dragon d = new Dragon("Smaug", 300, 10, "Fire", 20, 50);
        
        // Вывод информации
        g.showInfo();
        m.showInfo();
        d.showInfo();
        
        // ДЕМОНСТРАЦИЯ ГЕТТЕРОВ
        System.out.println("\n--- Использование геттеров ---");
        System.out.println("Имя гоблина: " + g.getName());
        System.out.println("Здоровье дракона: " + d.getHealth());
        
        // ДЕМОНСТРАЦИЯ СЕТТЕРОВ
        System.out.println("\n--- Использование сеттеров ---");
        g.setName("Grok the Great");
        System.out.println("Новое имя гоблина: " + g.getName());
        
        // ДЕМОНСТРАЦИЯ ПЕРЕГРУЗКИ
        System.out.println("\n--- Демонстрация перегрузки ---");
        g.hit(10);
        System.out.println("Здоровье после удара: " + g.getHealth());
        g.hit(15, "Магия");
        System.out.println("Здоровье после магии: " + g.getHealth());
        
        // ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА
        System.out.println("\n--- Полиморфизм ---");
        Monster[] monsters = {g, m, d};
        for (Monster monster : monsters) {
            monster.showInfo();
        }
        
        // СТАТИЧЕСКИЙ СЧЕТЧИК
        System.out.println("\nВсего объектов: " + Monster.getCount());
    }
}
