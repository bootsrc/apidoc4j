package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 14:52
 *
 * Example of an error return message, output as a pre-formatted code.
 * Usage: @apiErrorExample {json} Error-Response:
 * This is an example.
 */
public class ApiErrorExample {
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
        return "ApiErrorExample{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
