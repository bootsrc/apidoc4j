package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:15
 *
 * Outputs the permission name. If the name is defined with @apiDefine the generated documentation include the additional title and description.
 * Usage: @apiPermission admin
 */
public class ApiPermission {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApiPermission{" +
                "name='" + name + '\'' +
                '}';
    }
}
