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
	
	public void readFile() {
		
	}
	
	public void writeFile() {
		
	}
	
	public void loadfile() {
		
	}

}
