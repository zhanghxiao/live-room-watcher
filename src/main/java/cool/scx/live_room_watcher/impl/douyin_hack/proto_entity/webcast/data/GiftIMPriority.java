// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/GiftIMPriority.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

/**
 * Protobuf type {@code GiftIMPriority}
 */
public final class GiftIMPriority extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GiftIMPriority)
    GiftIMPriorityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GiftIMPriority.newBuilder() to construct.
  private GiftIMPriority(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GiftIMPriority() {
    queueSizes_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GiftIMPriority();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOuterClass.internal_static_GiftIMPriority_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.Builder.class);
  }

  public static final int QUEUESIZES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList queueSizes_ =
      emptyLongList();
  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @return A list containing the queueSizes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getQueueSizesList() {
    return queueSizes_;
  }
  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @return The count of queueSizes.
   */
  public int getQueueSizesCount() {
    return queueSizes_.size();
  }
  /**
   * <code>repeated int64 queueSizes = 1;</code>
   * @param index The index of the element to return.
   * @return The queueSizes at the given index.
   */
  public long getQueueSizes(int index) {
    return queueSizes_.getLong(index);
  }
  private int queueSizesMemoizedSerializedSize = -1;

  public static final int SELFQUEUEPRIORITY_FIELD_NUMBER = 2;
  private long selfQueuePriority_ = 0L;
  /**
   * <code>int64 selfQueuePriority = 2;</code>
   * @return The selfQueuePriority.
   */
  @java.lang.Override
  public long getSelfQueuePriority() {
    return selfQueuePriority_;
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private long priority_ = 0L;
  /**
   * <code>int64 priority = 3;</code>
   * @return The priority.
   */
  @java.lang.Override
  public long getPriority() {
    return priority_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getQueueSizesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(queueSizesMemoizedSerializedSize);
    }
    for (int i = 0; i < queueSizes_.size(); i++) {
      output.writeInt64NoTag(queueSizes_.getLong(i));
    }
    if (selfQueuePriority_ != 0L) {
      output.writeInt64(2, selfQueuePriority_);
    }
    if (priority_ != 0L) {
      output.writeInt64(3, priority_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < queueSizes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(queueSizes_.getLong(i));
      }
      size += dataSize;
      if (!getQueueSizesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      queueSizesMemoizedSerializedSize = dataSize;
    }
    if (selfQueuePriority_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, selfQueuePriority_);
    }
    if (priority_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, priority_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority) obj;

    if (!getQueueSizesList()
        .equals(other.getQueueSizesList())) return false;
    if (getSelfQueuePriority()
        != other.getSelfQueuePriority()) return false;
    if (getPriority()
        != other.getPriority()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getQueueSizesCount() > 0) {
      hash = (37 * hash) + QUEUESIZES_FIELD_NUMBER;
      hash = (53 * hash) + getQueueSizesList().hashCode();
    }
    hash = (37 * hash) + SELFQUEUEPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSelfQueuePriority());
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPriority());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GiftIMPriority}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GiftIMPriority)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOuterClass.internal_static_GiftIMPriority_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      queueSizes_ = emptyLongList();
      selfQueuePriority_ = 0L;
      priority_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        queueSizes_.makeImmutable();
        result.queueSizes_ = queueSizes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.selfQueuePriority_ = selfQueuePriority_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.priority_ = priority_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority.getDefaultInstance()) return this;
      if (!other.queueSizes_.isEmpty()) {
        if (queueSizes_.isEmpty()) {
          queueSizes_ = other.queueSizes_;
          queueSizes_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureQueueSizesIsMutable();
          queueSizes_.addAll(other.queueSizes_);
        }
        onChanged();
      }
      if (other.getSelfQueuePriority() != 0L) {
        setSelfQueuePriority(other.getSelfQueuePriority());
      }
      if (other.getPriority() != 0L) {
        setPriority(other.getPriority());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              long v = input.readInt64();
              ensureQueueSizesIsMutable();
              queueSizes_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureQueueSizesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                queueSizes_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              selfQueuePriority_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              priority_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList queueSizes_ = emptyLongList();
    private void ensureQueueSizesIsMutable() {
      if (!queueSizes_.isModifiable()) {
        queueSizes_ = makeMutableCopy(queueSizes_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @return A list containing the queueSizes.
     */
    public java.util.List<java.lang.Long>
        getQueueSizesList() {
      queueSizes_.makeImmutable();
      return queueSizes_;
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @return The count of queueSizes.
     */
    public int getQueueSizesCount() {
      return queueSizes_.size();
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @param index The index of the element to return.
     * @return The queueSizes at the given index.
     */
    public long getQueueSizes(int index) {
      return queueSizes_.getLong(index);
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @param index The index to set the value at.
     * @param value The queueSizes to set.
     * @return This builder for chaining.
     */
    public Builder setQueueSizes(
        int index, long value) {

      ensureQueueSizesIsMutable();
      queueSizes_.setLong(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @param value The queueSizes to add.
     * @return This builder for chaining.
     */
    public Builder addQueueSizes(long value) {

      ensureQueueSizesIsMutable();
      queueSizes_.addLong(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @param values The queueSizes to add.
     * @return This builder for chaining.
     */
    public Builder addAllQueueSizes(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureQueueSizesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, queueSizes_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 queueSizes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueueSizes() {
      queueSizes_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long selfQueuePriority_ ;
    /**
     * <code>int64 selfQueuePriority = 2;</code>
     * @return The selfQueuePriority.
     */
    @java.lang.Override
    public long getSelfQueuePriority() {
      return selfQueuePriority_;
    }
    /**
     * <code>int64 selfQueuePriority = 2;</code>
     * @param value The selfQueuePriority to set.
     * @return This builder for chaining.
     */
    public Builder setSelfQueuePriority(long value) {

      selfQueuePriority_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 selfQueuePriority = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSelfQueuePriority() {
      bitField0_ = (bitField0_ & ~0x00000002);
      selfQueuePriority_ = 0L;
      onChanged();
      return this;
    }

    private long priority_ ;
    /**
     * <code>int64 priority = 3;</code>
     * @return The priority.
     */
    @java.lang.Override
    public long getPriority() {
      return priority_;
    }
    /**
     * <code>int64 priority = 3;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(long value) {

      priority_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 priority = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000004);
      priority_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GiftIMPriority)
  }

  // @@protoc_insertion_point(class_scope:GiftIMPriority)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GiftIMPriority>
      PARSER = new com.google.protobuf.AbstractParser<GiftIMPriority>() {
    @java.lang.Override
    public GiftIMPriority parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GiftIMPriority> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GiftIMPriority> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftIMPriority getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

