package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64/jdk8u351/2908/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, September 15, 2022 3:51:09 AM BST
*/


/** Server callback API, passed to Activator in active method.
    */
public interface ServerOperations 
{

  /** Shutdown this server.  Returns after orb.shutdown() completes.
  	*/
  void shutdown ();

  /** Install the server.  Returns after the install hook completes
  	* execution in the server.
  	*/
  void install ();

  /** Uninstall the server.  Returns after the uninstall hook
  	* completes execution.
  	*/
  void uninstall ();
} // interface ServerOperations
