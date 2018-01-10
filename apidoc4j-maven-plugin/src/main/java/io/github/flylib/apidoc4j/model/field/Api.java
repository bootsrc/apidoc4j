package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model
 * @Description:
 * @date 2017-12-27 14:34
 *
 * Required!
 * Without that indicator, apiDoc parser ignore the documentation block.
 * The only exception are documentation blocks defined by  @apiDefine, they not required @api.
 * Usage: @api {get} /user/:id Users unique ID.
 */
public class Api {
    private String method;
    private String path;
    private String title;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Api{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
