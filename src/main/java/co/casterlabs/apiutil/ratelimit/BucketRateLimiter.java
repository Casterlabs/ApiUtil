package co.casterlabs.apiutil.ratelimit;

import java.util.concurrent.TimeUnit;

public class BucketRateLimiter extends RateLimiter {

    public BucketRateLimiter(int bucketSize, int refillRate, TimeUnit unit) {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    this.setAvailable(bucketSize);

                    Thread.sleep(unit.toMillis(refillRate));
                } catch (InterruptedException e) {}
            }
        });

        t.setDaemon(true);
        t.start();
    }

}
