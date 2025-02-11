public class CentimeterObserver extends Observer {

    public CentimeterObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Centimeter String : "+Integer.toCentimeterString(subject.getState()).toUpperCase());
    }
}