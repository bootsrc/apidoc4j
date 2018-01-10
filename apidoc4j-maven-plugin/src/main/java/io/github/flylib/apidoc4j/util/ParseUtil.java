package io.github.flylib.apidoc4j.util;

import io.github.flylib.apidoc4j.model.ApiDoc;
import io.github.flylib.apidoc4j.model.field.*;

import java.util.ArrayList;
import java.util.List;

public class ParseUtil {
    public static ApiDoc parseApiDoc(final String commentStr) {
        ApiDoc apiDoc = new ApiDoc();

        Api api = ApiParseUtil.parseApi(commentStr);
        if (api == null) {
            return null;
        }
        apiDoc.setApi(api);

        ApiDefine apiDefine = ApiParseUtil.parseApiDefine(commentStr);
        apiDoc.setApiDefine(apiDefine);

        ApiDeprecated apiDeprecated = ApiParseUtil.parseApiDeprecated(commentStr);
        apiDoc.setApiDeprecated(apiDeprecated);

        ApiDescription apiDescription= ApiParseUtil.parseApiDescription(commentStr);
        apiDoc.setApiDescription(apiDescription);

        ApiError apiError =ApiParseUtil.parseApiError(commentStr);
        apiDoc.setApiError(apiError);

        List<ApiErrorExample> apiErrorExampleList = ApiParseUtil.parseApiErrorExample(commentStr);
        apiDoc.setApiErrorExample(apiErrorExampleList);

        ApiExample apiExample = ApiParseUtil.parseApiExample(commentStr);
        apiDoc.setApiExample(apiExample);

        ApiGroup apiGroup =ApiParseUtil.parseApiGroup(commentStr);
        apiDoc.setApiGroup(apiGroup);

        ApiHeader apiHeader = ApiParseUtil.parseApiHeader(commentStr);
        apiDoc.setApiHeader(apiHeader);

        ApiHeaderExample apiHeaderExample=ApiParseUtil.parseApiHeaderExample(commentStr);
        apiDoc.setApiHeaderExample(apiHeaderExample);

        ApiIgnore apiIgnore=ApiParseUtil.parseApiIgnore(commentStr);
        apiDoc.setApiIgnore(apiIgnore);

        ApiName apiName = ApiParseUtil.parseApiName(commentStr);
        apiDoc.setApiName(apiName);

        List<ApiParam> apiParamList = ApiParseUtil.parseApiParam(commentStr);
        apiDoc.setApiParam(apiParamList);

        List<ApiParamExample> apiParamExampleList= ApiParseUtil.parseApiParamExample(commentStr);
        apiDoc.setApiParamExample(apiParamExampleList);

        List<ApiSuccess> apiSuccessList=ApiParseUtil.parseApiSuccess(commentStr);
        apiDoc.setApiSuccess(apiSuccessList);

        ApiPermission apiPermission=ApiParseUtil.parseApiPermission(commentStr);
        apiDoc.setApiPermission(apiPermission);

        ApiPrivate apiPrivate=ApiParseUtil.parseApiPrivate(commentStr);
        apiDoc.setApiPrivate(apiPrivate);

        ApiSampleRequest apiSampleRequest=ApiParseUtil.parseApiSampleRequest(commentStr);
        apiDoc.setApiSampleRequest(apiSampleRequest);

        List<ApiSuccessExample> apiSuccessExampleList=ApiParseUtil.parseApiSuccessExample(commentStr);
        apiDoc.setApiSuccessExample(apiSuccessExampleList);

        ApiUse apiUse=ApiParseUtil.parseApiUse(commentStr);
        apiDoc.setApiUse(apiUse);

        ApiVersion apiVersion=ApiParseUtil.parseApiVersion(commentStr);
        apiDoc.setApiVersion(apiVersion);

        return apiDoc;
    }

    public static List<ApiDoc> parse(List<String> commentStrList) {
        List<ApiDoc> result = new ArrayList<ApiDoc>();
        if (commentStrList != null && commentStrList.size() > 0) {
            for (String comment : commentStrList) {
                ApiDoc apiDoc = parseApiDoc(comment);
                if (apiDoc != null && apiDoc.getApi() != null && apiDoc.getApi().getPath() != null) {
                    result.add(apiDoc);
                }
            }
        }

        return result;
    }

//    private static Object parseField(String commentStr, String fieldName) {
//        Object result = null;
//        if ("apiParam".equals(fieldName)) {
//            result = parseApiParamField(commentStr);
//        } else {
//            result = parseNormalField(commentStr, fieldName);
//        }
//        return result;
//    }
//

//    public static List<DocComment> parseList(List<String> commentStrList) {
//        List<DocComment> result = new ArrayList<DocComment>();
//        if (commentStrList != null && commentStrList.size() > 0) {
//            for (String comment : commentStrList) {
//                Map<String, Object> fieldMap = new HashMap<String, Object>();
//                for (Map.Entry<String, Field> entry : DocCommentClassUtil.getCachedFields().entrySet()) {
//                    String fieldName = entry.getKey();
//                    Object fieldValue = parseField(comment, fieldName);
//                    if (fieldValue != null) {
//                        fieldMap.put(fieldName, fieldValue);
//                    }
//                }
//
//                try {
//                    if (fieldMap.size() > 0) {
//                        result.add(DocCommentFactory.newObject(fieldMap));
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return result;
//    }
}
