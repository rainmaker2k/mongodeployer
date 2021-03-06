/**  
 *  Copyright 2011 Capgemini & SDL
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package me.kahwah.dd4t.contentmodel;

import java.util.Date;

public interface PageTemplate extends Item, HasMetadata {

	/**
	 * Set the file extension
	 * 
	 * @param fileExtension
	 */
	public void setFileExtension(String fileExtension);

	/**
	 * Get the file extension
	 * 
	 * @return the file extension
	 */
	public String getFileExtension();

	public Date getRevisionDate();

	public void setRevisionDate(Date date);	
}
