// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/GiftIMPriority.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class GiftIMPriorityOuterClass {
  private GiftIMPriorityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GiftIMPriority_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GiftIMPriority_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-douyin_hack/webcast/data/GiftIMPriorit" +
      "y.proto\"Q\n\016GiftIMPriority\022\022\n\nqueueSizes\030" +
      "\001 \003(\003\022\031\n\021selfQueuePriority\030\002 \001(\003\022\020\n\010prio" +
      "rity\030\003 \001(\003BI\nEcool.scx.live_room_watcher" +
      ".impl.douyin_hack.proto_entity.webcast.d" +
      "ataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GiftIMPriority_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GiftIMPriority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GiftIMPriority_descriptor,
        new java.lang.String[] { "QueueSizes", "SelfQueuePriority", "Priority", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
