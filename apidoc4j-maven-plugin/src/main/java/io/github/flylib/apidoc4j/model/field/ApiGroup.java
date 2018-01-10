package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model
 * @Description:
 * @date 2017-12-27 13:24
 *
 * Should always be used.
 * Defines to which group the method documentation block belongs. Groups will be used for the Main-Navigation in the generated output. Structure definition not need @apiGroup.
 * Usage: @apiGroup User
 */
public class ApiGroup {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApiGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}
