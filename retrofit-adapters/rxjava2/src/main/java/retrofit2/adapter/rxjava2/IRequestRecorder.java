package retrofit2.adapter.rxjava2;

import okhttp3.Request;

/**
 * 记录 request
 *
 * @author Heiko
 * @date 2020/7/15 0015
 */
public interface IRequestRecorder {
    void setRequest(Request request);

    Request getRequest();
}
