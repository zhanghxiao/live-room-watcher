package cool.scx.live_room_watcher.test;

import cool.scx.live_room_watcher.impl.kuaishou_hack.KuaiShouHackLiveRoomWatcher;
import cool.scx.util.ansi.Ansi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static cool.scx.live_room_watcher.test.DouYinHackLiveRoomWatcherTest.DEFAULT_DATETIME_FORMATTER;
import static cool.scx.live_room_watcher.test.DouYinHackLiveRoomWatcherTest.nowTimeStr;

public class KuaiShouHackLiveRoomWatcherTest {

    public static void main(String[] args) {
        tes1();
    }

    //    @Test
    public static void tes1() {
        var liveRoomWatcher = new KuaiShouHackLiveRoomWatcher("https://live.kuaishou.com/u/Ahao1124");

        liveRoomWatcher.onChat(chat -> {
            Ansi.out().brightGreen(nowTimeStr() + "[消息] ").defaultColor(chat.user().nickName() + " : ").brightWhite(chat.content()).println();
        }).onUser(user -> {
            Ansi.out().brightMagenta(nowTimeStr() + "[来了] ").defaultColor(user.nickName()).println();
        }).onLike(like -> {
            Ansi.out().brightYellow(nowTimeStr() + "[点赞] ").defaultColor(like.user().nickName() + " x " + like.count()).println();
        }).onFollow(follow -> {
            Ansi.out().brightCyan(nowTimeStr() + "[关注] ").defaultColor(follow.user().nickName()).println();
        }).onGift(gift -> {
            Ansi.out().brightBlue(nowTimeStr() + "[礼物] ").defaultColor(gift.user().nickName() + " : ").brightWhite(gift.name() + " x " + gift.count()).println();
        });

        liveRoomWatcher.startWatch();

        System.out.println("[直播流地址] " + liveRoomWatcher.liveRoomWebStreamURLs());

    }

}
