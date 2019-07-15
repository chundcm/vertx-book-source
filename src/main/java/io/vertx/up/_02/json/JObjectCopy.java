package io.vertx.up._02.json;

import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;

public class JObjectCopy {
    public static void main(final String[] args) {
        /* 左值 */
        final JsonObject leftJson = Ut.ioJObject("data/copy/left.json");
        /* 右值 */
        final JsonObject rightJson = Ut.ioJObject("data/copy/right.json");
        /* 直接合并 */
        final JsonObject result = leftJson.mergeIn(rightJson);
        System.out.println(leftJson.encode());
        System.out.println(rightJson.encode());
        System.out.println(result.encode());
        System.out.println("-------- 分割线 --------");
        /* 分别修改左右值 */
        result.put("actor1", "Lang");
        result.put("actor3", 121);
        System.out.println(leftJson.encode());
        System.out.println(rightJson.encode());
        System.out.println(result.encode());
    }
}
