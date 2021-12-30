package good;

public interface User {

    public boolean updateInfo(String email);

/* Here we do not implement the watchContent method because we know that
*  all the users would not be able to watch content only the premium users would be able to watch content.
* */
}
