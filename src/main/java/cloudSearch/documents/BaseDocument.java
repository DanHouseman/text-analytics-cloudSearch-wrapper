package cloudSearch.documents;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dan.houseman on 9/14/16.
 */

public class BaseDocument {
    /**
     * A unique ID for the document (docid).
     *
     * A document ID can contain the following characters: a-z (lower-case letters), 0-9, and _ (underscore).
     * Document IDs cannot begin with an underscore.
     */
    public String id;

    /**
     * A search documents version number for the add or delete operation.
     * The version is used to guarantee that older updates aren't accidentally applied.
     * The version also provides control over the ordering of concurrent updates to the service.
     * The search documents service guarantees that the update with the highest version will be applied.
     * That document will remain there until an add or delete operation with a higher version number and the same ID is received.
     * If you submit multiple add or delete operations with the same version number, which one takes precedence is undefined.
     * You must increase the version number every time you submit a new add or delete operation for a document.
     */
    public long version = 1;

    /**
     * The document language as a two-letter language code, such as en for English.
     */
    public String lang = "en";

    /**
     * A name-value pair for each document field
     */
    public Map<String, Object> fields = new LinkedHashMap<String, Object>();


    public void addField(String name, String value) {
        fields.put(name, value);
    }

    public void addField(String name, Integer value) {
        fields.put(name, value);
    }

    public void addField(String name, Long value) {
        fields.put(name, value);
    }

    public void addField(String name, List<String> values) {
        fields.put(name, values);
    }
}
