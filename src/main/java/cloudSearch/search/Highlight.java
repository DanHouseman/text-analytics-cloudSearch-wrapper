package cloudSearch.search;

/**
 * Created by dan.houseman on 9/14/16.
 */

/**
 * Retrieves highlights for matches in the specified text or text-array field.
 * Highlight options are specified as a JSON object. If the JSON object is empty.
 * The returned field text is treated as HTML and the first match is highlighted with emphasis tags: <em>search-term</em>.
 *
 * You can specify four options in the JSON object:
 *
 * format—specifies the format of the data in the text field: text or html.
 * When data is returned as HTML, all non-alphanumeric characters are encoded.
 * The default is html.
 *
 * max_phrases—specifies the maximum number of occurrences of the search term(s) you want to highlight.
 * By default, the first occurrence is highlighted.
 *
 * pre_tag—specifies the string to prepend to an occurrence of a search term.
 * The default for HTML highlights is <em>.
 * The default for text highlights is *.
 *
 * post_tag—specifies the string to append to an occurrence of a search term.
 * The default for HTML highlights is </em>.
 * The default for text highlights is *.
 *
 * Examples: highlight.keywords={}, highlight.keywords={format:'text',max_phrases:2,pre_tag:'<b>',post_tag:'</b>'}
 *
 * Required: No
 */

public class Highlight {
    public String field;
    /**
     * Specifies the format of the data in the text field: text or html.
     * When data is returned as HTML, all non-alphanumeric characters are encoded.
     * The default is html.
     */
    public String format;
    /**
     * Specifies the maximum number of occurrences of the search term(s) you want to highlight.
     * By default, the first occurrence is highlighted.
     */
    public Integer maxPhrases;
    /**
     * Specifies the string to prepend to an occurrence of a search term.
     * The default for HTML highlights is <em>.
     * The default for text highlights is *.
     */
    public String preTag;
    /**
     * Specifies the string to append to an occurrence of a search term.
     * The default for HTML highlights is </em>.
     * The default for text highlights is *.
     */
    public String postTag;
}
