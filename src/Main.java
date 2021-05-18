public class Main {
    public static void main(String[] args) {
        AusHuman John = new AusHuman("Jоhn", 26, true);
        Kangaroo Jack = new Kangaroo("Jack");
        Blundstone Five = new Blundstone("Five");

        Jack.kanskin();
        Jack.beInAussie();
        John.beInAussie();
        Five.beInAussie();
        Five.kanskin();
    }
}
