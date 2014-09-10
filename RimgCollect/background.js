// 1.0 RimgCollect Extension for Chrome
//Display all pictures and gifs from comment thread on Reddit

/**
 * Get all pictures by name
 * Right now pretty kludgy iterate over set number looking for name "img"
 * Throws error when no img exists
 * Try search by class potentially
 */
chrome.browserAction.onClicked.addListener(function(tab) {
    chrome.tabs.executeScript(tab.id, {file: "content_script.js"}, function() {
        if (chrome.runtime.lastError) {
            console.error(chrome.runtime.lastError.message);
        }
    });
});

