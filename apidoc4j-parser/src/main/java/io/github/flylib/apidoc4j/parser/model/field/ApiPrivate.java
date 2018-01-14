package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:16
 *
 * Defines an API as being private to allow the creation of two API specification documents: one that excludes the private APIs and one that includes them.
 * Usage: @apiPrivate
 * Command line usage to exclude/include private APIs: --private false|true
 */
public class ApiPrivate {
    private boolean privateValue;

    public boolean isPrivateValue() {
        return privateValue;
    }

    public void setPrivateValue(boolean privateValue) {
        this.privateValue = privateValue;
    }

    @Override
    public String toString() {
        return "ApiPrivate{" +
                "privateValue=" + privateValue +
                '}';
    }
}
