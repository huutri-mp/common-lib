package com.example.commonlib.Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MailTemplate {

    ORDER_SUCCESS("ordersuccess"),
    PAYMENT_SUCCESS("paymentsuccess"),
    USER_CREATED("usercreated"),
    USER_UPDATED("userupdated"),
    PASSWORD_CHANGED("passwordchanged");

    private final String key;
}
