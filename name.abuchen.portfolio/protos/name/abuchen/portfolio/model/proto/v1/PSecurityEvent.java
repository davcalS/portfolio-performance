// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package name.abuchen.portfolio.model.proto.v1;

/**
 * Protobuf type {@code name.abuchen.portfolio.PSecurityEvent}
 */
public final class PSecurityEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:name.abuchen.portfolio.PSecurityEvent)
    PSecurityEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PSecurityEvent.newBuilder() to construct.
  private PSecurityEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PSecurityEvent() {
    type_ = 0;
    details_ = "";
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PSecurityEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PSecurityEvent(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            date_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            details_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<name.abuchen.portfolio.model.proto.v1.PAnyValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(name.abuchen.portfolio.model.proto.v1.PAnyValue.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PSecurityEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PSecurityEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            name.abuchen.portfolio.model.proto.v1.PSecurityEvent.class, name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code name.abuchen.portfolio.PSecurityEvent.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STOCK_SPLIT = 0;</code>
     */
    STOCK_SPLIT(0),
    /**
     * <code>NOTE = 1;</code>
     */
    NOTE(1),
    /**
     * <code>DIVIDEND_PAYMENT = 2;</code>
     */
    DIVIDEND_PAYMENT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STOCK_SPLIT = 0;</code>
     */
    public static final int STOCK_SPLIT_VALUE = 0;
    /**
     * <code>NOTE = 1;</code>
     */
    public static final int NOTE_VALUE = 1;
    /**
     * <code>DIVIDEND_PAYMENT = 2;</code>
     */
    public static final int DIVIDEND_PAYMENT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return STOCK_SPLIT;
        case 1: return NOTE;
        case 2: return DIVIDEND_PAYMENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return name.abuchen.portfolio.model.proto.v1.PSecurityEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:name.abuchen.portfolio.PSecurityEvent.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type getType() {
    @SuppressWarnings("deprecation")
    name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type result = name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.valueOf(type_);
    return result == null ? name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.UNRECOGNIZED : result;
  }

  public static final int DATE_FIELD_NUMBER = 2;
  private long date_;
  /**
   * <pre>
   * epoch day
   * </pre>
   *
   * <code>int64 date = 2;</code>
   * @return The date.
   */
  @java.lang.Override
  public long getDate() {
    return date_;
  }

  public static final int DETAILS_FIELD_NUMBER = 3;
  private volatile java.lang.Object details_;
  /**
   * <code>string details = 3;</code>
   * @return The details.
   */
  @java.lang.Override
  public java.lang.String getDetails() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      details_ = s;
      return s;
    }
  }
  /**
   * <code>string details = 3;</code>
   * @return The bytes for details.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailsBytes() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      details_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private java.util.List<name.abuchen.portfolio.model.proto.v1.PAnyValue> data_;
  /**
   * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
   */
  @java.lang.Override
  public java.util.List<name.abuchen.portfolio.model.proto.v1.PAnyValue> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
   */
  @java.lang.Override
  public name.abuchen.portfolio.model.proto.v1.PAnyValue getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
   */
  @java.lang.Override
  public name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    if (type_ != name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.STOCK_SPLIT.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (date_ != 0L) {
      output.writeInt64(2, date_);
    }
    if (!getDetailsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, details_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(4, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.STOCK_SPLIT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (date_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, date_);
    }
    if (!getDetailsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, details_);
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, data_.get(i));
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
    if (!(obj instanceof name.abuchen.portfolio.model.proto.v1.PSecurityEvent)) {
      return super.equals(obj);
    }
    name.abuchen.portfolio.model.proto.v1.PSecurityEvent other = (name.abuchen.portfolio.model.proto.v1.PSecurityEvent) obj;

    if (type_ != other.type_) return false;
    if (getDate()
        != other.getDate()) return false;
    if (!getDetails()
        .equals(other.getDetails())) return false;
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDate());
    hash = (37 * hash) + DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getDetails().hashCode();
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent parseFrom(
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
  public static Builder newBuilder(name.abuchen.portfolio.model.proto.v1.PSecurityEvent prototype) {
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
   * Protobuf type {@code name.abuchen.portfolio.PSecurityEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:name.abuchen.portfolio.PSecurityEvent)
      name.abuchen.portfolio.model.proto.v1.PSecurityEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PSecurityEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PSecurityEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              name.abuchen.portfolio.model.proto.v1.PSecurityEvent.class, name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Builder.class);
    }

    // Construct using name.abuchen.portfolio.model.proto.v1.PSecurityEvent.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      date_ = 0L;

      details_ = "";

      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PSecurityEvent_descriptor;
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PSecurityEvent getDefaultInstanceForType() {
      return name.abuchen.portfolio.model.proto.v1.PSecurityEvent.getDefaultInstance();
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PSecurityEvent build() {
      name.abuchen.portfolio.model.proto.v1.PSecurityEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PSecurityEvent buildPartial() {
      name.abuchen.portfolio.model.proto.v1.PSecurityEvent result = new name.abuchen.portfolio.model.proto.v1.PSecurityEvent(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      result.date_ = date_;
      result.details_ = details_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof name.abuchen.portfolio.model.proto.v1.PSecurityEvent) {
        return mergeFrom((name.abuchen.portfolio.model.proto.v1.PSecurityEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(name.abuchen.portfolio.model.proto.v1.PSecurityEvent other) {
      if (other == name.abuchen.portfolio.model.proto.v1.PSecurityEvent.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getDate() != 0L) {
        setDate(other.getDate());
      }
      if (!other.getDetails().isEmpty()) {
        details_ = other.details_;
        onChanged();
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      name.abuchen.portfolio.model.proto.v1.PSecurityEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (name.abuchen.portfolio.model.proto.v1.PSecurityEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type getType() {
      @SuppressWarnings("deprecation")
      name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type result = name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.valueOf(type_);
      return result == null ? name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(name.abuchen.portfolio.model.proto.v1.PSecurityEvent.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.name.abuchen.portfolio.PSecurityEvent.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long date_ ;
    /**
     * <pre>
     * epoch day
     * </pre>
     *
     * <code>int64 date = 2;</code>
     * @return The date.
     */
    @java.lang.Override
    public long getDate() {
      return date_;
    }
    /**
     * <pre>
     * epoch day
     * </pre>
     *
     * <code>int64 date = 2;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(long value) {
      
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * epoch day
     * </pre>
     *
     * <code>int64 date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object details_ = "";
    /**
     * <code>string details = 3;</code>
     * @return The details.
     */
    public java.lang.String getDetails() {
      java.lang.Object ref = details_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        details_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string details = 3;</code>
     * @return The bytes for details.
     */
    public com.google.protobuf.ByteString
        getDetailsBytes() {
      java.lang.Object ref = details_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        details_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string details = 3;</code>
     * @param value The details to set.
     * @return This builder for chaining.
     */
    public Builder setDetails(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      details_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string details = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetails() {
      
      details_ = getDefaultInstance().getDetails();
      onChanged();
      return this;
    }
    /**
     * <code>string details = 3;</code>
     * @param value The bytes for details to set.
     * @return This builder for chaining.
     */
    public Builder setDetailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      details_ = value;
      onChanged();
      return this;
    }

    private java.util.List<name.abuchen.portfolio.model.proto.v1.PAnyValue> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<name.abuchen.portfolio.model.proto.v1.PAnyValue>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        name.abuchen.portfolio.model.proto.v1.PAnyValue, name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder, name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder> dataBuilder_;

    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public java.util.List<name.abuchen.portfolio.model.proto.v1.PAnyValue> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public name.abuchen.portfolio.model.proto.v1.PAnyValue getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder setData(
        int index, name.abuchen.portfolio.model.proto.v1.PAnyValue value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder setData(
        int index, name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder addData(name.abuchen.portfolio.model.proto.v1.PAnyValue value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder addData(
        int index, name.abuchen.portfolio.model.proto.v1.PAnyValue value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder addData(
        name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder addData(
        int index, name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends name.abuchen.portfolio.model.proto.v1.PAnyValue> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public java.util.List<? extends name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          name.abuchen.portfolio.model.proto.v1.PAnyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, name.abuchen.portfolio.model.proto.v1.PAnyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .name.abuchen.portfolio.PAnyValue data = 4;</code>
     */
    public java.util.List<name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        name.abuchen.portfolio.model.proto.v1.PAnyValue, name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder, name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            name.abuchen.portfolio.model.proto.v1.PAnyValue, name.abuchen.portfolio.model.proto.v1.PAnyValue.Builder, name.abuchen.portfolio.model.proto.v1.PAnyValueOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:name.abuchen.portfolio.PSecurityEvent)
  }

  // @@protoc_insertion_point(class_scope:name.abuchen.portfolio.PSecurityEvent)
  private static final name.abuchen.portfolio.model.proto.v1.PSecurityEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new name.abuchen.portfolio.model.proto.v1.PSecurityEvent();
  }

  public static name.abuchen.portfolio.model.proto.v1.PSecurityEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PSecurityEvent>
      PARSER = new com.google.protobuf.AbstractParser<PSecurityEvent>() {
    @java.lang.Override
    public PSecurityEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PSecurityEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PSecurityEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PSecurityEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public name.abuchen.portfolio.model.proto.v1.PSecurityEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
