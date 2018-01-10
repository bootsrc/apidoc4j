package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:06
 *
 * Should always be used.
 * Defines the name of the method documentation block. Names will be used for the Sub-Navigation in the generated output. Structure definition not need @apiName.
 * Usage: @apiName GetUser
 */
public class ApiName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApiName{" +
                "name='" + name + '\'' +
                '}';
    }
}
