package com.chhaichivon.aesencryption;

/**
 * @author: Chhai Chivon on 9/23/2019
 * Digital Channel System Officer
 */

public class TestJson {


    public static void main(String[] agrs){


        String data = "{\n" +
                "\t\"serviceType\" : \"VERIFICATION_OTP\",\n" +
                "\t\"verificationCode\": \"214398\",\n" +
                "\t\"requestId\":\"123\",\n" +
                "\t\"devID\":\"d3a86bd0-7f30-4ced-8d0c-55ff778ef77e\",\n" +
                "\t\"publicKey\":\"9efb2b81a25ad3471b7591bac7005b69078a7f9ba2f64dcb773ee37a897ce297\",\n" +
                "\t\"privateKey\":\"a260432152e387a48b19a9c4e9bbb66c50e22eeee22f4da673413b0b61ce69f2\",\n" +
                "    \"phone\":\"85570446696\",\n" +
                "    \"versionOS\":\"Android\"\n" +
                "}";
        AppBakongVerificationOTPRequest appBakongVerificationOTPRequest  = JsonUtil.fromJson( data, AppBakongVerificationOTPRequest.class );
        if(appBakongVerificationOTPRequest != null){
            System.out.println("==================================================");
            System.out.println("appBakongVerificationOTPRequest " + appBakongVerificationOTPRequest.getVerificationCode());
            System.out.println("appBakongVerificationOTPRequest " + appBakongVerificationOTPRequest.getRequestId());
            System.out.println("appBakongVerificationOTPRequest " + appBakongVerificationOTPRequest.getPublicKey());

            System.out.println("==================================================");
        }


        AppBakongRegistrationRequest appBakongRegistrationRequest = JsonUtil.fromJson( data, AppBakongRegistrationRequest.class );
        if(appBakongRegistrationRequest != null){
            System.out.println("==================================================");
            System.out.println("appBakongRegistrationRequest " + appBakongRegistrationRequest.getDevID());
            System.out.println("appBakongRegistrationRequest " + appBakongRegistrationRequest.getPublicKey());
            System.out.println("appBakongRegistrationRequest " + appBakongRegistrationRequest.getPrivateKey());
            System.out.println("appBakongRegistrationRequest " + appBakongRegistrationRequest.getPhone());
            System.out.println("appBakongRegistrationRequest " + appBakongRegistrationRequest.getVersionOS());
            System.out.println("==================================================");
        }

    }
}
