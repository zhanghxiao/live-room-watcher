// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/PublicAreaCommon.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class PublicAreaCommonOuterClass {
  private PublicAreaCommonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PublicAreaCommon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PublicAreaCommon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-douyin_hack/webcast/im/PublicAreaCommo" +
      "n.proto\032$douyin_hack/webcast/data/Image." +
      "proto\"g\n\020PublicAreaCommon\022\031\n\tuserLabel\030\001" +
      " \001(\0132\006.Image\022\031\n\021userConsumeInRoom\030\002 \001(\003\022" +
      "\035\n\025userSendGiftCntInRoom\030\003 \001(\003BG\nCcool.s" +
      "cx.live_room_watcher.impl.douyin_hack.pr" +
      "oto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
        });
    internal_static_PublicAreaCommon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PublicAreaCommon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PublicAreaCommon_descriptor,
        new java.lang.String[] { "UserLabel", "UserConsumeInRoom", "UserSendGiftCntInRoom", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
