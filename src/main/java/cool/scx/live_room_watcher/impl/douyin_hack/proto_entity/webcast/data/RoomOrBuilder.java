// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/Room.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public interface RoomOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Room)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string idStr = 2;</code>
   * @return The idStr.
   */
  java.lang.String getIdStr();
  /**
   * <code>string idStr = 2;</code>
   * @return The bytes for idStr.
   */
  com.google.protobuf.ByteString
      getIdStrBytes();

  /**
   * <code>int64 status = 3;</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <code>int64 ownerUserId = 4;</code>
   * @return The ownerUserId.
   */
  long getOwnerUserId();

  /**
   * <code>string title = 5;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 5;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>int64 userCount = 6;</code>
   * @return The userCount.
   */
  long getUserCount();

  /**
   * <code>int64 createTime = 7;</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <code>int64 linkmicLayout = 8;</code>
   * @return The linkmicLayout.
   */
  long getLinkmicLayout();

  /**
   * <code>int64 finishTime = 9;</code>
   * @return The finishTime.
   */
  long getFinishTime();

  /**
   * <code>.RoomExtra extra = 10;</code>
   * @return Whether the extra field is set.
   */
  boolean hasExtra();
  /**
   * <code>.RoomExtra extra = 10;</code>
   * @return The extra.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomExtra getExtra();
  /**
   * <code>.RoomExtra extra = 10;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomExtraOrBuilder getExtraOrBuilder();

  /**
   * <code>string dynamicCoverUri = 11;</code>
   * @return The dynamicCoverUri.
   */
  java.lang.String getDynamicCoverUri();
  /**
   * <code>string dynamicCoverUri = 11;</code>
   * @return The bytes for dynamicCoverUri.
   */
  com.google.protobuf.ByteString
      getDynamicCoverUriBytes();

  /**
   * <code>map&lt;int64, string&gt; dynamicCoverDict = 12;</code>
   */
  int getDynamicCoverDictCount();
  /**
   * <code>map&lt;int64, string&gt; dynamicCoverDict = 12;</code>
   */
  boolean containsDynamicCoverDict(
      long key);
  /**
   * Use {@link #getDynamicCoverDictMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.String>
  getDynamicCoverDict();
  /**
   * <code>map&lt;int64, string&gt; dynamicCoverDict = 12;</code>
   */
  java.util.Map<java.lang.Long, java.lang.String>
  getDynamicCoverDictMap();
  /**
   * <code>map&lt;int64, string&gt; dynamicCoverDict = 12;</code>
   */
  /* nullable */
java.lang.String getDynamicCoverDictOrDefault(
      long key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;int64, string&gt; dynamicCoverDict = 12;</code>
   */
  java.lang.String getDynamicCoverDictOrThrow(
      long key);

  /**
   * <code>int64 lastPingTime = 13;</code>
   * @return The lastPingTime.
   */
  long getLastPingTime();

  /**
   * <code>int64 liveId = 14;</code>
   * @return The liveId.
   */
  long getLiveId();

  /**
   * <code>int64 streamProvider = 15;</code>
   * @return The streamProvider.
   */
  long getStreamProvider();

  /**
   * <code>int64 osType = 16;</code>
   * @return The osType.
   */
  long getOsType();

  /**
   * <code>int64 clientVersion = 17;</code>
   * @return The clientVersion.
   */
  long getClientVersion();

  /**
   * <code>bool withLinkmic = 18;</code>
   * @return The withLinkmic.
   */
  boolean getWithLinkmic();

  /**
   * <code>bool enableRoomPerspective = 19;</code>
   * @return The enableRoomPerspective.
   */
  boolean getEnableRoomPerspective();

  /**
   * <code>.Image cover = 20;</code>
   * @return Whether the cover field is set.
   */
  boolean hasCover();
  /**
   * <code>.Image cover = 20;</code>
   * @return The cover.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getCover();
  /**
   * <code>.Image cover = 20;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getCoverOrBuilder();

  /**
   * <code>.Image dynamicCover = 21;</code>
   * @return Whether the dynamicCover field is set.
   */
  boolean hasDynamicCover();
  /**
   * <code>.Image dynamicCover = 21;</code>
   * @return The dynamicCover.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getDynamicCover();
  /**
   * <code>.Image dynamicCover = 21;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getDynamicCoverOrBuilder();

  /**
   * <code>.Image dynamicCoverLow = 22;</code>
   * @return Whether the dynamicCoverLow field is set.
   */
  boolean hasDynamicCoverLow();
  /**
   * <code>.Image dynamicCoverLow = 22;</code>
   * @return The dynamicCoverLow.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getDynamicCoverLow();
  /**
   * <code>.Image dynamicCoverLow = 22;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getDynamicCoverLowOrBuilder();

  /**
   * <code>string shareUrl = 23;</code>
   * @return The shareUrl.
   */
  java.lang.String getShareUrl();
  /**
   * <code>string shareUrl = 23;</code>
   * @return The bytes for shareUrl.
   */
  com.google.protobuf.ByteString
      getShareUrlBytes();

  /**
   * <code>string anchorShareText = 24;</code>
   * @return The anchorShareText.
   */
  java.lang.String getAnchorShareText();
  /**
   * <code>string anchorShareText = 24;</code>
   * @return The bytes for anchorShareText.
   */
  com.google.protobuf.ByteString
      getAnchorShareTextBytes();

  /**
   * <code>string userShareText = 25;</code>
   * @return The userShareText.
   */
  java.lang.String getUserShareText();
  /**
   * <code>string userShareText = 25;</code>
   * @return The bytes for userShareText.
   */
  com.google.protobuf.ByteString
      getUserShareTextBytes();

  /**
   * <code>int64 streamId = 26;</code>
   * @return The streamId.
   */
  long getStreamId();

  /**
   * <code>string streamIdStr = 27;</code>
   * @return The streamIdStr.
   */
  java.lang.String getStreamIdStr();
  /**
   * <code>string streamIdStr = 27;</code>
   * @return The bytes for streamIdStr.
   */
  com.google.protobuf.ByteString
      getStreamIdStrBytes();

  /**
   * <code>.StreamUrl streamUrl = 28;</code>
   * @return Whether the streamUrl field is set.
   */
  boolean hasStreamUrl();
  /**
   * <code>.StreamUrl streamUrl = 28;</code>
   * @return The streamUrl.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.StreamUrl getStreamUrl();
  /**
   * <code>.StreamUrl streamUrl = 28;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.StreamUrlOrBuilder getStreamUrlOrBuilder();

  /**
   * <code>int64 mosaicStatus = 29;</code>
   * @return The mosaicStatus.
   */
  long getMosaicStatus();

  /**
   * <code>string mosaicTip = 30;</code>
   * @return The mosaicTip.
   */
  java.lang.String getMosaicTip();
  /**
   * <code>string mosaicTip = 30;</code>
   * @return The bytes for mosaicTip.
   */
  com.google.protobuf.ByteString
      getMosaicTipBytes();

  /**
   * <code>int64 cellStyle = 31;</code>
   * @return The cellStyle.
   */
  long getCellStyle();

  /**
   * <code>.LinkMic linkMic = 32;</code>
   * @return Whether the linkMic field is set.
   */
  boolean hasLinkMic();
  /**
   * <code>.LinkMic linkMic = 32;</code>
   * @return The linkMic.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.LinkMic getLinkMic();
  /**
   * <code>.LinkMic linkMic = 32;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.LinkMicOrBuilder getLinkMicOrBuilder();

  /**
   * <code>int64 luckymoneyNum = 33;</code>
   * @return The luckymoneyNum.
   */
  long getLuckymoneyNum();

  /**
   * <code>repeated .Decoration decoList = 34;</code>
   */
  java.util.List<cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Decoration> 
      getDecoListList();
  /**
   * <code>repeated .Decoration decoList = 34;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Decoration getDecoList(int index);
  /**
   * <code>repeated .Decoration decoList = 34;</code>
   */
  int getDecoListCount();
  /**
   * <code>repeated .Decoration decoList = 34;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.DecorationOrBuilder> 
      getDecoListOrBuilderList();
  /**
   * <code>repeated .Decoration decoList = 34;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.DecorationOrBuilder getDecoListOrBuilder(
      int index);

  /**
   * <code>repeated .TopFan topFans = 35;</code>
   */
  java.util.List<cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFan> 
      getTopFansList();
  /**
   * <code>repeated .TopFan topFans = 35;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFan getTopFans(int index);
  /**
   * <code>repeated .TopFan topFans = 35;</code>
   */
  int getTopFansCount();
  /**
   * <code>repeated .TopFan topFans = 35;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFanOrBuilder> 
      getTopFansOrBuilderList();
  /**
   * <code>repeated .TopFan topFans = 35;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFanOrBuilder getTopFansOrBuilder(
      int index);

  /**
   * <code>.RoomStats stats = 36;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.RoomStats stats = 36;</code>
   * @return The stats.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomStats getStats();
  /**
   * <code>.RoomStats stats = 36;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomStatsOrBuilder getStatsOrBuilder();

  /**
   * <code>string sunDailyIconContent = 37;</code>
   * @return The sunDailyIconContent.
   */
  java.lang.String getSunDailyIconContent();
  /**
   * <code>string sunDailyIconContent = 37;</code>
   * @return The bytes for sunDailyIconContent.
   */
  com.google.protobuf.ByteString
      getSunDailyIconContentBytes();

  /**
   * <code>string distance = 38;</code>
   * @return The distance.
   */
  java.lang.String getDistance();
  /**
   * <code>string distance = 38;</code>
   * @return The bytes for distance.
   */
  com.google.protobuf.ByteString
      getDistanceBytes();

  /**
   * <code>string distanceCity = 39;</code>
   * @return The distanceCity.
   */
  java.lang.String getDistanceCity();
  /**
   * <code>string distanceCity = 39;</code>
   * @return The bytes for distanceCity.
   */
  com.google.protobuf.ByteString
      getDistanceCityBytes();

  /**
   * <code>string location = 40;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 40;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string realDistance = 41;</code>
   * @return The realDistance.
   */
  java.lang.String getRealDistance();
  /**
   * <code>string realDistance = 41;</code>
   * @return The bytes for realDistance.
   */
  com.google.protobuf.ByteString
      getRealDistanceBytes();

  /**
   * <code>.Image feedRoomLabel = 42;</code>
   * @return Whether the feedRoomLabel field is set.
   */
  boolean hasFeedRoomLabel();
  /**
   * <code>.Image feedRoomLabel = 42;</code>
   * @return The feedRoomLabel.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getFeedRoomLabel();
  /**
   * <code>.Image feedRoomLabel = 42;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getFeedRoomLabelOrBuilder();

  /**
   * <code>string commonLabelList = 43;</code>
   * @return The commonLabelList.
   */
  java.lang.String getCommonLabelList();
  /**
   * <code>string commonLabelList = 43;</code>
   * @return The bytes for commonLabelList.
   */
  com.google.protobuf.ByteString
      getCommonLabelListBytes();

  /**
   * <code>.RoomUserAttr livingRoomAttrs = 44;</code>
   * @return Whether the livingRoomAttrs field is set.
   */
  boolean hasLivingRoomAttrs();
  /**
   * <code>.RoomUserAttr livingRoomAttrs = 44;</code>
   * @return The livingRoomAttrs.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomUserAttr getLivingRoomAttrs();
  /**
   * <code>.RoomUserAttr livingRoomAttrs = 44;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomUserAttrOrBuilder getLivingRoomAttrsOrBuilder();

  /**
   * <code>repeated int64 adminUserIds = 45;</code>
   * @return A list containing the adminUserIds.
   */
  java.util.List<java.lang.Long> getAdminUserIdsList();
  /**
   * <code>repeated int64 adminUserIds = 45;</code>
   * @return The count of adminUserIds.
   */
  int getAdminUserIdsCount();
  /**
   * <code>repeated int64 adminUserIds = 45;</code>
   * @param index The index of the element to return.
   * @return The adminUserIds at the given index.
   */
  long getAdminUserIds(int index);

  /**
   * <code>.User owner = 46;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.User owner = 46;</code>
   * @return The owner.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getOwner();
  /**
   * <code>.User owner = 46;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getOwnerOrBuilder();

  /**
   * <code>string privateInfo = 47;</code>
   * @return The privateInfo.
   */
  java.lang.String getPrivateInfo();
  /**
   * <code>string privateInfo = 47;</code>
   * @return The bytes for privateInfo.
   */
  com.google.protobuf.ByteString
      getPrivateInfoBytes();
}
