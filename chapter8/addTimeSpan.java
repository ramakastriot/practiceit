/* Add the following method to the TimeSpan class:
 *
 * public void add(TimeSpan span)
 *
 * Adds the given amount of time to this time span.
 */
public void add(TimeSpan span) {
    add(span.hours, span.minutes);
}
