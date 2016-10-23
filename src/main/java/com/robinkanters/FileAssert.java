package com.robinkanters;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("WeakerAccess")
public class FileAssert {
    public static void assertFileExists(File f) {
        assertTrue(f.exists());
    }

    public static void assertFileExists(String filePath) {
        assertFileExists(new File(filePath));
    }

    public static void assertFileNotExists(File f) {
        assertFalse(f.exists());
    }

    public static void assertFileNotExists(String filePath) {
        assertFileNotExists(new File(filePath));
    }
}
