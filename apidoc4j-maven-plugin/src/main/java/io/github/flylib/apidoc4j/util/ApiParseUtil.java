package io.github.flylib.apidoc4j.util;

import io.github.flylib.apidoc4j.model.field.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util.field
 * @Description:
 * @date 2017-12-28 14:12
 */
public class ApiParseUtil {
    public static Api parseApi(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "api");
        Api api = doParseApi(valueStr);
        return api;
    }

    private static Api doParseApi(String src) {
        Api api = new Api();
        if (src != null && src.length() > 0) {
            //提取{}括起来的数据类型
            Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
            Matcher matcher = pattern.matcher(src);
            String type = "";
            if (matcher.find()) {
                type = matcher.group(1);
            }
            String fieldText = src.replace("{" + type + "}", "").trim();
            System.out.println(fieldText);

            api.setMethod(type);
            String[] tmp = fieldText.split("\\s");
            if (tmp.length > 1) {
                api.setPath(tmp[0]);
                api.setTitle(tmp[1]);
            }
        } else {
            api = null;
        }
        return api;
    }

    public static ApiDefine parseApiDefine(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiDefine");
        ApiDefine apiDefine = doParseApiDefine(valueStr);
        return apiDefine;
    }

    private static ApiDefine doParseApiDefine(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiDefine apiDefine = new ApiDefine();
        if (valueStr != null && valueStr.length() > 0) {
            String[] tmp = valueStr.split("\\s");

            if (tmp.length > 0) {
                apiDefine.setName(tmp[0]);
            }
            if (tmp.length > 1) {
                apiDefine.setTitle(tmp[1]);
                apiDefine.setDescription(tmp[2]);
            }


        }
        return apiDefine;
    }

    public static ApiDeprecated parseApiDeprecated(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiDeprecated");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiDeprecated apiDeprecated = new ApiDeprecated();
        apiDeprecated.setText(valueStr);
        return apiDeprecated;
    }

    public static ApiDescription parseApiDescription(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiDescription");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiDescription apiDescription = new ApiDescription();
        apiDescription.setText(valueStr);
        return apiDescription;
    }

    public static List<ApiErrorExample> parseApiErrorExample(final String commentStr) {
        List<ApiErrorExample> apiErrorExampleList = new ArrayList<ApiErrorExample>();
        if (commentStr == null || commentStr.trim().length() < 1) {
            return null;
        }
        String regex1 = "@apiErrorExample" + "\\s([\\s\\S])*?@api";
        String regex2 = "@apiErrorExample" + "\\s([\\s\\S])*?\\*/";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        while (matcher1.find()) {
            String text = matcher1.group();
            if (text != null && text.length() > 0) {
                text = text.replace("@apiErrorExample" + " ", " ");
                text = text.replace("@api", "");
                text = text.replace("\\*/", "");
                text = text.replace("\n*", "");
            }
            ApiErrorExample apiErrorExample = doParseApiErrorExample(text);
            apiErrorExampleList.add(apiErrorExample);
        }

        return apiErrorExampleList;
    }

    private static ApiErrorExample doParseApiErrorExample(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiErrorExample apiErrorExample = new ApiErrorExample();

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String type = "";
        if (matcher.find()) {
            type = matcher.group(1);
            apiErrorExample.setType(type);
            valueStr = valueStr.replace("{" + type + "}", "").trim();
        }
//        example.setExample(valueStr);
        String[] tmp = valueStr.split("\\s");
        if (tmp.length > 1) {
            String title = tmp[0];
            apiErrorExample.setTitle(title);
            int index = valueStr.indexOf('\n');
            String example = valueStr.substring(index + 1);
            apiErrorExample.setExample(example);
        }
        return apiErrorExample;
    }

    public static ApiError parseApiError(final String commentStr) {
        ApiError apiError = new ApiError();

        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiError");
        apiError = doParseApiError(valueStr);
        return apiError;
    }

    private static ApiError doParseApiError(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiError apiError = new ApiError();
        // 提取[]括起来的部分
//        Pattern pattern1 = Pattern.compile("\\[([\\s\\S]*?)\\]");
        Pattern pattern1 = Pattern.compile("\\(([\\s\\S]*?)\\)");
        Matcher matcher1 = pattern1.matcher(valueStr);
        if (matcher1.find()) {
            String group = matcher1.group(1);
            apiError.setGroup(group);
            valueStr = valueStr.replace("(" + group + ")", "").trim();
        }


        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String type = "";
        if (matcher.find()) {
            type = matcher.group(1);
            apiError.setType(type);

            valueStr = valueStr.replace("{" + type + "}", "").trim();
        }

        String[] tmp = valueStr.split("\\s");
        if (tmp.length > 1) {
            String field = tmp[0];
            apiError.setField(field);
            String description = valueStr.replace(field + " ", "").trim();
            apiError.setDescription(description);
        }
        return apiError;
    }

    public static ApiExample parseApiExample(String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiExample");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiExample apiExample = doParseApiExample(valueStr);
        return apiExample;
    }

    private static ApiExample doParseApiExample(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiExample apiExample = new ApiExample();

//提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String type = "";
        if (matcher.find()) {
            type = matcher.group(1);
            apiExample.setType(type);
            valueStr = valueStr.replace("{" + type + "}", "").trim();
        }
//        example.setExample(valueStr);
        String[] tmp = valueStr.split("\\s");
        if (tmp.length > 1) {
            String title = tmp[0];
            apiExample.setTitle(title);
            int index = valueStr.indexOf('\n');
            String example = valueStr.substring(index + 1);
            apiExample.setExample(example);
        }
        return apiExample;
    }

    public static ApiGroup parseApiGroup(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiGroup");
        ApiGroup apiGroup = doParseApiGroup(valueStr);
        return apiGroup;
    }

    private static ApiGroup doParseApiGroup(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiGroup apiGroup = new ApiGroup();
        apiGroup.setName(valueStr);
        return apiGroup;
    }

    public static ApiHeader parseApiHeader(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiHeader");
        ApiHeader apiHeader = doParseApiHeader(valueStr);
        return apiHeader;
    }

    private static ApiHeader doParseApiHeader(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiHeader apiHeader = new ApiHeader();

        //提取()括起来的数据类型
        Pattern pattern1 = Pattern.compile("\\(([\\s\\S]*?)\\)");
        Matcher matcher1 = pattern1.matcher(valueStr);
        if (matcher1.find()) {
            String group = matcher1.group(1);
            apiHeader.setGroup(group);
            valueStr = valueStr.replace("(" + group + ")", "").trim();
        }

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String type = "";
        if (matcher.find()) {
            type = matcher.group(1);
            apiHeader.setType(type);
            valueStr = valueStr.replace("{" + type + "}", "").trim();
        }

        String[] tmp = valueStr.split("\\s");
        if (tmp.length > 1) {
            String field = tmp[0];
            apiHeader.setField(field);
//            int index = valueStr.indexOf('\n');
//            String description = valueStr.substring(index + 1);
            String description = valueStr.replaceFirst(field, "").trim();
            apiHeader.setDescription(description);
        }
        return apiHeader;
    }

    public static ApiHeaderExample parseApiHeaderExample(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiHeaderExample");
        ApiHeaderExample apiHeaderExample = doParseApiHeaderExample(valueStr);
        return apiHeaderExample;
    }

    private static ApiHeaderExample doParseApiHeaderExample(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiHeaderExample apiHeaderExample = new ApiHeaderExample();

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String type = "";
        if (matcher.find()) {
            type = matcher.group(1);
            apiHeaderExample.setType(type);
            valueStr = valueStr.replace("{" + type + "}", "").trim();
        }

        String[] tmp = valueStr.split("\\s");
        if (tmp.length > 1) {
            String title = tmp[0];
            apiHeaderExample.setTitle(title);
            String example = valueStr.replaceFirst(title, "").trim();
            apiHeaderExample.setExample(example);
        }
        return apiHeaderExample;
    }

    public static ApiIgnore parseApiIgnore(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiIgnore");
        ApiIgnore apiIgnore = doParseApiIgnore(valueStr);
        return apiIgnore;
    }

    private static ApiIgnore doParseApiIgnore(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiIgnore apiIgnore = new ApiIgnore();
        apiIgnore.setHint(valueStr);
        return apiIgnore;
    }

    public static ApiName parseApiName(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiName");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiName apiName = new ApiName();
        apiName.setName(valueStr);
        return apiName;
    }

    public static List<ApiParam> parseApiParam(final String commentStr) {
        List<ApiParam> paramList = new ArrayList<ApiParam>();

        String regex1 = "@apiParam" + "\\s([\\s\\S])*?@api";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        int matchCount = 0;
        while (matcher1.find()) {
            matchCount++;
            String paramStr = matcher1.group();

            // TODO 需要判断下，如果最后一行注释是apiParam的处理
            if (paramStr != null && paramStr.length() > 0) {
                paramStr = paramStr.replace("@apiParam" + " ", " ");
                paramStr = paramStr.replace("@api", "");
                paramStr = paramStr.replace("\\*/", "");
            }
            ApiParam apiParam = doParseApiParam(paramStr);
            paramList.add(apiParam);
        }

        return paramList;
    }

    private static ApiParam doParseApiParam(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiParam apiParam = new ApiParam();

        valueStr = valueStr.replace("*", "");
        valueStr = valueStr.trim();

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String parameterType = "";
        if (matcher.find()) {
            parameterType = matcher.group(1);
        }
        String parameterText = valueStr.replace("{" + parameterType + "}", "").trim();

        apiParam.setType(parameterType);
        String[] tmp = parameterText.split("\\s");
        if (tmp.length > 1) {
            apiParam.setField(tmp[0]);
            apiParam.setDescription(tmp[1]);
            // TODO setGroup
            apiParam.setGroup(null);
        }
        return apiParam;
    }

    public static List<ApiParamExample> parseApiParamExample(final String commentStr) {
        List<ApiParamExample> paramExampleList = new ArrayList<ApiParamExample>();

        String regex1 = "@apiParamExample" + "\\s([\\s\\S])*?@api";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        String fieldName = "apiParamExample";
        while (matcher1.find()) {
            String paramStr = matcher1.group();

            // TODO 需要判断下，如果最后一行注释是apiParam的处理

            if (paramStr != null && paramStr.length() > 0) {
                paramStr = paramStr.replace("@" + fieldName, " ");
                paramStr = paramStr.replace("@api", "");
                paramStr = paramStr.replace("\\*/", "");
            }
            ApiParamExample apiParamExample = doParseApiParamExample(paramStr);
            paramExampleList.add(apiParamExample);
        }

        return paramExampleList;
    }

    private static ApiParamExample doParseApiParamExample(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiParamExample apiParam = new ApiParamExample();

        valueStr = valueStr.replace("*", "");
        valueStr = valueStr.trim();

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(valueStr);
        String parameterType = "";
        if (matcher.find()) {
            parameterType = matcher.group(1);
        }
        String parameterText = valueStr.replace("{" + parameterType + "}", "").trim();

        apiParam.setType(parameterType);
        String[] tmp = parameterText.split("\\n");
        if (tmp.length > 1) {
            String title = tmp[0];
            if (title != null && title.length() > 0) {
                apiParam.setTitle(title);
                String example = parameterText.replace(title + "\n", "").trim();
                apiParam.setExample(example);
            }

        }
        return apiParam;
    }

    public static ApiPermission parseApiPermission(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiPermission");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }
        ApiPermission apiPermission = new ApiPermission();
        apiPermission.setName(valueStr);
        return apiPermission;
    }

    public static ApiPrivate parseApiPrivate(final String commentStr) {
        if (commentStr == null || commentStr.trim().length() < 1) {
            return null;
        }

        ApiPrivate apiPrivate = new ApiPrivate();
        String text = null;

        String regex1 = "@" + "apiPrivate" + "\\s([\\s\\S])*?\\n";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);
        if (matcher1.find()) {
            text = matcher1.group();
            apiPrivate.setPrivateValue(true);

        } else {
            apiPrivate.setPrivateValue(false);
        }

        return apiPrivate;
    }

    public static ApiSampleRequest parseApiSampleRequest(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiSampleRequest");
        ApiSampleRequest apiSampleRequest = new ApiSampleRequest();
        apiSampleRequest.setUrl(valueStr);
        return apiSampleRequest;
    }

    public static List<ApiSuccess> parseApiSuccess(final String commentStr) {
        List<ApiSuccess> successList = new ArrayList<ApiSuccess>();

        String regex1 = "@apiSuccess" + "\\s([\\s\\S])*?\\n";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        while (matcher1.find()) {
            String paramStr = matcher1.group();

            // TODO 需要判断下，如果最后一行注释是apiParam的处理
            if (StringUtils.isNotBlank(paramStr)) {
                paramStr = paramStr.replace("@apiSuccess" + " ", "");
                ApiSuccess apiSuccess= doParseApiSuccess(paramStr);
                successList.add(apiSuccess);
            }
        }

        return successList;
    }

    private static ApiSuccess doParseApiSuccess(String valueStr) {
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiSuccess apiSuccess = new ApiSuccess();

        valueStr = valueStr.replace("*", "");
        valueStr = valueStr.trim();

        //提取()括起来的部分
        Pattern pattern1 = Pattern.compile("\\(([\\s\\S]*?)\\)");
        Matcher matcher1 = pattern1.matcher(valueStr);
        String tmpStr = valueStr;
        if (matcher1.find()) {
            String group = matcher1.group(1);
            if (group != null && group.length() > 0) {
                tmpStr = tmpStr.replace("(" + group + ")", "").trim();
                apiSuccess.setGroup(group);
            }
        }

        //提取{}括起来的数据类型
        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Matcher matcher = pattern.matcher(tmpStr);
        String parameterType = "";
        if (matcher.find()) {
            String type = matcher.group(1);
            if (StringUtils.isNotBlank(type)) {
                tmpStr = tmpStr.replace("{" + type + "}", "").trim();
                apiSuccess.setType(type);
            }
        }

        String[] tmp = tmpStr.split("\\s");
        if (tmp.length > 1) {
            String field = tmp[0];
            if (StringUtils.isNotBlank(field)) {
                int index = tmpStr.indexOf(" ");
                String description = tmpStr.substring(index + 1);
                apiSuccess.setDescription(description);
            }

        }
        return apiSuccess;
    }

    public static List<ApiSuccessExample> parseApiSuccessExample(final String commentStr){
        List<ApiSuccessExample> apiSuccessExampleList = new ArrayList<ApiSuccessExample>();

        String regex1 = "@apiSuccessExample" + "\\s([\\s\\S])*?@api";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        while (matcher1.find()) {
            String paramStr = matcher1.group();

            // TODO 需要判断下，如果最后一行注释是apiParam的处理
            if (paramStr != null && paramStr.length() > 0) {
                paramStr = paramStr.replace("@apiSuccessExample" + " ", " ");
                paramStr = paramStr.replace("@api", "");
                paramStr = paramStr.replace("\\*/", "");
            }
            ApiSuccessExample apiSuccessExample = doParseApiSuccessExample(paramStr);
            apiSuccessExampleList.add(apiSuccessExample);
        }

        return apiSuccessExampleList;
    }

    private static ApiSuccessExample doParseApiSuccessExample(String valueStr){
        String tmpStr = new String(valueStr);
        ApiSuccessExample apiSuccessExample=new ApiSuccessExample();
        if (StringUtils.isBlank(tmpStr)) {
            return null;
        }

        tmpStr = tmpStr.replace("*", "").trim();

        //提取{}括起来的数据类型
//        Pattern pattern = Pattern.compile("\\{([\\s\\S]*?)\\}");
        Pattern pattern = Pattern.compile("\\{\\b((?!\\s)\\w)+\\}");
        Matcher matcher = pattern.matcher(tmpStr);
        if (matcher.find()) {
            String typeStr = matcher.group();
            String type = typeStr.replace("{", "").replace("}", "");
            apiSuccessExample.setType(type);
            tmpStr = tmpStr.replace("{" + type + "}", "").trim();
        }

        // title and example
        String[] tmp = tmpStr.split("\\n");
        if (tmp.length > 1) {
            String title = tmp[0];
            if (StringUtils.isNotBlank(title)) {
                apiSuccessExample.setTitle(title);
                int index = tmpStr.indexOf('\n');
                String example = tmpStr.substring(index + 1);
                if (StringUtils.isNotBlank(example)) {
                    apiSuccessExample.setExample(example);
                }
            }
        }

        return apiSuccessExample;
    }

    public static ApiUse parseApiUse(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiUse");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiUse apiUse = new ApiUse();
        apiUse.setName(valueStr);
        return apiUse;
    }

    public static ApiVersion parseApiVersion(final String commentStr) {
        String valueStr = ParseFieldUtil.parseNormalField(commentStr, "apiVersion");
        if (valueStr == null || valueStr.length() == 0) {
            return null;
        }

        ApiVersion apiVersion = new ApiVersion();
        apiVersion.setVersion(valueStr);
        return apiVersion;
    }
}
