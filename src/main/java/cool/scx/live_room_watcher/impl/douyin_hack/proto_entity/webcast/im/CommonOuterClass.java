// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/Common.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class CommonOuterClass {
  private CommonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Common_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Common_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#douyin_hack/webcast/im/Common.proto\032#d" +
      "ouyin_hack/webcast/data/Text.proto\032#douy" +
      "in_hack/webcast/data/User.proto\032#douyin_" +
      "hack/webcast/data/Room.proto\"\212\004\n\006Common\022" +
      "\016\n\006method\030\001 \001(\t\022\r\n\005msgId\030\002 \001(\003\022\016\n\006roomId" +
      "\030\003 \001(\003\022\022\n\ncreateTime\030\004 \001(\003\022\017\n\007monitor\030\005 " +
      "\001(\005\022\021\n\tisShowMsg\030\006 \001(\010\022\020\n\010describe\030\007 \001(\t" +
      "\022\032\n\013displayText\030\010 \001(\0132\005.Text\022\020\n\010foldType" +
      "\030\t \001(\003\022\026\n\016anchorFoldType\030\n \001(\003\022\025\n\rpriori" +
      "tyScore\030\013 \001(\003\022\r\n\005logId\030\014 \001(\t\022\031\n\021msgProce" +
      "ssFilterK\030\r \001(\t\022\031\n\021msgProcessFilterV\030\016 \001" +
      "(\t\022\023\n\004user\030\017 \001(\0132\005.User\022\023\n\004room\030\020 \001(\0132\005." +
      "Room\022\030\n\020anchorFoldTypeV2\030\021 \001(\003\022\032\n\022proces" +
      "sAtSeiTimeMs\030\022 \001(\003\022\030\n\020randomDispatchMs\030\023" +
      " \001(\003\022\022\n\nisDispatch\030\024 \001(\010\022\021\n\tchannelId\030\025 " +
      "\001(\003\022\031\n\021diffSei2absSecond\030\026 \001(\003\022\032\n\022anchor" +
      "FoldDuration\030\027 \001(\003\022\r\n\005appId\030\030 \001(\003BG\nCcoo" +
      "l.scx.live_room_watcher.impl.douyin_hack" +
      ".proto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.getDescriptor(),
        });
    internal_static_Common_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Common_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Common_descriptor,
        new java.lang.String[] { "Method", "MsgId", "RoomId", "CreateTime", "Monitor", "IsShowMsg", "Describe", "DisplayText", "FoldType", "AnchorFoldType", "PriorityScore", "LogId", "MsgProcessFilterK", "MsgProcessFilterV", "User", "Room", "AnchorFoldTypeV2", "ProcessAtSeiTimeMs", "RandomDispatchMs", "IsDispatch", "ChannelId", "DiffSei2AbsSecond", "AnchorFoldDuration", "AppId", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
