// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameRPS.proto

package com.rockPaperScissors.grpc.gamerps;

public interface TurnDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.rockPaperScissors.grpc.gamerps.TurnDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>int32 botStep = 2;</code>
   */
  int getBotStep();

  /**
   * <code>string dateTimePlay = 3;</code>
   */
  java.lang.String getDateTimePlay();
  /**
   * <code>string dateTimePlay = 3;</code>
   */
  com.google.protobuf.ByteString
      getDateTimePlayBytes();

  /**
   * <code>int32 result = 4;</code>
   */
  int getResult();

  /**
   * <code>int32 userStep = 5;</code>
   */
  int getUserStep();
}
