// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/HotChatMessage.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class HotChatMessageOuterClass {
  private HotChatMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HotChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HotChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+douyin_hack/webcast/im/HotChatMessage." +
      "proto\032#douyin_hack/webcast/im/Common.pro" +
      "to\"\257\001\n\016HotChatMessage\022\027\n\006common\030\001 \001(\0132\007." +
      "Common\022\r\n\005title\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022\017" +
      "\n\007numList\030\004 \003(\003\022\020\n\010duration\030\005 \001(\003\022\030\n\020sho" +
      "wDurationList\030\006 \003(\003\022\022\n\nsequenceId\030\007 \001(\003\022" +
      "\023\n\013hotListList\030\010 \003(\tBG\nCcool.scx.live_ro" +
      "om_watcher.impl.douyin_hack.proto_entity" +
      ".webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
        });
    internal_static_HotChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HotChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HotChatMessage_descriptor,
        new java.lang.String[] { "Common", "Title", "Content", "NumList", "Duration", "ShowDurationList", "SequenceId", "HotListList", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
