import java.lang.Character;
public class PhysicalNewspaperSubscription extends NewspaperSubscription{

    @Override
    public void setSubscriberAddress(String SubscriberAddress) {
        int count =0;
     for (int i=0; i<SubscriberAddress.length();i++) {
         if (Character.isDigit(SubscriberAddress.charAt(i))) {
             count++;
         }
     }
     if (count > 0)
     {
         SubscriberRate=15;
         System.out.println("The subscriber rate for this newspaper is " + SubscriberRate);
     }
     else {
         SubscriberRate = 0;
         System.out.println("The address is not valid. and the subscriber rate is " + SubscriberRate);

     }
    }
}
