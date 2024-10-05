package classes;

public class Operator extends User{
    int grade;

    public Operator(String name, String lastName, int grade ) {
        super(name, lastName);
        this.grade = grade;
    }

    public Operator(){
        this("Francesco", "Marra", 0);
    }

    @Override
    public String getInfo() {
        return "";
    }
}
