// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/EmojiChatMessage.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface EmojiChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmojiChatMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>.User user = 2;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 2;</code>
   * @return The user.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser();
  /**
   * <code>.User user = 2;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder();

  /**
   * <code>int64 emojiId = 3;</code>
   * @return The emojiId.
   */
  long getEmojiId();

  /**
   * <code>.Text emojiContent = 4;</code>
   * @return Whether the emojiContent field is set.
   */
  boolean hasEmojiContent();
  /**
   * <code>.Text emojiContent = 4;</code>
   * @return The emojiContent.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Text getEmojiContent();
  /**
   * <code>.Text emojiContent = 4;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOrBuilder getEmojiContentOrBuilder();

  /**
   * <code>string defaultContent = 5;</code>
   * @return The defaultContent.
   */
  java.lang.String getDefaultContent();
  /**
   * <code>string defaultContent = 5;</code>
   * @return The bytes for defaultContent.
   */
  com.google.protobuf.ByteString
      getDefaultContentBytes();

  /**
   * <code>.Image backgroundImage = 6;</code>
   * @return Whether the backgroundImage field is set.
   */
  boolean hasBackgroundImage();
  /**
   * <code>.Image backgroundImage = 6;</code>
   * @return The backgroundImage.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImage();
  /**
   * <code>.Image backgroundImage = 6;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageOrBuilder();

  /**
   * <code>bool fromIntercom = 7;</code>
   * @return The fromIntercom.
   */
  boolean getFromIntercom();

  /**
   * <code>bool intercomHideUserCard = 8;</code>
   * @return The intercomHideUserCard.
   */
  boolean getIntercomHideUserCard();
}
