package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:58
 *
 * Include a with @apiDefine defined block. If used with @apiVersion the same or nearest predecessor will be included.
 * Usage: @apiUse MySuccess
 */
public class ApiUse {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApiUse{" +
                "name='" + name + '\'' +
                '}';
    }
}
