// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestProcedure.proto

package org.apache.hadoop.hbase.ipc.protobuf.generated;

public final class TestProcedureProtos {
  private TestProcedureProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TestTableDDLStateDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string table_name = 1;
    /**
     * <code>required string table_name = 1;</code>
     */
    boolean hasTableName();
    /**
     * <code>required string table_name = 1;</code>
     */
    java.lang.String getTableName();
    /**
     * <code>required string table_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getTableNameBytes();
  }
  /**
   * Protobuf type {@code TestTableDDLStateData}
   */
  public static final class TestTableDDLStateData extends
      com.google.protobuf.GeneratedMessage
      implements TestTableDDLStateDataOrBuilder {
    // Use TestTableDDLStateData.newBuilder() to construct.
    private TestTableDDLStateData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TestTableDDLStateData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TestTableDDLStateData defaultInstance;
    public static TestTableDDLStateData getDefaultInstance() {
      return defaultInstance;
    }

    public TestTableDDLStateData getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TestTableDDLStateData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              tableName_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.class, org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.Builder.class);
    }

    public static com.google.protobuf.Parser<TestTableDDLStateData> PARSER =
        new com.google.protobuf.AbstractParser<TestTableDDLStateData>() {
      public TestTableDDLStateData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestTableDDLStateData(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TestTableDDLStateData> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string table_name = 1;
    public static final int TABLE_NAME_FIELD_NUMBER = 1;
    private java.lang.Object tableName_;
    /**
     * <code>required string table_name = 1;</code>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string table_name = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string table_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      tableName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTableName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTableNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTableNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestTableDDLStateData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.class, org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        tableName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.internal_static_TestTableDDLStateData_descriptor;
      }

      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData build() {
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData buildPartial() {
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData result = new org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tableName_ = tableName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData) {
          return mergeFrom((org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData other) {
        if (other == org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData.getDefaultInstance()) return this;
        if (other.hasTableName()) {
          bitField0_ |= 0x00000001;
          tableName_ = other.tableName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTableName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.ipc.protobuf.generated.TestProcedureProtos.TestTableDDLStateData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string table_name = 1;
      private java.lang.Object tableName_ = "";
      /**
       * <code>required string table_name = 1;</code>
       */
      public boolean hasTableName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public java.lang.String getTableName() {
        java.lang.Object ref = tableName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          tableName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTableNameBytes() {
        java.lang.Object ref = tableName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tableName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder setTableName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tableName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder clearTableName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tableName_ = getDefaultInstance().getTableName();
        onChanged();
        return this;
      }
      /**
       * <code>required string table_name = 1;</code>
       */
      public Builder setTableNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tableName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TestTableDDLStateData)
    }

    static {
      defaultInstance = new TestTableDDLStateData(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TestTableDDLStateData)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TestTableDDLStateData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TestTableDDLStateData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TestProcedure.proto\"+\n\025TestTableDDLSta" +
      "teData\022\022\n\ntable_name\030\001 \002(\tBH\n.org.apache" +
      ".hadoop.hbase.ipc.protobuf.generatedB\023Te" +
      "stProcedureProtos\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TestTableDDLStateData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TestTableDDLStateData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TestTableDDLStateData_descriptor,
              new java.lang.String[] { "TableName", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
