package constants;

public interface ServiceConstants {

    String BASE_URL = "https://be-api-users.icarus.sit.tbsgroup.co.id";
    String ENDPOINT_CREATE_IDENTIFY_USER = "/api/v1/user/identify";
    String ENDPOINT_CREATE_REQUEST_OTP = "/api/v1/otp/request";
    String ENDPOINT_CREATE_VALIDATE_OTP = "/api/v1/otp/validate";
    String ENDPOINT_CREATE_REGISTER = "/api/v1/user/register";
    String ENDPOINT_LOGIN_USER = "/api/v1/user/login";
    String ENDPOINT_DELETE_USER = "/api/v1/user";
    String ENDPOINT_PASSWORD_RESET = "/api/v1/user/password/reset";
    String ENDPOINT_CHANGE_PASSWORD = "/api/v1/user/password/change";
    String ENDPOINT_PASSWORD_VERIFY = "/api/v1/user/password/verify";
    String ENDPOINT_USER_PROFILE = "/api/v1/user/profile";
    String ENDPOINT_UPDATE_USER_PROFILE = "/api/v1/user/profile";
    String ENDPOINT_MEMBERSHIP_CARD_INFO = "/api/v1/membership/card/info";
    String ENDPOINT_MEMBERSHIP_POINT = "/api/v1/membership/point";
    String ENDPOINT_MEMBERSHIP_POINT_HISTORY = "/api/v1/membership/point/history";
    String ENDPOINT_MEMBERSHIP_INFO = "/api/v1/membership/info";
    String ENDPOINT_MEMBERSHIP_SHOPPING_HISTORY= "/api/v1/membership/shopping/history";
    String ENDPOINT_MEMBERSHIP_CUSTOMERGROUPS = "/api/v1/membership/customerGroups";
    String ENDPOINT_USER_PROFILE_PICTURE = "/api/v1/user/profile/picture";
    String ENDPOINT_MY_CARDS = "/api/v1/myCards";

}