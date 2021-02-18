public class OnlineNewspaperSubscription extends NewspaperSubscription{

    @Override
    public void setSubscriberAddress (String Address) {
        int count=0;
        for (int i=0; i<Address.length();i++) {
            if (Address.charAt(i)=='@') {
                count ++;
            }
        }
        if (count>0)
        {
            SubscriberRate = 9;
            System.out.println("The subscriber rate for this newspaper is " + SubscriberRate);
        }
        else
        {
            System.out.println("Sorry the address is not valid.");
        }
    }
}
