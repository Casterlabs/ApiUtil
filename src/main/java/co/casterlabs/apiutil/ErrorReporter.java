package co.casterlabs.apiutil;

import java.util.Map;

import org.jetbrains.annotations.Nullable;

import lombok.NonNull;

public interface ErrorReporter {

    public void apiError(@NonNull String url, @Nullable String sentBody, @Nullable Map<Object, Object> sentHeaders, @Nullable String recBody, @Nullable Map<Object, Object> recHeaders, @NonNull Throwable t);

}
