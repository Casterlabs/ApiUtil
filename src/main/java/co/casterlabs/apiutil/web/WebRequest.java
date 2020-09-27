package co.casterlabs.apiutil.web;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import co.casterlabs.apiutil.auth.ApiAuthException;

public abstract class WebRequest<T> {

    public CompletableFuture<T> sendAsync() {
        CompletableFuture<T> future = new CompletableFuture<T>();

        new Thread(() -> {
            try {
                future.complete(this.execute());
            } catch (Exception e) {
                future.completeExceptionally(e);
            }
        }).start();

        return future;
    }

    public T send() throws ApiException, ApiAuthException {
        try {
            return this.execute();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    protected abstract T execute() throws ApiException, ApiAuthException, IOException;

}
