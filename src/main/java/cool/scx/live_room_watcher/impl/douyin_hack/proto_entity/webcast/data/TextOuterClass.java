// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/Text.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class TextOuterClass {
  private TextOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Text_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Text_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#douyin_hack/webcast/data/Text.proto\032)d" +
      "ouyin_hack/webcast/data/TextFormat.proto" +
      "\032(douyin_hack/webcast/data/TextPiece.pro" +
      "to\"o\n\004Text\022\013\n\003key\030\001 \001(\t\022\026\n\016defaultPatter" +
      "n\030\002 \001(\t\022\"\n\rdefaultFormat\030\003 \001(\0132\013.TextFor" +
      "mat\022\036\n\npiecesList\030\004 \003(\0132\n.TextPieceBI\nEc" +
      "ool.scx.live_room_watcher.impl.douyin_ha" +
      "ck.proto_entity.webcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextFormatOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextPieceOuterClass.getDescriptor(),
        });
    internal_static_Text_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Text_descriptor,
        new java.lang.String[] { "Key", "DefaultPattern", "DefaultFormat", "PiecesList", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextFormatOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextPieceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
