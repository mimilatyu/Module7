public class Blundstone extends Australian implements Kanskinable{

    public Blundstone(String name) {
        super(name);
    }

    @Override
    public String beInAussie() {
        return "I am Australian shoe";
    }

    @Override
    public void kanskin() {
        System.out.println(name + "is made of kangaroo leather");
    }
}
