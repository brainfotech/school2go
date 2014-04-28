package com.brainfotech.school2go.util;

/**
 * Created by thameema on 4/27/14.
 */

import com.brainfotech.school2go.exception.ValidationException;

public class ThreadLocalUtil {

    public static final InheritableThreadLocal<String> currentUser = new InheritableThreadLocal<String>() {

        @Override
        protected String initialValue() {
            return null;
        }
    };

    private static final InheritableThreadLocal<String> schoolId = new InheritableThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return null;
        }
    };

    private static final InheritableThreadLocal<String> familyId = new InheritableThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return null;
        }
    };

    public static void set(String user, String basicAuthUserString) {
        if (!user.equals(RestPathUtil.HTTP_AUTH_HEADER_DEFAULT_VALUE)) {
            currentUser.set(user);
        } else if (!basicAuthUserString.equals(RestPathUtil.HTTP_AUTH_HEADER_DEFAULT_VALUE)) {
            currentUser.set(CommonUtil.getUserFromAuthHeader(basicAuthUserString));
        } else {
            throw new ValidationException(ErrorCodes.LOGGED_IN_USER_NOT_SET);
        }
    }

    public static void setCurrentUser(String loggedInUserId) {
        currentUser.set(loggedInUserId);
    }

    public static void unset() {
        currentUser.remove();
        familyId.remove();
    }

    public static String get() {
        return currentUser.get();
    }

    public static void setFamilyId(String id) {
        familyId.set(id);
    }

    public static String getFamilyId() {
        return familyId.get();
    }

    public static InheritableThreadLocal<String> getSchoolId() {
        return schoolId;
    }

    public static void setSchoolId(String sid){
        schoolId.set(sid);
    }
}
