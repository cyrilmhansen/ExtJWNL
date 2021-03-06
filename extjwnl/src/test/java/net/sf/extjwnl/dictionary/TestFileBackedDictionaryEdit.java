package net.sf.extjwnl.dictionary;

import net.sf.extjwnl.JWNLException;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Tests editing the FileBackedDictionary.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class TestFileBackedDictionaryEdit {

    protected String properties = "./src/test/resources/clean_file.xml";

    @Test
    public void TestLoadEmptyDictionary() throws IOException, JWNLException, InterruptedException {
        Dictionary dictionary = Dictionary.getInstance(new FileInputStream(properties));
        dictionary.edit();
        dictionary.save();
        dictionary.close();
        dictionary.delete();
    }
}