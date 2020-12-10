package co.casterlabs.apiutil;

import org.jetbrains.annotations.Nullable;

import lombok.NonNull;

public interface ErrorReporter {

    public void apiError(@NonNull String url, @Nullable String sentBody, @Nullable Object sentHeaders, @Nullable String recBody, @Nullable Object recHeaders, @NonNull Throwable t);

}
