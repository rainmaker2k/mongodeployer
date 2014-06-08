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
package org.dd4t.contentmodel;

/**
 * Interface for all items except for publications
 * 
 * @author bjornl
 * 
 */
public interface RepositoryLocalItem extends Item {
	/**
	 * Get the organizational item
	 * 
	 * @return
	 */
	public OrganizationalItem getOrganizationalItem();

	/**
	 * Set the organizational item
	 * 
	 * @param organizationalItem
	 */
	public void setOrganizationalItem(OrganizationalItem organizationalItem);

	/**
	 * Get the publication
	 * 
	 * @return
	 */
	public Publication getOwningPublication();

	/**
	 * Set the owning publication
	 * 
	 * @param publication
	 */
	public void setOwningPublication(Publication publication);
	/**
	 * Get the owning publication
	 * 
	 * @return
	 */
	public Publication getPublication();

	/**
	 * Set the publication
	 * 
	 * @param publication
	 */
	public void setPublication(Publication publication);
}
