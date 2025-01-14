package cool.scx.live_room_watcher;

import cool.scx.live_room_watcher.util.Helper;

import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * 官方的被动接受的接口
 */
public abstract class OfficialLiveRoomWatcher extends BaseLiveRoomWatcher {

    protected String accessToken;

    protected abstract AccessToken getAccessToken0() throws IOException, InterruptedException;

    public abstract LiveRoomInfo liveInfo(String tokenOrRoomID) throws IOException, InterruptedException;

    /**
     * 推送失败数据获取
     *
     * @param roomID   房间号
     * @param msgType  消息类型
     * @param pageNum  分页
     * @param pageSize 分页
     * @return a
     * @throws IOException          a
     * @throws InterruptedException a
     */
    public abstract Object failDataGet(String roomID, MsgType msgType, Integer pageNum, Integer pageSize) throws IOException, InterruptedException;

    public abstract Object topGift(String roomCode, String[] secGiftIDList) throws IOException, InterruptedException;

    /**
     * 获取 accessToken
     *
     * @return a
     */
    public synchronized String getAccessToken() {
        if (this.accessToken == null) {
            refreshAccessToken();
        }
        return this.accessToken;
    }

    /**
     * 刷新 accessToken
     * 首次调用后 会一直循环进行获取 所以理论上讲只需要获取一次
     */
    public synchronized void refreshAccessToken() {
        try {
            var accessToken0 = getAccessToken0();
            this.accessToken = accessToken0.accessToken();
            Helper.scheduler.schedule(this::refreshAccessToken, accessToken0.expiresIn() / 2, SECONDS);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            //发生错误的话 2秒后重试
            Helper.scheduler.schedule(this::refreshAccessToken, 2000, SECONDS);
        }
    }

    @Override
    public void startWatch() {
        throw new UnsupportedOperationException("请使用 startWatch(String roomID) !!!");
    }

    @Override
    public void stopWatch() {
        throw new UnsupportedOperationException("请使用 stopWatch(String roomID) !!!");
    }

    public abstract void startWatch(String roomID) throws IOException, InterruptedException;

    public abstract void stopWatch(String roomID) throws IOException, InterruptedException;

}
