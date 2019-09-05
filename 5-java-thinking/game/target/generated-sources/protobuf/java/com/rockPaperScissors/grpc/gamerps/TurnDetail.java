// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameRPS.proto

package com.rockPaperScissors.grpc.gamerps;

/**
 * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.TurnDetail}
 */
public  final class TurnDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.rockPaperScissors.grpc.gamerps.TurnDetail)
    TurnDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TurnDetail.newBuilder() to construct.
  private TurnDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TurnDetail() {
    id_ = 0;
    botStep_ = 0;
    dateTimePlay_ = "";
    result_ = 0;
    userStep_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TurnDetail(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            botStep_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dateTimePlay_ = s;
            break;
          }
          case 32: {

            result_ = input.readInt32();
            break;
          }
          case 40: {

            userStep_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_TurnDetail_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_TurnDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rockPaperScissors.grpc.gamerps.TurnDetail.class, com.rockPaperScissors.grpc.gamerps.TurnDetail.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int BOTSTEP_FIELD_NUMBER = 2;
  private int botStep_;
  /**
   * <code>int32 botStep = 2;</code>
   */
  public int getBotStep() {
    return botStep_;
  }

  public static final int DATETIMEPLAY_FIELD_NUMBER = 3;
  private volatile java.lang.Object dateTimePlay_;
  /**
   * <code>string dateTimePlay = 3;</code>
   */
  public java.lang.String getDateTimePlay() {
    java.lang.Object ref = dateTimePlay_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateTimePlay_ = s;
      return s;
    }
  }
  /**
   * <code>string dateTimePlay = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDateTimePlayBytes() {
    java.lang.Object ref = dateTimePlay_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateTimePlay_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 4;
  private int result_;
  /**
   * <code>int32 result = 4;</code>
   */
  public int getResult() {
    return result_;
  }

  public static final int USERSTEP_FIELD_NUMBER = 5;
  private int userStep_;
  /**
   * <code>int32 userStep = 5;</code>
   */
  public int getUserStep() {
    return userStep_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (botStep_ != 0) {
      output.writeInt32(2, botStep_);
    }
    if (!getDateTimePlayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateTimePlay_);
    }
    if (result_ != 0) {
      output.writeInt32(4, result_);
    }
    if (userStep_ != 0) {
      output.writeInt32(5, userStep_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (botStep_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, botStep_);
    }
    if (!getDateTimePlayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateTimePlay_);
    }
    if (result_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, result_);
    }
    if (userStep_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, userStep_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rockPaperScissors.grpc.gamerps.TurnDetail)) {
      return super.equals(obj);
    }
    com.rockPaperScissors.grpc.gamerps.TurnDetail other = (com.rockPaperScissors.grpc.gamerps.TurnDetail) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getBotStep()
        == other.getBotStep());
    result = result && getDateTimePlay()
        .equals(other.getDateTimePlay());
    result = result && (getResult()
        == other.getResult());
    result = result && (getUserStep()
        == other.getUserStep());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + BOTSTEP_FIELD_NUMBER;
    hash = (53 * hash) + getBotStep();
    hash = (37 * hash) + DATETIMEPLAY_FIELD_NUMBER;
    hash = (53 * hash) + getDateTimePlay().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult();
    hash = (37 * hash) + USERSTEP_FIELD_NUMBER;
    hash = (53 * hash) + getUserStep();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.TurnDetail parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rockPaperScissors.grpc.gamerps.TurnDetail prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.TurnDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.rockPaperScissors.grpc.gamerps.TurnDetail)
      com.rockPaperScissors.grpc.gamerps.TurnDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_TurnDetail_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_TurnDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rockPaperScissors.grpc.gamerps.TurnDetail.class, com.rockPaperScissors.grpc.gamerps.TurnDetail.Builder.class);
    }

    // Construct using com.rockPaperScissors.grpc.gamerps.TurnDetail.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      botStep_ = 0;

      dateTimePlay_ = "";

      result_ = 0;

      userStep_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_TurnDetail_descriptor;
    }

    public com.rockPaperScissors.grpc.gamerps.TurnDetail getDefaultInstanceForType() {
      return com.rockPaperScissors.grpc.gamerps.TurnDetail.getDefaultInstance();
    }

    public com.rockPaperScissors.grpc.gamerps.TurnDetail build() {
      com.rockPaperScissors.grpc.gamerps.TurnDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.rockPaperScissors.grpc.gamerps.TurnDetail buildPartial() {
      com.rockPaperScissors.grpc.gamerps.TurnDetail result = new com.rockPaperScissors.grpc.gamerps.TurnDetail(this);
      result.id_ = id_;
      result.botStep_ = botStep_;
      result.dateTimePlay_ = dateTimePlay_;
      result.result_ = result_;
      result.userStep_ = userStep_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rockPaperScissors.grpc.gamerps.TurnDetail) {
        return mergeFrom((com.rockPaperScissors.grpc.gamerps.TurnDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rockPaperScissors.grpc.gamerps.TurnDetail other) {
      if (other == com.rockPaperScissors.grpc.gamerps.TurnDetail.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getBotStep() != 0) {
        setBotStep(other.getBotStep());
      }
      if (!other.getDateTimePlay().isEmpty()) {
        dateTimePlay_ = other.dateTimePlay_;
        onChanged();
      }
      if (other.getResult() != 0) {
        setResult(other.getResult());
      }
      if (other.getUserStep() != 0) {
        setUserStep(other.getUserStep());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.rockPaperScissors.grpc.gamerps.TurnDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rockPaperScissors.grpc.gamerps.TurnDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int botStep_ ;
    /**
     * <code>int32 botStep = 2;</code>
     */
    public int getBotStep() {
      return botStep_;
    }
    /**
     * <code>int32 botStep = 2;</code>
     */
    public Builder setBotStep(int value) {
      
      botStep_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 botStep = 2;</code>
     */
    public Builder clearBotStep() {
      
      botStep_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dateTimePlay_ = "";
    /**
     * <code>string dateTimePlay = 3;</code>
     */
    public java.lang.String getDateTimePlay() {
      java.lang.Object ref = dateTimePlay_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateTimePlay_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateTimePlay = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDateTimePlayBytes() {
      java.lang.Object ref = dateTimePlay_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateTimePlay_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateTimePlay = 3;</code>
     */
    public Builder setDateTimePlay(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateTimePlay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateTimePlay = 3;</code>
     */
    public Builder clearDateTimePlay() {
      
      dateTimePlay_ = getDefaultInstance().getDateTimePlay();
      onChanged();
      return this;
    }
    /**
     * <code>string dateTimePlay = 3;</code>
     */
    public Builder setDateTimePlayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateTimePlay_ = value;
      onChanged();
      return this;
    }

    private int result_ ;
    /**
     * <code>int32 result = 4;</code>
     */
    public int getResult() {
      return result_;
    }
    /**
     * <code>int32 result = 4;</code>
     */
    public Builder setResult(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 result = 4;</code>
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int userStep_ ;
    /**
     * <code>int32 userStep = 5;</code>
     */
    public int getUserStep() {
      return userStep_;
    }
    /**
     * <code>int32 userStep = 5;</code>
     */
    public Builder setUserStep(int value) {
      
      userStep_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userStep = 5;</code>
     */
    public Builder clearUserStep() {
      
      userStep_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.rockPaperScissors.grpc.gamerps.TurnDetail)
  }

  // @@protoc_insertion_point(class_scope:com.rockPaperScissors.grpc.gamerps.TurnDetail)
  private static final com.rockPaperScissors.grpc.gamerps.TurnDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rockPaperScissors.grpc.gamerps.TurnDetail();
  }

  public static com.rockPaperScissors.grpc.gamerps.TurnDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TurnDetail>
      PARSER = new com.google.protobuf.AbstractParser<TurnDetail>() {
    public TurnDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TurnDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TurnDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TurnDetail> getParserForType() {
    return PARSER;
  }

  public com.rockPaperScissors.grpc.gamerps.TurnDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
