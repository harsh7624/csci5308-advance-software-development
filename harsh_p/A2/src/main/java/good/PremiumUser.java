package good;

public class PremiumUser implements SubscribedUser {

    public boolean updateInfo(String email){
        if(email == "h@gmail.com"){
            System.out.println("Info updated for: "+email);
            return true;
        }
        else{
            return false;
        }
    }

    public String watchContent(){
        /* We implement this method in this premium class only because we know that only premium users can request content.*/
        System.out.println("you can watch content");
        return "success";
    }

    public String canComment(){
        System.out.println("You can also comment on content");
        return "success";
    }

}
