package com.sql.parse.seasar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.misc.Interval;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/29 20:36
 */
public class CaseInsensitiveCharStream implements CharStream {

    private final CharStream originalStream;

    public CaseInsensitiveCharStream(CharStream originalStream) {
        this.originalStream = originalStream;
    }

    @Override
    public String getText(Interval interval) {
        return originalStream.getText(interval);
    }

    @Override
    public void consume() {
        originalStream.consume();
    }

    @Override
    public int LA(int i) {
        int result = originalStream.LA(i);
        if (result == 0 || result == IntStream.EOF) {
            return result;
        } else {
            return Character.toUpperCase(result);
        }
    }

    @Override
    public int mark() {
        return originalStream.mark();
    }

    @Override
    public void release(int i) {
        originalStream.release(i);
    }

    @Override
    public int index() {
        return originalStream.index();
    }

    @Override
    public void seek(int i) {
        originalStream.seek(i);
    }

    @Override
    public int size() {
        return originalStream.size();
    }

    @Override
    public String getSourceName() {
        return originalStream.getSourceName();
    }
}
