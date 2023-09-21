// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/PublicAreaCommon.proto

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

/**
 * Protobuf type {@code PublicAreaCommon}
 */
public final class PublicAreaCommon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PublicAreaCommon)
    PublicAreaCommonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicAreaCommon.newBuilder() to construct.
  private PublicAreaCommon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicAreaCommon() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicAreaCommon();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.internal_static_PublicAreaCommon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.internal_static_PublicAreaCommon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.Builder.class);
  }

  private int bitField0_;
  public static final int USERLABEL_FIELD_NUMBER = 1;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image userLabel_;
  /**
   * <code>.Image userLabel = 1;</code>
   * @return Whether the userLabel field is set.
   */
  @java.lang.Override
  public boolean hasUserLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Image userLabel = 1;</code>
   * @return The userLabel.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getUserLabel() {
    return userLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : userLabel_;
  }
  /**
   * <code>.Image userLabel = 1;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getUserLabelOrBuilder() {
    return userLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : userLabel_;
  }

  public static final int USERCONSUMEINROOM_FIELD_NUMBER = 2;
  private long userConsumeInRoom_ = 0L;
  /**
   * <code>int64 userConsumeInRoom = 2;</code>
   * @return The userConsumeInRoom.
   */
  @java.lang.Override
  public long getUserConsumeInRoom() {
    return userConsumeInRoom_;
  }

  public static final int USERSENDGIFTCNTINROOM_FIELD_NUMBER = 3;
  private long userSendGiftCntInRoom_ = 0L;
  /**
   * <code>int64 userSendGiftCntInRoom = 3;</code>
   * @return The userSendGiftCntInRoom.
   */
  @java.lang.Override
  public long getUserSendGiftCntInRoom() {
    return userSendGiftCntInRoom_;
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
      output.writeMessage(1, getUserLabel());
    }
    if (userConsumeInRoom_ != 0L) {
      output.writeInt64(2, userConsumeInRoom_);
    }
    if (userSendGiftCntInRoom_ != 0L) {
      output.writeInt64(3, userSendGiftCntInRoom_);
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
        .computeMessageSize(1, getUserLabel());
    }
    if (userConsumeInRoom_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, userConsumeInRoom_);
    }
    if (userSendGiftCntInRoom_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, userSendGiftCntInRoom_);
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
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon) obj;

    if (hasUserLabel() != other.hasUserLabel()) return false;
    if (hasUserLabel()) {
      if (!getUserLabel()
          .equals(other.getUserLabel())) return false;
    }
    if (getUserConsumeInRoom()
        != other.getUserConsumeInRoom()) return false;
    if (getUserSendGiftCntInRoom()
        != other.getUserSendGiftCntInRoom()) return false;
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
    if (hasUserLabel()) {
      hash = (37 * hash) + USERLABEL_FIELD_NUMBER;
      hash = (53 * hash) + getUserLabel().hashCode();
    }
    hash = (37 * hash) + USERCONSUMEINROOM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserConsumeInRoom());
    hash = (37 * hash) + USERSENDGIFTCNTINROOM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserSendGiftCntInRoom());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon prototype) {
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
   * Protobuf type {@code PublicAreaCommon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PublicAreaCommon)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.internal_static_PublicAreaCommon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.internal_static_PublicAreaCommon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.newBuilder()
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
        getUserLabelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userLabel_ = null;
      if (userLabelBuilder_ != null) {
        userLabelBuilder_.dispose();
        userLabelBuilder_ = null;
      }
      userConsumeInRoom_ = 0L;
      userSendGiftCntInRoom_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.internal_static_PublicAreaCommon_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userLabel_ = userLabelBuilder_ == null
            ? userLabel_
            : userLabelBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userConsumeInRoom_ = userConsumeInRoom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userSendGiftCntInRoom_ = userSendGiftCntInRoom_;
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
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon.getDefaultInstance()) return this;
      if (other.hasUserLabel()) {
        mergeUserLabel(other.getUserLabel());
      }
      if (other.getUserConsumeInRoom() != 0L) {
        setUserConsumeInRoom(other.getUserConsumeInRoom());
      }
      if (other.getUserSendGiftCntInRoom() != 0L) {
        setUserSendGiftCntInRoom(other.getUserSendGiftCntInRoom());
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
                  getUserLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              userConsumeInRoom_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              userSendGiftCntInRoom_ = input.readInt64();
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

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image userLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder> userLabelBuilder_;
    /**
     * <code>.Image userLabel = 1;</code>
     * @return Whether the userLabel field is set.
     */
    public boolean hasUserLabel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Image userLabel = 1;</code>
     * @return The userLabel.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getUserLabel() {
      if (userLabelBuilder_ == null) {
        return userLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : userLabel_;
      } else {
        return userLabelBuilder_.getMessage();
      }
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public Builder setUserLabel(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image value) {
      if (userLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userLabel_ = value;
      } else {
        userLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public Builder setUserLabel(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder builderForValue) {
      if (userLabelBuilder_ == null) {
        userLabel_ = builderForValue.build();
      } else {
        userLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public Builder mergeUserLabel(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image value) {
      if (userLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          userLabel_ != null &&
          userLabel_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance()) {
          getUserLabelBuilder().mergeFrom(value);
        } else {
          userLabel_ = value;
        }
      } else {
        userLabelBuilder_.mergeFrom(value);
      }
      if (userLabel_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public Builder clearUserLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userLabel_ = null;
      if (userLabelBuilder_ != null) {
        userLabelBuilder_.dispose();
        userLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder getUserLabelBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserLabelFieldBuilder().getBuilder();
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getUserLabelOrBuilder() {
      if (userLabelBuilder_ != null) {
        return userLabelBuilder_.getMessageOrBuilder();
      } else {
        return userLabel_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : userLabel_;
      }
    }
    /**
     * <code>.Image userLabel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder> 
        getUserLabelFieldBuilder() {
      if (userLabelBuilder_ == null) {
        userLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder>(
                getUserLabel(),
                getParentForChildren(),
                isClean());
        userLabel_ = null;
      }
      return userLabelBuilder_;
    }

    private long userConsumeInRoom_ ;
    /**
     * <code>int64 userConsumeInRoom = 2;</code>
     * @return The userConsumeInRoom.
     */
    @java.lang.Override
    public long getUserConsumeInRoom() {
      return userConsumeInRoom_;
    }
    /**
     * <code>int64 userConsumeInRoom = 2;</code>
     * @param value The userConsumeInRoom to set.
     * @return This builder for chaining.
     */
    public Builder setUserConsumeInRoom(long value) {

      userConsumeInRoom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userConsumeInRoom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserConsumeInRoom() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userConsumeInRoom_ = 0L;
      onChanged();
      return this;
    }

    private long userSendGiftCntInRoom_ ;
    /**
     * <code>int64 userSendGiftCntInRoom = 3;</code>
     * @return The userSendGiftCntInRoom.
     */
    @java.lang.Override
    public long getUserSendGiftCntInRoom() {
      return userSendGiftCntInRoom_;
    }
    /**
     * <code>int64 userSendGiftCntInRoom = 3;</code>
     * @param value The userSendGiftCntInRoom to set.
     * @return This builder for chaining.
     */
    public Builder setUserSendGiftCntInRoom(long value) {

      userSendGiftCntInRoom_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userSendGiftCntInRoom = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserSendGiftCntInRoom() {
      bitField0_ = (bitField0_ & ~0x00000004);
      userSendGiftCntInRoom_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:PublicAreaCommon)
  }

  // @@protoc_insertion_point(class_scope:PublicAreaCommon)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicAreaCommon>
      PARSER = new com.google.protobuf.AbstractParser<PublicAreaCommon>() {
    @java.lang.Override
    public PublicAreaCommon parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicAreaCommon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicAreaCommon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
