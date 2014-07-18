package com.crawljax.core.plugin;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.core.CrawlerContext;


public interface OnPopupWindowPlugin extends Plugin {

	// ATTENTION!!!
	void onPopupWindow(CrawlerContext context);

}