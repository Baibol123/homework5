public class Main {
    public static void main(String[] args) {
        Boss myboss = new Boss();
        myboss.setHealth(700);
        myboss.setDamage(70);
        myboss.setDefense("armor");

        System.out.println("Здоровье босса: " + myboss.getHealth());
        System.out.println("Урон босса: " + myboss.getDamage());
        System.out.println("Тип защиты босса: " + myboss.getDefense());
        System.out.println("------------");
        Hero[] myHeroes = createHeroes();
        for (Hero hero : myHeroes) {
            System.out.println("Здоровье героя: " + hero.getHealth());
            System.out.println("Урон героя: " + hero.getDamage());
            System.out.println("Суперспособность героя: " + hero.getSuperpower());
        }
    }
    public static Hero[] createHeroes(){
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(250, 50, "thunder");
        heroes[1] = new Hero(280, 45);
        heroes[2] = new Hero(220, 35, "telekinesis");
        return heroes;
    }
}