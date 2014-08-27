package me.kahwah.util;

import junit.framework.TestCase;

public class TridionUriTest extends TestCase {

    public void testParseShortUri() throws Exception {
        TridionUri tridionUri = new TridionUri("tcm:1-23");

        assertEquals(1, tridionUri.getPublicationId());
        assertEquals(23, tridionUri.getItemId());
    }

    public void testParseTypeId() throws Exception {
        TridionUri tridionUri = new TridionUri("tcm:1-23-32");

        assertEquals(32, tridionUri.getTypeId());

    }
}