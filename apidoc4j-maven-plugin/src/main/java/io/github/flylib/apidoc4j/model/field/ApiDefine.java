package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model
 * @Description:
 * @date 2017-12-27 14:40
 *
 * Defines a documentation block to be embedded within @api blocks or in an api function like @apiPermission.
 * @apiDefine can only be used once per block
 * By using @apiUse a defined block will be imported, or with the name the title and description will be used.
 * Usage: @apiDefine MyError
 */
public class ApiDefine {
    private String name;
    private String title;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApiDefine{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
