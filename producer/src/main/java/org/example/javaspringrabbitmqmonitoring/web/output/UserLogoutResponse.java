package org.example.javaspringrabbitmqmonitoring.web.output;

public class UserLogoutResponse {
    private boolean success;

    public UserLogoutResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
