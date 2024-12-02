package lab.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FacebookUserAdapter implements UserAdapter{
    private final FacebookUser facebookUser;

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return facebookUser.getLastActiveTime();
    }
}
