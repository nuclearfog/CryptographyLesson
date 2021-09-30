package org.nuclearfog.cryptolesson.backend.algorithm;

import org.bouncycastle.crypto.engines.IDEAEngine;
import org.bouncycastle.crypto.paddings.PKCS7Padding;

import java.io.IOException;


/**
 * This class provides methods for IDEA encryption
 *
 * @author nuclearfog
 */
public class IDEA extends SymmetricCryptography {

    private static final int KEYSIZE = 16;


    @Override
    public byte[] encrypt(byte[] input, String password, String hash) throws IOException {
        try {
            return encryptDecrypt(input, password, hash, new IDEAEngine(), new PKCS7Padding(), KEYSIZE, true);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }


    @Override
    public byte[] decrypt(byte[] input, String password, String hash) throws IOException {
        try {
            return encryptDecrypt(input, password, hash, new IDEAEngine(), new PKCS7Padding(), KEYSIZE, false);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}