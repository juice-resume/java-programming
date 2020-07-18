package retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Retryable(value = IllegalAccessException.class, maxAttempts = 5,
            backoff = @Backoff(value = 1500, maxDelay = 100000, multiplier = 1.2))
    public void execute() throws IllegalAccessException {
        System.out.println("service execute...");
        throw new IllegalAccessException("IllegalAccessException");
    }
}
