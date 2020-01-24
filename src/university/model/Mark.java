package university.model;

public class Mark {

    private final int value;

    public Mark(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void validate() {
        if(value < 0 || value > 10) {
            throw new RuntimeException("Invalid mark");
        }
    }

}
