package io.github.flylib.apidoc4j.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:19
 *
 * Use this parameter in conjunction with the apidoc4j.json configuration parameter sampleUrl.
 * If sampleUrl is set, all methods will have the api test form (the endpoint from @api will be appended).
 * Without sampleUrl only methods with @apiSampleRequest will have a form.
 * if @apiSampleRequest url is set in a method block, this url will be used for the request (it overrides sampleUrl when it starts with http).
 * If sampleUrl is set and you don't want a method with a test form, then add @apiSampleRequest off to the documentation block.
 * Usage: @apiSampleRequest http://test.github.com
 */
public class ApiSampleRequest {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ApiSampleRequest{" +
                "url='" + url + '\'' +
                '}';
    }
}
