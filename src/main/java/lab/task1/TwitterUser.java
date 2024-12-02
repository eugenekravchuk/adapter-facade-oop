package lab.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private final String userMail;
    private final String country;
    private final long lastActiveTime;
}
