public abstract class NewspaperSubscription {
    String SubscriberName;
    String SubscriberAddress;
    int SubscriberRate;

    public void SetName(String name) {
        SubscriberName = name;
    }
    public String GetName() {
        return SubscriberName;
    }
    public String getAddress() {
        return SubscriberAddress;
    }
    public int getRate() {
        return SubscriberRate;
    }
    public abstract void setSubscriberAddress (String SubscriberAddress);

}
