// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameRPS.proto

package com.rockPaperScissors.grpc.gamerps;

public interface GameDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.rockPaperScissors.grpc.gamerps.GameDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string dateTimePlay = 2;</code>
   */
  java.lang.String getDateTimePlay();
  /**
   * <code>string dateTimePlay = 2;</code>
   */
  com.google.protobuf.ByteString
      getDateTimePlayBytes();

  /**
   * <code>int32 result = 3;</code>
   */
  int getResult();

  /**
   * <code>repeated .com.rockPaperScissors.grpc.gamerps.TurnDetail turnDetails = 4;</code>
   */
  java.util.List<com.rockPaperScissors.grpc.gamerps.TurnDetail> 
      getTurnDetailsList();
  /**
   * <code>repeated .com.rockPaperScissors.grpc.gamerps.TurnDetail turnDetails = 4;</code>
   */
  com.rockPaperScissors.grpc.gamerps.TurnDetail getTurnDetails(int index);
  /**
   * <code>repeated .com.rockPaperScissors.grpc.gamerps.TurnDetail turnDetails = 4;</code>
   */
  int getTurnDetailsCount();
  /**
   * <code>repeated .com.rockPaperScissors.grpc.gamerps.TurnDetail turnDetails = 4;</code>
   */
  java.util.List<? extends com.rockPaperScissors.grpc.gamerps.TurnDetailOrBuilder> 
      getTurnDetailsOrBuilderList();
  /**
   * <code>repeated .com.rockPaperScissors.grpc.gamerps.TurnDetail turnDetails = 4;</code>
   */
  com.rockPaperScissors.grpc.gamerps.TurnDetailOrBuilder getTurnDetailsOrBuilder(
      int index);
}
