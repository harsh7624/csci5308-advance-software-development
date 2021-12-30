package bad;

public class SubscribedUser implements User {
    public void updateInfo() {

    }

    @Override
    public void watchContent(){
        /*
        Return content to the user who has paid for the subscription.
        * */
        System.out.println("you can watch content");
    }
}
