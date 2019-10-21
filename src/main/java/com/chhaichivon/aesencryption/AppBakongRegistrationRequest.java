package com.chhaichivon.aesencryption;

/**
 * @author: Chhai Chivon on 9/23/2019
 * Digital Channel System Officer
 */

public class AppBakongRegistrationRequest {

    private String devID;
    private String publicKey;
    private String privateKey;
    private String phone;
    private String versionOS;

    public String getDevID() {
        return devID;
    }
    public void setDevID(String devID) {
        this.devID = devID;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getPrivateKey() {
        return privateKey;
    }
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getVersionOS() {
        return versionOS;
    }
    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }
}
