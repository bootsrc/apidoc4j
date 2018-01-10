package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 16:00
 *
 * Set the version of an documentation block. Version can also be used in @apiDefine.
 * Blocks with same group and name, but different versions can be compared in the generated output, so you or a frontend developer can retrace what changes in the API since the last version.
 * Usage: @apiVersion 1.6.2
 */
public class ApiVersion {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ApiVersion{" +
                "version='" + version + '\'' +
                '}';
    }
}
