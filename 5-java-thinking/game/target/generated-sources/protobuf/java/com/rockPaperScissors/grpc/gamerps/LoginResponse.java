// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameRPS.proto

package com.rockPaperScissors.grpc.gamerps;

/**
 * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.LoginResponse}
 */
public  final class LoginResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.rockPaperScissors.grpc.gamerps.LoginResponse)
    LoginResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginResponse.newBuilder() to construct.
  private LoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginResponse() {
    status_ = 0;
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginResponse(
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

            status_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder subBuilder = null;
            if (token_ != null) {
              subBuilder = token_.toBuilder();
            }
            token_ = input.readMessage(com.rockPaperScissors.grpc.gamerps.TokenMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(token_);
              token_ = subBuilder.buildPartial();
            }

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
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_LoginResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_LoginResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rockPaperScissors.grpc.gamerps.LoginResponse.class, com.rockPaperScissors.grpc.gamerps.LoginResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 3;
  private com.rockPaperScissors.grpc.gamerps.TokenMessage token_;
  /**
   * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
   */
  public boolean hasToken() {
    return token_ != null;
  }
  /**
   * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
   */
  public com.rockPaperScissors.grpc.gamerps.TokenMessage getToken() {
    return token_ == null ? com.rockPaperScissors.grpc.gamerps.TokenMessage.getDefaultInstance() : token_;
  }
  /**
   * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
   */
  public com.rockPaperScissors.grpc.gamerps.TokenMessageOrBuilder getTokenOrBuilder() {
    return getToken();
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
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (token_ != null) {
      output.writeMessage(3, getToken());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (token_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToken());
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
    if (!(obj instanceof com.rockPaperScissors.grpc.gamerps.LoginResponse)) {
      return super.equals(obj);
    }
    com.rockPaperScissors.grpc.gamerps.LoginResponse other = (com.rockPaperScissors.grpc.gamerps.LoginResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (hasToken() == other.hasToken());
    if (hasToken()) {
      result = result && getToken()
          .equals(other.getToken());
    }
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasToken()) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rockPaperScissors.grpc.gamerps.LoginResponse parseFrom(
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
  public static Builder newBuilder(com.rockPaperScissors.grpc.gamerps.LoginResponse prototype) {
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
   * Protobuf type {@code com.rockPaperScissors.grpc.gamerps.LoginResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.rockPaperScissors.grpc.gamerps.LoginResponse)
      com.rockPaperScissors.grpc.gamerps.LoginResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_LoginResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_LoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rockPaperScissors.grpc.gamerps.LoginResponse.class, com.rockPaperScissors.grpc.gamerps.LoginResponse.Builder.class);
    }

    // Construct using com.rockPaperScissors.grpc.gamerps.LoginResponse.newBuilder()
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
      status_ = 0;

      message_ = "";

      if (tokenBuilder_ == null) {
        token_ = null;
      } else {
        token_ = null;
        tokenBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rockPaperScissors.grpc.gamerps.GameRPSOuterClass.internal_static_com_rockPaperScissors_grpc_gamerps_LoginResponse_descriptor;
    }

    public com.rockPaperScissors.grpc.gamerps.LoginResponse getDefaultInstanceForType() {
      return com.rockPaperScissors.grpc.gamerps.LoginResponse.getDefaultInstance();
    }

    public com.rockPaperScissors.grpc.gamerps.LoginResponse build() {
      com.rockPaperScissors.grpc.gamerps.LoginResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.rockPaperScissors.grpc.gamerps.LoginResponse buildPartial() {
      com.rockPaperScissors.grpc.gamerps.LoginResponse result = new com.rockPaperScissors.grpc.gamerps.LoginResponse(this);
      result.status_ = status_;
      result.message_ = message_;
      if (tokenBuilder_ == null) {
        result.token_ = token_;
      } else {
        result.token_ = tokenBuilder_.build();
      }
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
      if (other instanceof com.rockPaperScissors.grpc.gamerps.LoginResponse) {
        return mergeFrom((com.rockPaperScissors.grpc.gamerps.LoginResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rockPaperScissors.grpc.gamerps.LoginResponse other) {
      if (other == com.rockPaperScissors.grpc.gamerps.LoginResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasToken()) {
        mergeToken(other.getToken());
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
      com.rockPaperScissors.grpc.gamerps.LoginResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rockPaperScissors.grpc.gamerps.LoginResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private com.rockPaperScissors.grpc.gamerps.TokenMessage token_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rockPaperScissors.grpc.gamerps.TokenMessage, com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder, com.rockPaperScissors.grpc.gamerps.TokenMessageOrBuilder> tokenBuilder_;
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public boolean hasToken() {
      return tokenBuilder_ != null || token_ != null;
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public com.rockPaperScissors.grpc.gamerps.TokenMessage getToken() {
      if (tokenBuilder_ == null) {
        return token_ == null ? com.rockPaperScissors.grpc.gamerps.TokenMessage.getDefaultInstance() : token_;
      } else {
        return tokenBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public Builder setToken(com.rockPaperScissors.grpc.gamerps.TokenMessage value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token_ = value;
        onChanged();
      } else {
        tokenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public Builder setToken(
        com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        token_ = builderForValue.build();
        onChanged();
      } else {
        tokenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public Builder mergeToken(com.rockPaperScissors.grpc.gamerps.TokenMessage value) {
      if (tokenBuilder_ == null) {
        if (token_ != null) {
          token_ =
            com.rockPaperScissors.grpc.gamerps.TokenMessage.newBuilder(token_).mergeFrom(value).buildPartial();
        } else {
          token_ = value;
        }
        onChanged();
      } else {
        tokenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public Builder clearToken() {
      if (tokenBuilder_ == null) {
        token_ = null;
        onChanged();
      } else {
        token_ = null;
        tokenBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder getTokenBuilder() {
      
      onChanged();
      return getTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    public com.rockPaperScissors.grpc.gamerps.TokenMessageOrBuilder getTokenOrBuilder() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilder();
      } else {
        return token_ == null ?
            com.rockPaperScissors.grpc.gamerps.TokenMessage.getDefaultInstance() : token_;
      }
    }
    /**
     * <code>.com.rockPaperScissors.grpc.gamerps.TokenMessage token = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rockPaperScissors.grpc.gamerps.TokenMessage, com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder, com.rockPaperScissors.grpc.gamerps.TokenMessageOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rockPaperScissors.grpc.gamerps.TokenMessage, com.rockPaperScissors.grpc.gamerps.TokenMessage.Builder, com.rockPaperScissors.grpc.gamerps.TokenMessageOrBuilder>(
                getToken(),
                getParentForChildren(),
                isClean());
        token_ = null;
      }
      return tokenBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.rockPaperScissors.grpc.gamerps.LoginResponse)
  }

  // @@protoc_insertion_point(class_scope:com.rockPaperScissors.grpc.gamerps.LoginResponse)
  private static final com.rockPaperScissors.grpc.gamerps.LoginResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rockPaperScissors.grpc.gamerps.LoginResponse();
  }

  public static com.rockPaperScissors.grpc.gamerps.LoginResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginResponse>
      PARSER = new com.google.protobuf.AbstractParser<LoginResponse>() {
    public LoginResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginResponse> getParserForType() {
    return PARSER;
  }

  public com.rockPaperScissors.grpc.gamerps.LoginResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

