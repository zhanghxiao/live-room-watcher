// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/HotRoomMessage.proto

// Protobuf Java Version: 3.25.2
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

/**
 * <pre>
 *更新时间 : 2023-01-11
 * </pre>
 *
 * Protobuf type {@code HotRoomMessage}
 */
public final class HotRoomMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HotRoomMessage)
    HotRoomMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotRoomMessage.newBuilder() to construct.
  private HotRoomMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotRoomMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotRoomMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOuterClass.internal_static_HotRoomMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOuterClass.internal_static_HotRoomMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.Builder.class);
  }

  private int bitField0_;
  public static final int COMMON_FIELD_NUMBER = 1;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }
  /**
   * <code>.Common common = 1;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }

  public static final int INFO_FIELD_NUMBER = 2;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo info_;
  /**
   * <code>.HotRoomInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.HotRoomInfo info = 2;</code>
   * @return The info.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo getInfo() {
    return info_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.HotRoomInfo info = 2;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.getDefaultInstance() : info_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCommon());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
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
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage prototype) {
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
   * <pre>
   *更新时间 : 2023-01-11
   * </pre>
   *
   * Protobuf type {@code HotRoomMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HotRoomMessage)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOuterClass.internal_static_HotRoomMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOuterClass.internal_static_HotRoomMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCommonFieldBuilder();
        getInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessageOuterClass.internal_static_HotRoomMessage_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
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
            case 10: {
              input.readMessage(
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> commonBuilder_;
    /**
     * <code>.Common common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Common common = 1;</code>
     * @return The common.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder mergeCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      if (common_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfoOrBuilder> infoBuilder_;
    /**
     * <code>.HotRoomInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     * @return The info.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public Builder setInfo(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public Builder setInfo(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public Builder mergeInfo(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          info_ != null &&
          info_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      if (info_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.HotRoomInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfo.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:HotRoomMessage)
  }

  // @@protoc_insertion_point(class_scope:HotRoomMessage)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotRoomMessage>
      PARSER = new com.google.protobuf.AbstractParser<HotRoomMessage>() {
    @java.lang.Override
    public HotRoomMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotRoomMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotRoomMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.HotRoomMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

