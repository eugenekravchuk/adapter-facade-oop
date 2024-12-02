package lab.task1;

import java.time.Instant;

public class MessageSender {
    public void send(String text, UserAdapter user, String country) {
        long currentTime = Instant.now().toEpochMilli();
        long oneHourInMillis = 60 * 60 * 1000;

        if (user.getCountry().equalsIgnoreCase(country) && (currentTime - user.getLastActiveTime() <= oneHourInMillis)) {
            System.out.printf("Sending message: \"%s\" to %s%n", text, user.getEmail());
        } else {
            System.out.println("User does not meet the criteria for receiving the message.");
        }
    }   
}
