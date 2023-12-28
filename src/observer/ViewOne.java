package observer;

public class ViewOne extends Observer {

    public ViewOne(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getState());
    }
}
