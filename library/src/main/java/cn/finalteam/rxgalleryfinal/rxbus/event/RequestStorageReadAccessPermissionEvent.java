package cn.finalteam.rxgalleryfinal.rxbus.event;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/7/30 下午11:23
 */
public class RequestStorageReadAccessPermissionEvent {

    private final boolean success;
    private int type;

    public RequestStorageReadAccessPermissionEvent(boolean success, int type) {
        this.success = success;
        this.type = type;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getType() {
        return type;
    }
}
