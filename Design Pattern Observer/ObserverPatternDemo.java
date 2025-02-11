public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new CentimeterObserver(subject);
        new MilimeterObserver(subject);
        new MeterObserver(subject);

        System.out.println("First State change 15");
        subject.setState(15);

        System.out.println("Second State change 15");
        subject.setState(10);

    }
}