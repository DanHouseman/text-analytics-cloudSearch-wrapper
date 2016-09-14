package cloudSearch.search;

/**
 * Created by dan.houseman on 9/14/16.
 */

/**
 * Specifies a field that you want to get facet information for—FIELD is the name of the field.
 * The specified field must be facet enabled in the domain configuration.
 * Facet options are specified as a JSON object.
 * If the JSON object is empty, facet.FIELD={}, facet counts are computed for all field values, the facets are sorted by facet count, and the top 10 facets are returned in the results.
 *
 * You can specify three options in the JSON object:
 * Sort specifies how you want to sort the facets in the results: bucket or count.
 * Specify bucket to sort alphabetically or numerically by facet value (in ascending order).
 * Specify count to sort by the facet counts computed for each facet value (in descending order).
 *
 * To retrieve facet counts for particular values or ranges of values, use the buckets option instead of sort.
 * Buckets specifies an array of the facet values or ranges you want to count.
 * Buckets are returned in the order they are specified in the request.
 * To specify a range of values, use a comma (,) to separate the upper and lower bounds and enclose the range using brackets or braces.
 * A square brace, [ or ], indicates that the bound is included in the range, a curly brace, { or }, excludes the bound.
 * You can omit the upper or lower bound to specify an open-ended range.
 * When omitting a bound, you must use a curly brace.
 * The sort and size options are not valid if you specify buckets.
 *
 * Size specifies the maximum number of facets to include in the results.
 * By default, Amazon CloudSearch returns counts for the top 10.
 * The size parameter is only valid when you specify the sort option; it cannot be used in conjunction with buckets.
 *
 * For example, the following request gets facet counts for the daydate field, sorts the facet counts by latentscore and returns counts for the top three:
 * facet.daydate={sort:"bucket", size:3}
 * To specify which values or range of values you want to calculate facet counts for, use the buckets option.
 * For example, the following request calculates and returns the facet counts by latentscore:
 *
 * facet.latentscore={buckets:["[0,20]","[21,40]",
 *              "[41,60]","[61,80]",
 *              "[80,}"]}
 * You can also specify individual values as buckets:
 *
 * facet.questionlabel={buckets:["OE_Activity prior to shopping","OE_Future Plans","OE_Other Sites"]}
 * Note that the facet values are case-sensitive—with.
 * If you specify ["oe_Activity prior to shopping","oe_Future Plans","oe_Other Sites"] instead of ["OE_Activity prior to shopping","OE_Future Plans","OE_Other Sites"], all facet counts are zero.
 *
 * Required: No
 */
public class Facet {
    /**
     * Specifies a field that you want to get facet information
     */
    public String field;

    /**
     * Sort specifies how you want to sort the facets in the results: bucket or count.
     * Specify bucket to sort alphabetically or numerically by facet value (in ascending order).
     * Specify count to sort by the facet counts computed for each facet value (in descending order).
     * To retrieve facet counts for particular values or ranges of values, use the buckets option instead of sort.
     */
    public String sort;

    /**
     * Buckets specifies an array of the facet values or ranges you want to count.
     * Buckets are returned in the order they are specified in the request.
     * To specify a range of values, use a comma (,) to separate the upper and lower bounds and enclose the range using brackets or braces.
     * A square brace, [ or ], indicates that the bound is included in the range, a curly brace, { or }, excludes the bound.
     * You can omit the upper or lower bound to specify an open-ended range.
     * When omitting a bound, you must use a curly brace.
     * The sort and size options are not valid if you specify buckets.
     */
    public String buckets;

    /**  * Size specifies the maximum number of facets to include in the results.
     *  By default, Amazon CloudSearch returns counts for the top 10.
     *  The size parameter is only valid when you specify the sort option; it cannot be used in conjunction with buckets.  */
    public Integer size;
}