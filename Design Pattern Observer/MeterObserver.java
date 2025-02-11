public class MeterObserver extends Observer {
    public MeterObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Meter String : "+Integer.toMeterString(subject.getState()));
    }
}