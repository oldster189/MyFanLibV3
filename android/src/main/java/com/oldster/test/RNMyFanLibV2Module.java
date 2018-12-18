package com.oldster.test;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNMyFanLibV2Module extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNMyFanLibV2Module(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNMyFanLibV2";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement
    }

    @ReactMethod
    public void isAvailable(final Promise promise) {
        try {
            FingerprintManager manager = getFingerprintManager();
            boolean v = (manager != null && manager.isHardwareDetected() && manager.hasEnrolledFingerprints());
            promise.resolve(v);
        } catch (Exception ex) {
            promise.reject("ERR_UNEXPECTED_EXCEPTION", ex);
        }
    }

    @ReactMethod
    public String getApplicationName() {
        return "Codemobiles App";
    }

    private FingerprintManager getFingerprintManager() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return (FingerprintManager) reactContext.getSystemService(reactContext.FINGERPRINT_SERVICE);
        } else {
            return null;
        }
    }
}