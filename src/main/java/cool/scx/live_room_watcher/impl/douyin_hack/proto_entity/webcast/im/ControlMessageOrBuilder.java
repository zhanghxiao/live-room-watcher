// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/ControlMessage.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface ControlMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ControlMessage)
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
   * <code>int64 action = 2;</code>
   * @return The action.
   */
  long getAction();

  /**
   * <code>string tips = 3;</code>
   * @return The tips.
   */
  java.lang.String getTips();
  /**
   * <code>string tips = 3;</code>
   * @return The bytes for tips.
   */
  com.google.protobuf.ByteString
      getTipsBytes();

  /**
   * <code>.ControlMessage.Extra extra = 4;</code>
   * @return Whether the extra field is set.
   */
  boolean hasExtra();
  /**
   * <code>.ControlMessage.Extra extra = 4;</code>
   * @return The extra.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.Extra getExtra();
  /**
   * <code>.ControlMessage.Extra extra = 4;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.ExtraOrBuilder getExtraOrBuilder();
}
