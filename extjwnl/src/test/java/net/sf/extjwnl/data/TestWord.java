package net.sf.extjwnl.data;

import net.sf.extjwnl.JWNLException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests the word functionality.
 *
 * @author Brett Walenz <bwalenz@users.sourceforge.net>
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class TestWord extends BaseDataTest {

    private Word word;

    private String lemma = "testLemma";
    private int index = 1;

    @Before
    public void setUp() throws JWNLException, IOException {
        super.setUp();
        word = new Word(dictionary, new Synset(dictionary, POS.NOUN), index, lemma);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate() {
        word = new Word(null, null, -1, null);

    }

    @Test
    public void testGetIndex() {
        Assert.assertEquals(index, word.getIndex());
    }

    @Test
    public void testGetLemma() {
        Assert.assertEquals(lemma, word.getLemma());
    }
}