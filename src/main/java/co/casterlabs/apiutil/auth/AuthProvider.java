package co.casterlabs.apiutil.auth;

import lombok.NonNull;
import okhttp3.Request;

public interface AuthProvider {

    public void authenticateRequest(@NonNull Request.Builder request);

    public void refresh() throws ApiAuthException;

}
