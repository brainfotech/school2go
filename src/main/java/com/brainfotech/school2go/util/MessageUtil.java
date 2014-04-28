package com.brainfotech.school2go.util;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Objects;

/**
 * Created by thameema on 4/27/14.
 */

@Component
@Scope("singleton")
public class MessageUtil {

    public static String getMessage(String key) {

        return getMessage(key, null);

    }

    public static String getMessage(String key, Object[] objects) {

        try {
            MessageSource bean = ApplicationContextProvider.getContext().getBean(MessageSource.class);
            return bean.getMessage(key, objects, Locale.getDefault());
        }
        catch (Exception e) {
            return "Unresolved code: " + key;
        }

    }
}
