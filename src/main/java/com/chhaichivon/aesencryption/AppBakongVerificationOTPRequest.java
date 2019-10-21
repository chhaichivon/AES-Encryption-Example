package com.chhaichivon.aesencryption;

/**
 * @author: Chhai Chivon on 9/23/2019
 * Digital Channel System Officer
 */

public class AppBakongVerificationOTPRequest {

    private String verificationCode;
    private String requestId;
    private String publicKey;

    public String getVerificationCode() {
        return verificationCode;
    }
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
