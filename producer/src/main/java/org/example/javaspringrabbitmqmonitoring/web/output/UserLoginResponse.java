package org.example.javaspringrabbitmqmonitoring.web.output;

public class UserLoginResponse {
    private boolean success;

    public UserLoginResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
