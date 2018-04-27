package com.upsales.other;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.widget.Toast;

import timber.log.Timber;

/**
 * Utility class for showing toasts and avoiding NPE's
 */
public class Toasts {

    private Toasts() {}

    public static void showToast(@Nullable Context context, @Nullable String message, int length) {
        if (context == null) {
            Timber.w("Toast '%s' skipped, context is null", message);
        } else if (TextUtils.isEmpty(message)) {
            Timber.w("Unable to show toast with empty message");
        } else {
            Toast.makeText(context, message, length).show();
        }
    }

    public static void showToast(@Nullable Context context, @StringRes int stringRes, int length, @Nullable Object... formatArgs) {
        if (context != null) {
            showToast(context, context.getString(stringRes, formatArgs), length);
        } else {
            Timber.w("Toast skipped, context is null");
        }
    }

    public static void showShortToast(@Nullable Context context, @Nullable String message) {
        showToast(context, message, Toast.LENGTH_SHORT);
    }

    public static void showShortToast(@Nullable Context context, @StringRes int stringRes, @Nullable Object... formatArgs) {
        showToast(context, stringRes, Toast.LENGTH_SHORT, formatArgs);
    }

    public static void showLongToast(@Nullable Context context, @Nullable String message) {
        showToast(context, message, Toast.LENGTH_LONG);
    }

    public static void showLongToast(@Nullable Context context, @StringRes int stringRes, @Nullable Object... formatArgs) {
        showToast(context, stringRes, Toast.LENGTH_LONG, formatArgs);
    }
}
