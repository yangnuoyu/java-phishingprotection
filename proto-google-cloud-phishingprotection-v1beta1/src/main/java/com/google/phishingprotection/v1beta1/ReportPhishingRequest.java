/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/phishingprotection/v1beta1/phishingprotection.proto

package com.google.phishingprotection.v1beta1;

/**
 *
 *
 * <pre>
 * The ReportPhishing request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.phishingprotection.v1beta1.ReportPhishingRequest}
 */
public final class ReportPhishingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.phishingprotection.v1beta1.ReportPhishingRequest)
    ReportPhishingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReportPhishingRequest.newBuilder() to construct.
  private ReportPhishingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReportPhishingRequest() {
    parent_ = "";
    uri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReportPhishingRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uri_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.phishingprotection.v1beta1.PhishingProtectionProto
        .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.phishingprotection.v1beta1.PhishingProtectionProto
        .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.phishingprotection.v1beta1.ReportPhishingRequest.class,
            com.google.phishingprotection.v1beta1.ReportPhishingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the project for which the report will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the project for which the report will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object uri_;
  /**
   *
   *
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
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
    if (!(obj instanceof com.google.phishingprotection.v1beta1.ReportPhishingRequest)) {
      return super.equals(obj);
    }
    com.google.phishingprotection.v1beta1.ReportPhishingRequest other =
        (com.google.phishingprotection.v1beta1.ReportPhishingRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getUri().equals(other.getUri())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.phishingprotection.v1beta1.ReportPhishingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The ReportPhishing request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.phishingprotection.v1beta1.ReportPhishingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.phishingprotection.v1beta1.ReportPhishingRequest)
      com.google.phishingprotection.v1beta1.ReportPhishingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.phishingprotection.v1beta1.ReportPhishingRequest.class,
              com.google.phishingprotection.v1beta1.ReportPhishingRequest.Builder.class);
    }

    // Construct using com.google.phishingprotection.v1beta1.ReportPhishingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      uri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingRequest getDefaultInstanceForType() {
      return com.google.phishingprotection.v1beta1.ReportPhishingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingRequest build() {
      com.google.phishingprotection.v1beta1.ReportPhishingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingRequest buildPartial() {
      com.google.phishingprotection.v1beta1.ReportPhishingRequest result =
          new com.google.phishingprotection.v1beta1.ReportPhishingRequest(this);
      result.parent_ = parent_;
      result.uri_ = uri_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.phishingprotection.v1beta1.ReportPhishingRequest) {
        return mergeFrom((com.google.phishingprotection.v1beta1.ReportPhishingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.phishingprotection.v1beta1.ReportPhishingRequest other) {
      if (other == com.google.phishingprotection.v1beta1.ReportPhishingRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
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
      com.google.phishingprotection.v1beta1.ReportPhishingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.phishingprotection.v1beta1.ReportPhishingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project for which the report will be created,
     * in the format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project for which the report will be created,
     * in the format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project for which the report will be created,
     * in the format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project for which the report will be created,
     * in the format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project for which the report will be created,
     * in the format "projects/{project_number}".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for phishing content to be analyzed.
     * </pre>
     *
     * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for phishing content to be analyzed.
     * </pre>
     *
     * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for phishing content to be analyzed.
     * </pre>
     *
     * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for phishing content to be analyzed.
     * </pre>
     *
     * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUri() {

      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for phishing content to be analyzed.
     * </pre>
     *
     * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uri_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.phishingprotection.v1beta1.ReportPhishingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.phishingprotection.v1beta1.ReportPhishingRequest)
  private static final com.google.phishingprotection.v1beta1.ReportPhishingRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.phishingprotection.v1beta1.ReportPhishingRequest();
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportPhishingRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReportPhishingRequest>() {
        @java.lang.Override
        public ReportPhishingRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReportPhishingRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReportPhishingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportPhishingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.phishingprotection.v1beta1.ReportPhishingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
