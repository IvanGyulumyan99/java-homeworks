package university.model;

public class StudentMark {

    private Subject subject;

    private Mark mark;

    public StudentMark(Subject subject, Mark mark) {
        this.subject = subject;
        this.mark = mark;
    }


    public Subject getSubject() {
        return subject;
    }

    public Mark getMark() {
        return mark;
    }

}
