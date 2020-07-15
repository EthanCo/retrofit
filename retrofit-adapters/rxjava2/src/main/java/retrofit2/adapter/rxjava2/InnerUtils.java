package retrofit2.adapter.rxjava2;

import retrofit2.Response;

/**
 * 内部工具类
 *
 * @author Heiko
 * @date 2020/7/15 0015
 */
class InnerUtils {
    static <T> T checkRecorder(Response<T> response) {
        T body = response.body();
        if (body != null && body instanceof IRequestRecorder) {
            if (response.raw() != null && response.raw().request() != null) {
                ((IRequestRecorder) body).setRequest(response.raw().request());
            }
        }
        return body;
    }
}
