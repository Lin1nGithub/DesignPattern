package lawOfDemeter;

import lawOfDemeter.po.Html;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/21 14:23
 */
public class Document {
    private Html html;
    private String url;
    public Document(String url, Html html) {
        this.html = html;    this.url = url;
    }
    //...
}
