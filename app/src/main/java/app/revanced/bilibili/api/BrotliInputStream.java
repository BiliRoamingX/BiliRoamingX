package app.revanced.bilibili.api;

import androidx.annotation.Keep;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

// superclass will replaced by patcher
@Keep
public class BrotliInputStream extends GZIPInputStream {
    public BrotliInputStream(InputStream in) throws IOException {
        // will replaced by patcher
        super(in);
    }
}
