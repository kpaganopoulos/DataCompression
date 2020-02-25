/*
 * XZIOException
 *
 * Author: Lasse Collin <lasse.collin@tukaani.org>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */



/**
 * Generic {@link java.io.IOException IOException} specific to this package.
 * The other IOExceptions in this package extend
 * from <code>XZIOException</code>.
 */
public class XZIOException1 extends java.io.IOException {
    private static final long serialVersionUID = 3L;

    public XZIOException1() {
        super();
    }

    public XZIOException1(String s) {
        super(s);
    }
}
