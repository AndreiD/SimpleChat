package com.androidadvance.simplechat.models;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties public class Message {

  private String userID;
  private String username;
  private String message;
  private long timestamp;
  private boolean fromAdmin;
  private boolean isNotification;

  public Message() {

  }

  public Message(String userID, String username, String message, long timestamp, boolean fromAdmin, boolean isNotification) {
    this.userID = userID;
    this.username = username;
    this.message = message;
    this.timestamp = timestamp;
    this.fromAdmin = fromAdmin;
    this.isNotification = isNotification;
  }

  public boolean isNotification() {
    return isNotification;
  }

  public void setNotification(boolean notification) {
    isNotification = notification;
  }

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public boolean isFromAdmin() {
    return fromAdmin;
  }

  public void setFromAdmin(boolean fromAdmin) {
    this.fromAdmin = fromAdmin;
  }

  @Override public String toString() {
    return "Message{" +
        "userID='" + userID + '\'' +
        ", username='" + username + '\'' +
        ", message='" + message + '\'' +
        ", timestamp=" + timestamp +
        ", fromAdmin=" + fromAdmin +
        ", isNotification=" + isNotification +
        '}';
  }

  //might want to improve this
  @Override public boolean equals(Object other) {
    if (other == null) return false;
    if (other == this) return true;
    Message otherMessage = (Message) other;
    if ((this.message + this.username).equals((otherMessage.message + otherMessage.username))) {
      return true;
    } else {
      return false;
    }
  }

  @Override public int hashCode() {
    return username.hashCode() * message.hashCode();
  }
}
