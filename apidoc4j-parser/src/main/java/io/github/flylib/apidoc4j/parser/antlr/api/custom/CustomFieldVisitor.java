package io.github.flylib.apidoc4j.parser.antlr.api.custom;

import io.github.flylib.apidoc4j.parser.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.parser.antlr.api.ApiParser;
import io.github.flylib.apidoc4j.parser.model.field.Api;
import io.github.flylib.apidoc4j.parser.model.field.ApiName;
import io.github.flylib.apidoc4j.parser.model.field.ApiParam;
import io.github.flylib.apidoc4j.parser.model.field.ApiSuccess;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 12:14
 */
public class CustomFieldVisitor {
    public static class FieldApiVisitor extends ApiBaseVisitor<Api> {

        @Override
        public Api visitFieldApi(ApiParser.FieldApiContext ctx) {
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

    public static class FieldApiNameVisitor extends ApiBaseVisitor<ApiName> {
        @Override
        public ApiName visitFieldApiName(ApiParser.FieldApiNameContext ctx) {
            ApiParser.NameContext nameContext = ctx.name();
            ObjectVisitor objectVisitor = new ObjectVisitor();
            String name = (String) nameContext.accept(objectVisitor);
            ApiName apiName = new ApiName();
            apiName.setName(name);
            return apiName;
        }
    }

//    public static class GroupApiFieldVisitor extends ApiBaseVisitor<ApiGroup> {
//        @Override
//        public ApiGroup visitFieldApiGroup(ApiParser. ctx) {
//            ApiParser.NameContext nameContext = ctx.name();
//            ObjectVisitor objectVisitor = new ObjectVisitor();
//            String name = (String) nameContext.accept(objectVisitor);
//            ApiGroup apiGroup = new ApiGroup();
//            apiGroup.setName(name);
//            return apiGroup;
//        }
//    }

//    public static class ApiDescriptionFieldVisitor extends ApiBaseVisitor<ApiDescription> {
//        @Override
//        public ApiDescription visitApiDescription(ApiParser.ApiDescriptionContext ctx) {
//            ApiParser.TextContext textContext = ctx.text();
//            ObjectVisitor objectVisitor = new ObjectVisitor();
//            String text = (String) textContext.accept(objectVisitor);
//            ApiDescription apiDescription = new ApiDescription();
//            apiDescription.setText(text);
//            return apiDescription;
//        }
//    }

    public static class FieldApiParamVisitor extends ApiBaseVisitor<ApiParam> {
        @Override
        public ApiParam visitFieldApiParam(ApiParser.FieldApiParamContext ctx) {
            ApiParam apiParam=new ApiParam();

            ApiParser.TypeContext typeContext = ctx.type();
            ApiParser.FieldContext fieldContext = ctx.field();
            ApiParser.DescriptionContext descriptionContext= ctx.description();

            ObjectVisitor objectVisitor = new ObjectVisitor();
            String type = (String) typeContext.accept(objectVisitor);
            String field = (String) fieldContext.accept(objectVisitor);
            String description = (String) descriptionContext.accept(objectVisitor);

            if (StringUtils.isNotEmpty(type)) {
                apiParam.setType(type);
            }
            if (StringUtils.isNotEmpty(field)) {
                apiParam.setField(field);
            }
            if (StringUtils.isNotEmpty(description)) {
                apiParam.setDescription(description);
            }

            return apiParam;
        }
    }

    public static class FieldApiSuccessVisitor extends ApiBaseVisitor<ApiSuccess> {

        @Override
        public ApiSuccess visitFieldApiSuccess(ApiParser.FieldApiSuccessContext ctx) {
            ApiSuccess apiSuccess = new ApiSuccess();

            ApiParser.TypeContext typeContext = ctx.type();
            ApiParser.FieldContext fieldContext = ctx.field();
            ApiParser.DescriptionContext descriptionContext= ctx.description();

            ObjectVisitor objectVisitor = new ObjectVisitor();
            String type = (String) typeContext.accept(objectVisitor);
            String field = (String) fieldContext.accept(objectVisitor);
            String description = (String) descriptionContext.accept(objectVisitor);

            if (StringUtils.isNotEmpty(type)) {
                apiSuccess.setType(type);
            }
            if (StringUtils.isNotEmpty(field)) {
                apiSuccess.setField(field);
            }
            if (StringUtils.isNotEmpty(description)) {
                apiSuccess.setDescription(description);
            }
            return apiSuccess;
        }
    }
}
