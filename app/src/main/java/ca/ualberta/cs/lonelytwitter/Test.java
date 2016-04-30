package ca.ualberta.cs.lonelytwitter;

import io.searchbox.annotations.JestId;

/**
 * Created by adlawren on 23/03/16.
 */
public class Test {
    @JestId
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        id = newId;
    }

    private String content = null;

    public Test() {
        content = new String();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String newContent) {
        content = newContent;
    }
}
