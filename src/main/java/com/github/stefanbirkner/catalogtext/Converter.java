package com.github.stefanbirkner.catalogtext;

import com.github.rjeschke.txtmark.DefaultDecorator;

import static com.github.rjeschke.txtmark.Processor.process;

public class Converter {

    public String convert(String markdown) {
        return process(markdown, new SpecialDecorator());
    }

    private static class SpecialDecorator extends DefaultDecorator {
        @Override
        public void openStrong(StringBuilder out) {
            out.append("<span class=\"hervorhebung2\">");
        }

        @Override
        public void closeStrong(StringBuilder out) {
            out.append("</span>");
        }

        @Override
        public void openEmphasis(StringBuilder out) {
            out.append("<span class=\"hervorhebung1\">");
        }

        @Override
        public void closeEmphasis(StringBuilder out) {
            out.append("</span>");
        }
    }
}
