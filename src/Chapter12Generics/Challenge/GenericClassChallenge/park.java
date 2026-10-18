package Chapter12Generics.Challenge.GenericClassChallenge;

public class park extends Point{

    private String name;

    public park(String name,String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}
