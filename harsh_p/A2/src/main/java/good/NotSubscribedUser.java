package good;

public class NotSubscribedUser implements User {

    public boolean updateInfo(String email){
        if(email == "h@gmail.com"){
            System.out.println("Info updated for: "+email);
            return true;
        }
        else{
            return false;
        }
    }

//    No method implementation of watch content because this type of user wont be able to watch content.
}
