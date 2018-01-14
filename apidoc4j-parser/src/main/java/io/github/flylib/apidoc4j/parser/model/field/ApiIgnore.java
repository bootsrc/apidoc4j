package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:06
 *
 * Place it on top of a block.
 * A block with @apiIgnore will not be parsed. It is usefull, if you leave outdated or not finished Methods in your source code and you don't want to publish it into the documentation.
 * Usage: @apiIgnore Not finished Method
 */
public class ApiIgnore {
    private String hint;

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public String toString() {
        return "ApiIgnore{" +
                "hint='" + hint + '\'' +
                '}';
    }
}
