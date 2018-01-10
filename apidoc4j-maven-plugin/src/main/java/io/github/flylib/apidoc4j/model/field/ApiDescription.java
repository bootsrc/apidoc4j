package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 14:43
 *
 * Detailed description of the API Method.
 * Usage: @apiDescription This is the Description.
 */
public class ApiDescription {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ApiDescription{" +
                "text='" + text + '\'' +
                '}';
    }
}
