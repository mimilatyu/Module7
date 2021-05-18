public class Kangaroo extends Australian implements Kanskinable {
    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public String beInAussie() {
        return "I am Kangaroo";
    }

    @Override
    public void kanskin() {
        System.out.println(name + " made of kangaroo leather");
    }

    public static class Kangorookid extends Australian implements Kanskinable {

        public Kangorookid(String name) {
            super(name);
        }

        @Override
        public String beInAussie() {
            return "I am a small kangaroo";
        }

        @Override
        public void kanskin() {
            System.out.println(name + " is made of kangaroo leather");
        }
    }
}
