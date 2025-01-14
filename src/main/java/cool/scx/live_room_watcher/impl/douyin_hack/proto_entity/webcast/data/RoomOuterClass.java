// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/Room.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class RoomOuterClass {
  private RoomOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Room_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Room_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Room_DynamicCoverDictEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Room_DynamicCoverDictEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#douyin_hack/webcast/data/Room.proto\032(d" +
      "ouyin_hack/webcast/data/RoomExtra.proto\032" +
      "$douyin_hack/webcast/data/Image.proto\032#d" +
      "ouyin_hack/webcast/data/User.proto\032(douy" +
      "in_hack/webcast/data/StreamUrl.proto\032&do" +
      "uyin_hack/webcast/data/LinkMic.proto\032)do" +
      "uyin_hack/webcast/data/Decoration.proto\032" +
      "%douyin_hack/webcast/data/TopFan.proto\032(" +
      "douyin_hack/webcast/data/RoomStats.proto" +
      "\032+douyin_hack/webcast/data/RoomUserAttr." +
      "proto\"\222\t\n\004Room\022\n\n\002id\030\001 \001(\003\022\r\n\005idStr\030\002 \001(" +
      "\t\022\016\n\006status\030\003 \001(\003\022\023\n\013ownerUserId\030\004 \001(\003\022\r" +
      "\n\005title\030\005 \001(\t\022\021\n\tuserCount\030\006 \001(\003\022\022\n\ncrea" +
      "teTime\030\007 \001(\003\022\025\n\rlinkmicLayout\030\010 \001(\003\022\022\n\nf" +
      "inishTime\030\t \001(\003\022\031\n\005extra\030\n \001(\0132\n.RoomExt" +
      "ra\022\027\n\017dynamicCoverUri\030\013 \001(\t\0225\n\020dynamicCo" +
      "verDict\030\014 \003(\0132\033.Room.DynamicCoverDictEnt" +
      "ry\022\024\n\014lastPingTime\030\r \001(\003\022\016\n\006liveId\030\016 \001(\003" +
      "\022\026\n\016streamProvider\030\017 \001(\003\022\016\n\006osType\030\020 \001(\003" +
      "\022\025\n\rclientVersion\030\021 \001(\003\022\023\n\013withLinkmic\030\022" +
      " \001(\010\022\035\n\025enableRoomPerspective\030\023 \001(\010\022\025\n\005c" +
      "over\030\024 \001(\0132\006.Image\022\034\n\014dynamicCover\030\025 \001(\013" +
      "2\006.Image\022\037\n\017dynamicCoverLow\030\026 \001(\0132\006.Imag" +
      "e\022\020\n\010shareUrl\030\027 \001(\t\022\027\n\017anchorShareText\030\030" +
      " \001(\t\022\025\n\ruserShareText\030\031 \001(\t\022\020\n\010streamId\030" +
      "\032 \001(\003\022\023\n\013streamIdStr\030\033 \001(\t\022\035\n\tstreamUrl\030" +
      "\034 \001(\0132\n.StreamUrl\022\024\n\014mosaicStatus\030\035 \001(\003\022" +
      "\021\n\tmosaicTip\030\036 \001(\t\022\021\n\tcellStyle\030\037 \001(\003\022\031\n" +
      "\007linkMic\030  \001(\0132\010.LinkMic\022\025\n\rluckymoneyNu" +
      "m\030! \001(\003\022\035\n\010decoList\030\" \003(\0132\013.Decoration\022\030" +
      "\n\007topFans\030# \003(\0132\007.TopFan\022\031\n\005stats\030$ \001(\0132" +
      "\n.RoomStats\022\033\n\023sunDailyIconContent\030% \001(\t" +
      "\022\020\n\010distance\030& \001(\t\022\024\n\014distanceCity\030\' \001(\t" +
      "\022\020\n\010location\030( \001(\t\022\024\n\014realDistance\030) \001(\t" +
      "\022\035\n\rfeedRoomLabel\030* \001(\0132\006.Image\022\027\n\017commo" +
      "nLabelList\030+ \001(\t\022&\n\017livingRoomAttrs\030, \001(" +
      "\0132\r.RoomUserAttr\022\024\n\014adminUserIds\030- \003(\003\022\024" +
      "\n\005owner\030. \001(\0132\005.User\022\023\n\013privateInfo\030/ \001(" +
      "\t\0327\n\025DynamicCoverDictEntry\022\013\n\003key\030\001 \001(\003\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001BI\nEcool.scx.live_room" +
      "_watcher.impl.douyin_hack.proto_entity.w" +
      "ebcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomExtraOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.StreamUrlOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.LinkMicOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.DecorationOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFanOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomStatsOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomUserAttrOuterClass.getDescriptor(),
        });
    internal_static_Room_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Room_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Room_descriptor,
        new java.lang.String[] { "Id", "IdStr", "Status", "OwnerUserId", "Title", "UserCount", "CreateTime", "LinkmicLayout", "FinishTime", "Extra", "DynamicCoverUri", "DynamicCoverDict", "LastPingTime", "LiveId", "StreamProvider", "OsType", "ClientVersion", "WithLinkmic", "EnableRoomPerspective", "Cover", "DynamicCover", "DynamicCoverLow", "ShareUrl", "AnchorShareText", "UserShareText", "StreamId", "StreamIdStr", "StreamUrl", "MosaicStatus", "MosaicTip", "CellStyle", "LinkMic", "LuckymoneyNum", "DecoList", "TopFans", "Stats", "SunDailyIconContent", "Distance", "DistanceCity", "Location", "RealDistance", "FeedRoomLabel", "CommonLabelList", "LivingRoomAttrs", "AdminUserIds", "Owner", "PrivateInfo", });
    internal_static_Room_DynamicCoverDictEntry_descriptor =
      internal_static_Room_descriptor.getNestedTypes().get(0);
    internal_static_Room_DynamicCoverDictEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Room_DynamicCoverDictEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomExtraOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.StreamUrlOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.LinkMicOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.DecorationOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TopFanOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomStatsOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomUserAttrOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
