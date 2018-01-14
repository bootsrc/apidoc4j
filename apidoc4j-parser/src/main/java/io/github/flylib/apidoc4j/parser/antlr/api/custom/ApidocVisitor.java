package io.github.flylib.apidoc4j.parser.antlr.api.custom;

import io.github.flylib.apidoc4j.parser.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.parser.model.ApiDoc;
import io.github.flylib.apidoc4j.parser.antlr.api.ApiParser;
import io.github.flylib.apidoc4j.parser.model.field.Api;
import io.github.flylib.apidoc4j.parser.model.field.ApiName;
import io.github.flylib.apidoc4j.parser.model.field.ApiParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 13:12
 */
public class ApidocVisitor extends ApiBaseVisitor<ApiDoc> {
    @Override
    public ApiDoc visitApidoc(ApiParser.ApidocContext ctx) {
        ApiDoc apiDoc = new ApiDoc();
        setFields(ctx, apiDoc);
        return apiDoc;
    }

    private void setFields(ApiParser.ApidocContext ctx, ApiDoc apiDoc) {
        List<ApiParser.FieldExprContext> exprContextList= ctx.fieldExpr();
        //
        CustomFieldVisitor.FieldApiNameVisitor  fieldApiNameVisitor = new CustomFieldVisitor.FieldApiNameVisitor();
        CustomFieldVisitor.FieldApiParamVisitor fieldApiParamVisitor = new CustomFieldVisitor.FieldApiParamVisitor();
        CustomFieldVisitor.FieldApiVisitor fieldApiVisitor = new CustomFieldVisitor.FieldApiVisitor();
//        ctx.fieldExpr().get(1).fieldString().fieldApiName()
        if (exprContextList != null && exprContextList.size()>0) {
            for (ApiParser.FieldExprContext fieldExprContext : exprContextList) {
                ApiParser.FieldStringContext strContext =fieldExprContext.fieldString();
                if (strContext != null){
                    setApiName(apiDoc, strContext, fieldApiNameVisitor);
                    setApiParam(apiDoc, strContext, fieldApiParamVisitor);
                    setApi(apiDoc, strContext, fieldApiVisitor);
                }

            }
        }

    }

    private void setApi(ApiDoc apiDoc, ApiParser.FieldStringContext strContext, CustomFieldVisitor.FieldApiVisitor fieldApiVisitor) {
        ApiParser.FieldApiContext fieldApiContext=strContext.fieldApi();
        if (apiDoc.getApi() == null && fieldApiContext != null ) {
            Api api = fieldApiContext.accept(fieldApiVisitor);
            apiDoc.setApi(api);
        }
    }

    private void setApiName(ApiDoc apiDoc, ApiParser.FieldStringContext strContext, CustomFieldVisitor.FieldApiNameVisitor apiNameFieldVisitor) {
        ApiParser.FieldApiNameContext apiNameContext=strContext.fieldApiName();
        if (apiDoc.getApiName() == null && apiNameContext != null ) {
            ApiName apiName = apiNameContext.accept(apiNameFieldVisitor);
            apiDoc.setApiName(apiName);
        }
    }

    private void setApiParam(ApiDoc apiDoc, ApiParser.FieldStringContext strContext, CustomFieldVisitor.FieldApiParamVisitor apiParamFieldVisitor) {
        ApiParser.FieldApiParamContext fieldApiParamContext = strContext.fieldApiParam();
        if (fieldApiParamContext != null) {
            ApiParam apiParam = fieldApiParamContext.accept(apiParamFieldVisitor);
            if (apiDoc.getApiParam() == null) {
                apiDoc.setApiParam(new ArrayList<ApiParam>());
            }
            if (apiParam != null) {
                apiDoc.getApiParam().add(apiParam);
            }

        }
    }
}
