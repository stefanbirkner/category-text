package com.github.stefanbirkner.catalogtext;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void test() throws Exception {
        String input = getResource("/input.md");
        String output = new Converter().convert(input);
        assertEquals(getResource("/output.html"), output);
    }

    private String getResource(String name) throws IOException {
        InputStream resource = getClass().getResourceAsStream(name);
        return IOUtils.toString(resource);
    }
}
