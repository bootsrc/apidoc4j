package io.github.flylib.apidoc4j.antlr.api.custom;

import io.github.flylib.apidoc4j.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.model.ApiDoc;
import io.github.flylib.apidoc4j.model.field.Api;
import io.github.flylib.apidoc4j.model.field.ApiGroup;
import io.github.flylib.apidoc4j.model.field.ApiName;
import io.github.flylib.apidoc4j.antlr.api.ApiParser;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 13:12
 */
public class ApidocVisitor extends ApiBaseVisitor<ApiDoc> {
    @Override
    public ApiDoc visitApidoc(ApiParser.ApidocContext ctx) {
        ApiDoc apiDoc = new ApiDoc();
        setApi(ctx, apiDoc);
        setApiName(ctx, apiDoc);
        setApiGroup(ctx, apiDoc);
        return apiDoc;
    }

    private void setApi(ApiParser.ApidocContext ctx, ApiDoc apiDoc) {
        CustomFieldVisitor.ApiFieldVisitor apiFieldVisitor = new CustomFieldVisitor.ApiFieldVisitor();
        Collection<Api> apiFieldList = ctx.api().stream()
                .map(fieldConxt -> fieldConxt.accept(apiFieldVisitor))
                .collect(Collectors.toList());

        Iterator<Api> apiIterator = apiFieldList.iterator();
        if (apiIterator.hasNext()) {
            Api api = apiIterator.next();
            apiDoc.setApi(api);
        }
    }

    private void setApiName(ApiParser.ApidocContext ctx, ApiDoc apiDoc) {
        CustomFieldVisitor.ApiNameFieldVisitor apiNameFieldVisitor = new CustomFieldVisitor.ApiNameFieldVisitor();
        Collection<ApiName> apiNameCollection = ctx.apiName().stream()
                .map(fieldConxt -> fieldConxt.accept(apiNameFieldVisitor))
                .collect(Collectors.toList());

        Iterator<ApiName> apiNameIterator = apiNameCollection.iterator();
        if (apiNameIterator.hasNext()) {
            ApiName apiName= apiNameIterator.next();
            apiDoc.setApiName(apiName);
        }
    }

    private void setApiGroup(ApiParser.ApidocContext ctx, ApiDoc apiDoc) {
        CustomFieldVisitor.ApiGroupFieldVisitor apiGroupFieldVisitor = new CustomFieldVisitor.ApiGroupFieldVisitor();
        Collection<ApiGroup> apiGroupCollection = ctx.apiGroup().stream()
                .map(fieldConxt -> fieldConxt.accept(apiGroupFieldVisitor))
                .collect(Collectors.toList());

        Iterator<ApiGroup> apiGroupIterator = apiGroupCollection.iterator();
        if (apiGroupIterator.hasNext()) {
            ApiGroup apiGroup= apiGroupIterator.next();
            apiDoc.setApiGroup(apiGroup);
        }
    }
}
