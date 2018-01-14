package io.github.flylib.apidoc4j.parser.model;

import io.github.flylib.apidoc4j.parser.model.field.*;

import java.util.List;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model
 * @Description:
 * @date 2017-12-27 13:24
 */
public class ApiDoc {
    /**
     * Required!
     * Without that indicator, apiDoc parser ignore the documentation block.
     * The only exception are documentation blocks defined by  @apiDefine, they not required @api.
     * Usage: @api {get} /user/:id Users unique ID.
     */
    private Api api;
    /**
     * Defines a documentation block to be embedded within @api blocks or in an api function like @apiPermission.
     * @apiDefine can only be used once per block
     * By using @apiUse a defined block will be imported, or with the name the title and description will be used.
     * Usage: @apiDefine MyError
     */
    private ApiDefine apiDefine;
    /**
     * Mark an API Method as deprecated
     * Usage: @apiDeprecated use now (#Group:Name).
     */
    private ApiDeprecated apiDeprecated;
    /**
     * Detailed description of the API Method.
     * Usage: @apiDescription This is the Description.
     */
    private ApiDescription apiDescription;
    /**
     * Error return Parameter.
     * Usage: <code>@apiError UserNotFound</code>
     */
    private ApiError apiError ;
    /**
     * Example of an error return message, output as a pre-formatted code.
     * Usage: @apiErrorExample {json} Error-Response:
     * This is an example.
     */
    private List<ApiErrorExample> apiErrorExample;
    /**
     * Example for usage of an API method. Output as a pre-formatted code.
     * Use it for a complete example at the beginning of the description of an endpoint.
     * Usage: @apiExample {js} Example usage:
     * This is an example.
     */
    private ApiExample apiExample;
    /**
     * Should always be used.
     * Defines to which group the method documentation block belongs. Groups will be used for the Main-Navigation in the generated output. Structure definition not need @apiGroup.
     * Usage: @apiGroup User
     */
    private ApiGroup apiGroup;
    /**
     * Describe a parameter passed to you API-Header e.g. for Authorization.
     * Similar operation as @apiParam, only the output is above the parameters.
     * Usage: @apiHeader (MyHeaderGroup) {String} authorization Authorization value.
     */
    private ApiHeader apiHeader;
    /**
     * Parameter request example.
     * Usage: @apiHeaderExample {json} Request-Example:
     * { "content": "This is an example content" }
     */
    private ApiHeaderExample apiHeaderExample;
    /**
     * Place it on top of a block.
     * A block with @apiIgnore will not be parsed. It is usefull, if you leave outdated or not finished Methods in your source code and you don't want to publish it into the documentation.
     * Usage: @apiIgnore Not finished Method
     */
    private ApiIgnore apiIgnore;
    /**
     * Should always be used.
     * Defines the name of the method documentation block. Names will be used for the Sub-Navigation in the generated output. Structure definition not need @apiName.
     * Usage: @apiName GetUser
     */
    private ApiName apiName;
    /**
     * Describe a parameter passed to you API-Method.
     * Usage: @apiParam (MyGroup) {Number} id Users unique ID.
     */
    private List<ApiParam> apiParam;
    /**
     * Parameter request example.
     * Usage: @apiParamExample {json} Request-Example:
     * { "content": "This is an example content" }
     */
    private List<ApiParamExample> apiParamExample;
    /**
     * Outputs the permission name. If the name is defined with @apiDefine the generated documentation include the additional title and description.
     * Usage: @apiPermission admin
     */
    protected ApiPermission apiPermission;
    /**
     * Defines an API as being private to allow the creation of two API specification documents: one that excludes the private APIs and one that includes them.
     * Usage: @apiPrivate
     * Command line usage to exclude/include private APIs: --private false|true
     */
    private ApiPrivate apiPrivate;
    /**
     * Use this parameter in conjunction with the apidoc.json configuration parameter sampleUrl.
     * If sampleUrl is set, all methods will have the api test form (the endpoint from @api will be appended).
     * Without sampleUrl only methods with @apiSampleRequest will have a form.
     * if @apiSampleRequest url is set in a method block, this url will be used for the request (it overrides sampleUrl when it starts with http).
     * If sampleUrl is set and you don't want a method with a test form, then add @apiSampleRequest off to the documentation block.
     * Usage: @apiSampleRequest http://test.github.com
     */
    private ApiSampleRequest apiSampleRequest;
    /**
     * Success return Parameter.
     * Usage: @apiSuccess {String} firstname Firstname of the User.
     */
    private List<ApiSuccess> apiSuccess;
    /**
     * Example of a success return message, output as a pre-formatted code.
     * Usage: @apiSuccessExample {json} Success-Response:
     * { "content": "This is an example content" }
     */
    private List<ApiSuccessExample>  apiSuccessExample;
    /**
     * Include a with @apiDefine defined block. If used with @apiVersion the same or nearest predecessor will be included.
     * Usage: @apiUse MySuccess
     */
    private ApiUse apiUse;
    /**
     * Set the version of an documentation block. Version can also be used in @apiDefine.
     * Blocks with same group and name, but different versions can be compared in the generated output, so you or a frontend developer can retrace what changes in the API since the last version.
     * Usage: @apiVersion 1.6.2
     */
    private ApiVersion apiVersion;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }

    public ApiDefine getApiDefine() {
        return apiDefine;
    }

    public void setApiDefine(ApiDefine apiDefine) {
        this.apiDefine = apiDefine;
    }

    public ApiDeprecated getApiDeprecated() {
        return apiDeprecated;
    }

    public void setApiDeprecated(ApiDeprecated apiDeprecated) {
        this.apiDeprecated = apiDeprecated;
    }

    public ApiDescription getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(ApiDescription apiDescription) {
        this.apiDescription = apiDescription;
    }

    public ApiError getApiError() {
        return apiError;
    }

    public void setApiError(ApiError apiError) {
        this.apiError = apiError;
    }

    public List<ApiErrorExample> getApiErrorExample() {
        return apiErrorExample;
    }

    public void setApiErrorExample(List<ApiErrorExample> apiErrorExample) {
        this.apiErrorExample = apiErrorExample;
    }

    public ApiExample getApiExample() {
        return apiExample;
    }

    public void setApiExample(ApiExample apiExample) {
        this.apiExample = apiExample;
    }

    public ApiGroup getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(ApiGroup apiGroup) {
        this.apiGroup = apiGroup;
    }

    public ApiHeader getApiHeader() {
        return apiHeader;
    }

    public void setApiHeader(ApiHeader apiHeader) {
        this.apiHeader = apiHeader;
    }

    public ApiHeaderExample getApiHeaderExample() {
        return apiHeaderExample;
    }

    public void setApiHeaderExample(ApiHeaderExample apiHeaderExample) {
        this.apiHeaderExample = apiHeaderExample;
    }

    public ApiIgnore getApiIgnore() {
        return apiIgnore;
    }

    public void setApiIgnore(ApiIgnore apiIgnore) {
        this.apiIgnore = apiIgnore;
    }

    public ApiName getApiName() {
        return apiName;
    }

    public void setApiName(ApiName apiName) {
        this.apiName = apiName;
    }

    public List<ApiParam> getApiParam() {
        return apiParam;
    }

    public void setApiParam(List<ApiParam> apiParam) {
        this.apiParam = apiParam;
    }

    public List<ApiParamExample> getApiParamExample() {
        return apiParamExample;
    }

    public void setApiParamExample(List<ApiParamExample> apiParamExample) {
        this.apiParamExample = apiParamExample;
    }

    public ApiPermission getApiPermission() {
        return apiPermission;
    }

    public void setApiPermission(ApiPermission apiPermission) {
        this.apiPermission = apiPermission;
    }

    public ApiPrivate getApiPrivate() {
        return apiPrivate;
    }

    public void setApiPrivate(ApiPrivate apiPrivate) {
        this.apiPrivate = apiPrivate;
    }

    public ApiSampleRequest getApiSampleRequest() {
        return apiSampleRequest;
    }

    public void setApiSampleRequest(ApiSampleRequest apiSampleRequest) {
        this.apiSampleRequest = apiSampleRequest;
    }

    public List<ApiSuccess> getApiSuccess() {
        return apiSuccess;
    }

    public void setApiSuccess(List<ApiSuccess> apiSuccess) {
        this.apiSuccess = apiSuccess;
    }

    public List<ApiSuccessExample> getApiSuccessExample() {
        return apiSuccessExample;
    }

    public void setApiSuccessExample(List<ApiSuccessExample> apiSuccessExample) {
        this.apiSuccessExample = apiSuccessExample;
    }

    public ApiUse getApiUse() {
        return apiUse;
    }

    public void setApiUse(ApiUse apiUse) {
        this.apiUse = apiUse;
    }

    public ApiVersion getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    @Override
    public String toString() {
        return "ApiDoc{" +
                "api=" + api +
                ", apiDefine=" + apiDefine +
                ", apiDeprecated=" + apiDeprecated +
                ", apiDescription='" + apiDescription + '\'' +
                ", apiError=" + apiError +
                ", apiErrorExample=" + apiErrorExample +
                ", apiExample=" + apiExample +
                ", apiGroup=" + apiGroup +
                ", apiHeader=" + apiHeader +
                ", apiHeaderExample=" + apiHeaderExample +
                ", apiIgnore=" + apiIgnore +
                ", apiName=" + apiName +
                ", apiParam=" + apiParam +
                ", apiParamExample=" + apiParamExample +
                ", apiPermission=" + apiPermission +
                ", apiPrivate=" + apiPrivate +
                ", apiSampleRequest='" + apiSampleRequest + '\'' +
                ", apiSuccess=" + apiSuccess +
                ", apiSuccessExample=" + apiSuccessExample +
                ", apiUse=" + apiUse +
                ", apiVersion=" + apiVersion +
                '}';
    }
}
