package com.cs.prototype;

//===============================================================
// NESTED CLASS — Document Metadata
//===============================================================
/**
 * Represents complex nested data (simulating sub-objects).
 *
 * SRP — manages only metadata logic.
 */
class Metadata {
	private String createdBy;
	private String lastModified;

	public Metadata(String createdBy, String lastModified) {
		this.createdBy = createdBy;
		this.lastModified = lastModified;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getLastModified() {
		return lastModified;
	}


	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}


	@Override
	public String toString() {
		return "CreatedBy: " + createdBy + ", LastModified: " + lastModified;
	}

	// Deep clone support for Metadata
	public Metadata deepCopy() {
		return new Metadata(createdBy, lastModified);
	}
}
