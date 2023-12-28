package observer;

public abstract class Observer {
    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);;
    }
    public Subject subject;
    public abstract void update();
}
