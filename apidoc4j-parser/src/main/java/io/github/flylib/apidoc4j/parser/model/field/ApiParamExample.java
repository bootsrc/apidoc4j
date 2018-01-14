package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:12
 *
 * Parameter request example.
 * Usage: @apiParamExample {json} Request-Example:
 * { "content": "This is an example content" }
 */
public class ApiParamExample {
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
        return "ApiParamExample{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
