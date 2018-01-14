package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 14:57
 *
 * Example for usage of an API method. Output as a pre-formatted code.
 * Use it for a complete example at the beginning of the description of an endpoint.
 * Usage: @apiExample {js} Example usage:
 * This is an example.
 */
public class ApiExample {
    private String type;
    private String title;
    private String example;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "ApiExample{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
