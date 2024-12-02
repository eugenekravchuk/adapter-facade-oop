package lab.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwitterUserAdapter implements UserAdapter{
    private final TwitterUser twitterUser;

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
