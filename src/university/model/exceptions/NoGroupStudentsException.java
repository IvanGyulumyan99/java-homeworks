package university.model.exceptions;

public class NoGroupStudentsException extends RuntimeException {

    public NoGroupStudentsException() {
        super("No students exists for the group");
    }
}
