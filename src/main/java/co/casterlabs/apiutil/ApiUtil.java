package co.casterlabs.apiutil;

import java.util.Map;

import org.jetbrains.annotations.Nullable;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class ApiUtil {

    private static @NonNull @Getter @Setter ErrorReporter errorReporter = new ErrorReporter() {
        @Override
        public void apiError(@NonNull String url, @Nullable String sentBody, @Nullable Map<String, String> sentHeaders, @Nullable String recBody, @Nullable Map<String, String> recHeaders, @NonNull Throwable t) {}
    };

}
