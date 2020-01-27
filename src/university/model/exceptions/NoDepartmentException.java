package university.model.exceptions;

public class NoDepartmentException extends RuntimeException {

    public NoDepartmentException() {
        super("No department exists in university");
    }
}
