package com.brainfotech.school2go.exception;

/**
 * Created by thameema on 4/27/14.
 */
public class ValidationException extends UncheckedException {

        public ValidationException(String code) {
            super(code);
        }

        public ValidationException(String code, Object... messageParameters) {
            super(code, messageParameters);
        }


        public ValidationException(String code, Throwable cause) {
            super(code, cause);
        }

        public ValidationException(String code, Object[] messageParameters, Throwable cause) {
            super(code, messageParameters, cause);
        }

}
