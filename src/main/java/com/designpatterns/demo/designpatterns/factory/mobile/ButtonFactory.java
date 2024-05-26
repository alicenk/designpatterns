package com.designpatterns.demo.designpatterns.factory.mobile;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.NONE)
public class ButtonFactory {
    public static AbstractButton createButton(String type) {
        if (type.equalsIgnoreCase("ios")) {
            return new IOSButton();
        } else if (type.equalsIgnoreCase("android")) {
            return new AndroidButton();
        } else {
            throw new IllegalArgumentException("Geçersiz buton türü.");
        }
    }
}
