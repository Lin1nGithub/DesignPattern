package lawOfDemeter;

import lawOfDemeter.po.Html;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/21 14:29
 */
public class DocumentFactory {
    private HtmlDownloader downloader;

    public DocumentFactory(HtmlDownloader downloader) {
        this.downloader = downloader;
    }
    public Document createDocument(String url) {
        Html html = downloader.downloadHtml(url);
        return new Document(url, html);
    }

}
