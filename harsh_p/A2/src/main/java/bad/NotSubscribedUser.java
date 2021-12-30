package bad;

public class NotSubscribedUser implements User {

    @Override
    public void updateInfo() {

    }

    @Override
    public void watchContent(){
//        throw exception because normal user can't watch content.
    }
}
