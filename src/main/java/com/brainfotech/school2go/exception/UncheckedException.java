package com.brainfotech.school2go.exception;

import com.brainfotech.school2go.util.MessageUtil;

/**
 * Created by thameema on 4/27/14.
 */
public class UncheckedException extends RuntimeException {

    private final String code;
    private String message;
    private final Object[] messageParameters;

    public UncheckedException(String code, Object... messageParameters) {
        this(code, messageParameters, null);
    }

    public UncheckedException(String code) {
        this(code, null, null, null);
    }

    public UncheckedException(String code, Throwable cause) {
        this(code, null, cause,null);
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Object[] getMessageParameters() {
        return messageParameters;
    }


    public UncheckedException(String code, Object[] messageParameters,
                              Throwable cause) {
        if (cause != null) {
            initCause(cause);
        } else {
            if (messageParameters != null) {
                for (Object param : messageParameters) {
                    if (param instanceof Throwable) {
                        initCause((Throwable)param);
                        break;
                    }
                }
            }
        }
        this.code = code;
        this.message = MessageUtil.getMessage(code,messageParameters);
        this.messageParameters = messageParameters;

    }

}
