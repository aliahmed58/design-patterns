package observer;

public class ViewTwo extends Observer {
    public ViewTwo(Subject subject) {
        super(subject);
    }
    @Override
    public void update() {
        System.out.println(this.subject.getState());
    }
}
