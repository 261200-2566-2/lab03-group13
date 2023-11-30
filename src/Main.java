// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character A = new Character();
        Character B = new Character() ;
        Sword e1 = new Sword();
        System.out.println("1 "+A.getHp());
        System.out.println("1 " +B.getHp());
        for (int i = 0; i < 10000; i++) {
            B.levelUp();
        }
        System.out.println("2 "+A.getHp());
        System.out.println("2 "+B.getHp());
        A.equipSword(e1);
        A.attack(B);
        System.out.println("DMG " + e1.getDamage());
        e1.levelUp();
        System.out.println("DMG " + e1.getDamage());
        System.out.println("3 "+A.getHp());
        System.out.println("3 "+B.getHp());
    }
}