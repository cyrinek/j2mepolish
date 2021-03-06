package de.enough.polish.content.filter.impl;

import de.enough.polish.content.ContentDescriptor;
import de.enough.polish.content.filter.ContentFilter;

/**
 * Filter for HTTP content
 * @author Ovidiu Iliescu
 *
 */
public class HttpContentFilter implements ContentFilter {

	/* (non-Javadoc)
	 * @see de.enough.polish.content.filter.ContentFilter#filter(de.enough.polish.content.ContentDescriptor)
	 */
	public boolean filter(ContentDescriptor descriptor) {
		return descriptor.getUrl().startsWith("http://");
	}

}
