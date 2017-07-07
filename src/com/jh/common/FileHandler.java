/**
 * 
 */
package com.jh.common;

import java.io.*;

/**
 * @author jiah
 *
 */
public class FileHandler implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5008034905485871450L;
	
	private static FileHandler instance = null;
	
	/**
	 * 
	 */
	private FileHandler(){
		//Singleton constructor
	}
	
	/**
	 * @return	object instance
	 */
	public static FileHandler getInstance(){
		if(instance == null){
			instance = new FileHandler();
		}
		return instance;
	}
	
	public Object readFile() {
		return null;
	}
	
	public boolean writeFile() {
		return false;
	}
	
	public Object loadfile() {
		return null;
	}

}
