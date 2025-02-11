public class MilimeterObserver extends Observer {

    public MilimeterObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Milimeter String : "+Integer.toMilimeterString(subject.getState()));
    }
}