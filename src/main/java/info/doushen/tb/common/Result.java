package info.doushen.tb.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Result
 *
 * @author huangdou
 * @date 2019/8/24
 */
public class Result extends HashMap<String, Object> {

    public Result() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static Result error() {
        return error(1, "操作失败");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public static Result ok(String msg) {
        Result result = new Result();
        result.put("msg", msg);
        return result;
    }

    public static Result ok(Map<String, Object> map) {
        Result result = new Result();
        result.putAll(map);
        return result;
    }

    public static Result ok() {
        return new Result();
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
