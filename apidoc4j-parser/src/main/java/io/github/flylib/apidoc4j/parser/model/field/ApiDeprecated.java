package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model
 * @Description:
 * @date 2017-12-27 14:41
 * Mark an API Method as deprecated
 * Usage: @apiDeprecated use now (#Group:Name).
 */
public class ApiDeprecated {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ApiDeprecated{" +
                "text='" + text + '\'' +
                '}';
    }
}
