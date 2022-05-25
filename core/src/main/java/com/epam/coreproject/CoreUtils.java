package com.epam.coreproject;

import com.epam.libraryproject.Utils;

import java.util.Arrays;

public final class CoreUtils {

    private CoreUtils() {}

    public static boolean isAllPositive(String... numbers) {
        return Arrays
                .stream(numbers)
                .allMatch(Utils::isPositive);
    }

    public static boolean checkAllPositive(String... numbers) throws IllegalArgumentException {
        return Arrays
                .stream(numbers)
                .allMatch(Utils::checkIsPositive);
    }
}
