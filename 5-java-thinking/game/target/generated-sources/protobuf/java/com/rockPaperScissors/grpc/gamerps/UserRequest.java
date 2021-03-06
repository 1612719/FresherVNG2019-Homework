// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameRPS.proto

package com.rockPaperScissors.grpc.gamerps;

/**
 * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.UserRequest}
 */
public  final class UserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.rockPaperScissors.grpc.gamerps.UserRequest)
    UserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRequest.newBuilder() to construct.
  private UserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRequest() {
    userName_ = "";
    userPassword_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userPassword_ = s;
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
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_UserRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_UserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rockPaperScissors.grpc.gamerps.UserRequest.class, com.rockPaperScissors.grpc.gamerps.UserRequest.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 1;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERPASSWORD_FIELD_NUMBER = 2;
  private volatile java.lang.Object userPassword_;
  /**
   * <code>string userPassword = 2;</code>
   */
  public java.lang.String getUserPassword() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string userPassword = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserPasswordBytes() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userPassword_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userPassword_);
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
    if (!(obj instanceof com.rockPaperScissors.grpc.gamerps.UserRequest)) {
      return super.equals(obj);
    }
    com.rockPaperScissors.grpc.gamerps.UserRequest other = (com.rockPaperScissors.grpc.gamerps.UserRequest) obj;

    boolean result = true;
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getUserPassword()
        .equals(other.getUserPassword());
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + USERPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getUserPassword().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.UserRequest parseFrom(
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
  public static Builder newBuilder(com.rockPaperScissors.grpc.gamerps.UserRequest prototype) {
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
   * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.UserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.rockPaperScissors.grpc.gamerps.UserRequest)
      com.rockPaperScissors.grpc.gamerps.UserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_UserRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_UserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rockPaperScissors.grpc.gamerps.UserRequest.class, com.rockPaperScissors.grpc.gamerps.UserRequest.Builder.class);
    }

    // Construct using com.rockPaperScissors.grpc.gamerps.UserRequest.newBuilder()
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
      userName_ = "";

      userPassword_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_UserRequest_descriptor;
    }

    public com.rockPaperScissors.grpc.gamerps.UserRequest getDefaultInstanceForType() {
      return com.rockPaperScissors.grpc.gamerps.UserRequest.getDefaultInstance();
    }

    public com.rockPaperScissors.grpc.gamerps.UserRequest build() {
      com.rockPaperScissors.grpc.gamerps.UserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.rockPaperScissors.grpc.gamerps.UserRequest buildPartial() {
      com.rockPaperScissors.grpc.gamerps.UserRequest result = new com.rockPaperScissors.grpc.gamerps.UserRequest(this);
      result.userName_ = userName_;
      result.userPassword_ = userPassword_;
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
      if (other instanceof com.rockPaperScissors.grpc.gamerps.UserRequest) {
        return mergeFrom((com.rockPaperScissors.grpc.gamerps.UserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rockPaperScissors.grpc.gamerps.UserRequest other) {
      if (other == com.rockPaperScissors.grpc.gamerps.UserRequest.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getUserPassword().isEmpty()) {
        userPassword_ = other.userPassword_;
        onChanged();
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
      com.rockPaperScissors.grpc.gamerps.UserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rockPaperScissors.grpc.gamerps.UserRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 1;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userPassword_ = "";
    /**
     * <code>string userPassword = 2;</code>
     */
    public java.lang.String getUserPassword() {
      java.lang.Object ref = userPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userPassword = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserPasswordBytes() {
      java.lang.Object ref = userPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userPassword = 2;</code>
     */
    public Builder setUserPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 2;</code>
     */
    public Builder clearUserPassword() {
      
      userPassword_ = getDefaultInstance().getUserPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 2;</code>
     */
    public Builder setUserPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userPassword_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.rockPaperScissors.grpc.gamerps.UserRequest)
  }

  // @@protoc_insertion_point(class_scope:com.rockPaperScissors.grpc.gamerps.UserRequest)
  private static final com.rockPaperScissors.grpc.gamerps.UserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rockPaperScissors.grpc.gamerps.UserRequest();
  }

  public static com.rockPaperScissors.grpc.gamerps.UserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRequest>
      PARSER = new com.google.protobuf.AbstractParser<UserRequest>() {
    public UserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRequest> getParserForType() {
    return PARSER;
  }

  public com.rockPaperScissors.grpc.gamerps.UserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

