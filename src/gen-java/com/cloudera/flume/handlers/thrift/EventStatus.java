/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.flume.handlers.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum EventStatus implements org.apache.thrift.TEnum {
  ACK(0),
  COMMITED(1),
  ERR(2);

  private final int value;

  private EventStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static EventStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return ACK;
      case 1:
        return COMMITED;
      case 2:
        return ERR;
      default:
        return null;
    }
  }
}
