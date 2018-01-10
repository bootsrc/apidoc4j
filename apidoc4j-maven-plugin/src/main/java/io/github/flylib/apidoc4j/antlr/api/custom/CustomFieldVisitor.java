package io.github.flylib.apidoc4j.antlr.api.custom;

import io.github.flylib.apidoc4j.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.antlr.api.ApiParser;
import io.github.flylib.apidoc4j.model.field.Api;
import io.github.flylib.apidoc4j.model.field.ApiGroup;
import io.github.flylib.apidoc4j.model.field.ApiName;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 12:14
 */
public class CustomFieldVisitor {
    public static class ApiFieldVisitor extends ApiBaseVisitor<Api> {

        @Override
        public Api visitApi(ApiParser.ApiContext ctx) {
            ObjectVisitor objectVisitor = new ObjectVisitor();
            ApiParser.MethodContext methodContext = ctx.method();
            ApiParser.PathContext pathContext = ctx.path();
            ApiParser.TitleContext titleContext = ctx.title();

            String method = (String) methodContext.accept(objectVisitor);
            String path = (String) pathContext.accept(objectVisitor);
            String title = (String) titleContext.accept(objectVisitor);

            Api api = new Api();
            api.setMethod(method);
            api.setPath(path);
            api.setTitle(title);
            return api;
        }
    }

    public static class ApiNameFieldVisitor extends ApiBaseVisitor<ApiName> {
        @Override
        public ApiName visitApiName(ApiParser.ApiNameContext ctx) {
            ApiParser.NameContext nameContext = ctx.name();
            ObjectVisitor objectVisitor = new ObjectVisitor();
            String name = (String) nameContext.accept(objectVisitor);
            ApiName apiName = new ApiName();
            apiName.setName(name);
            return apiName;
        }
    }

    public static class ApiGroupFieldVisitor extends ApiBaseVisitor<ApiGroup> {
        @Override
        public ApiGroup visitApiGroup(ApiParser.ApiGroupContext ctx) {
            ApiParser.NameContext nameContext = ctx.name();
            ObjectVisitor objectVisitor = new ObjectVisitor();
            String name = (String) nameContext.accept(objectVisitor);
            ApiGroup apiGroup = new ApiGroup();
            apiGroup.setName(name);
            return apiGroup;
        }
    }
}
