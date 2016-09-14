package cloudSearch.search;

import java.util.List;

/**
 * Created by dan.houseman on 9/14/16.
 */


/**
 * Result of a query executed on Amazon Cloud Search.
 */
public class Result {
    public String rid;

    public long time;

    public int found;

    public int start;

    public List<Hit> hits;
}