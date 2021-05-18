public class AusHuman extends Australian {

    boolean sex;
    int age;
    public AusHuman(String name, int age, boolean sex) {
        super(name);
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String beInAussie() {
        return "I am Australian man" ;
    }
}
