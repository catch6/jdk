package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/TRANSPORT_RETRY.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64/jdk8u351/2908/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, September 15, 2022 3:51:10 AM BST
*/

public interface TRANSPORT_RETRY
{

  /**
     * Indicates a Transport Retry reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     */
  public static final short value = (short)(4);
}