public class DemoSubscriptions {
    public static void main(String[] args) {
        NewspaperSubscription vg = new PhysicalNewspaperSubscription();
        NewspaperSubscription TB = new OnlineNewspaperSubscription();
        NewspaperSubscription AftenPosten = new PhysicalNewspaperSubscription();
        NewspaperSubscription E24 = new OnlineNewspaperSubscription();
        vg.setSubscriberAddress("greaterHills");
        TB.setSubscriberAddress("TwistyParish");
        AftenPosten.setSubscriberAddress("greaterHills3");
        E24.setSubscriberAddress("Twisty@Parish");

    }
}
