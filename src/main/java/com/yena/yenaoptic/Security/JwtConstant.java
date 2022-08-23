package com.yena.yenaoptic.Security;

public class JwtConstant {
    public static final String USER_IMAGE_PATH = "/user/image/";
    public static final String AUTORIZATION="Authorization";
    public static final String BEARER="Bearer ";
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String JPG_EXTENSION = "jpg";
    public static final String DEFAULT_USER_IMAGE_PATH = "/user/image/profile/";
    public static final String DOT = ".";
    public static final String FORWARD_SLASH = "/";
    public static final String TEMP_PROFILE_IMAGE_BASE_URL = "https://robohash.org/";
    public static final String NOT_AN_IMAGE_FILE = " is not an image file. Please upload an image file";
    public static final String USER_FOLDER = System.getProperty("user.home") + "/supportportal/user/";
    public static final String DIRECTORY_CREATED = "Created directory for: ";
    public static final String FILE_SAVED_IN_FILE_SYSTEM = "Saved file in file system by name: ";
}
