// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/GiftIMPriority.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public interface GiftIMPriorityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GiftIMPriority)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @return A list containing the queueSizes.
   */
  java.util.List<java.lang.Long> getQueueSizesList();
  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @return The count of queueSizes.
   */
  int getQueueSizesCount();
  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @param index The index of the element to return.
   * @return The queueSizes at the given index.
   */
  long getQueueSizes(int index);

  /**
   * <code>int64 selfQueuePriority = 2;</code>
   * @return The selfQueuePriority.
   */
  long getSelfQueuePriority();

  /**
   * <code>int64 priority = 3;</code>
   * @return The priority.
   */
  long getPriority();
}
