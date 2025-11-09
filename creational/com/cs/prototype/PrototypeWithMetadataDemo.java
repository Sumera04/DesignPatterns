package com.cs.prototype;

//===============================================================
// CLIENT CODE
//===============================================================
/* ===============================================================
 * DESIGN PRINCIPLES FOLLOWED
 * ===============================================================
 * 
 * SRP (Single Responsibility Principle)
 * - Each class has one role (Document, Metadata, Registry).
 * 
 * OCP (Open/Closed Principle)
 * - New prototype types (e.g., Report, Invoice, Letter) can be added
 *   without altering existing classes.
 *   
 *   LSP (Liskov Substitution Principle)
 *   - Deep or shallow clones behave as proper Document substitutes.
 *   
 *   DIP (Dependency Inversion Principle)
 *   - Client depends on `Prototype` interface, not `Document`.
 *   
 *   Encapsulation
 *   - Registry manages object creation; clients only request clones.
 *   
 *   DRY (Don’t Repeat Yourself)
 *   - Reuse of clone logic reduces duplication across object types.
*/
public class PrototypeWithMetadataDemo {
	public static void main(String[] args) {

		// Step 1️. Create original prototype
		Metadata meta = new Metadata("Admin", "2025-11-01");
		DocumentWithMetadata baseDoc = new DocumentWithMetadata(
				"Invoice Template",
				"Amount: $1000\nDue Date: [Date]",
				"FinanceDept",
				meta
				);

		// Step 2️. Register prototype
		DocumentRegistryWithMetadata.addPrototype("invoice", baseDoc);

		// Step 3️. Clone both ways
		DocumentWithMetadata shallow = DocumentRegistryWithMetadata.getShallowCopy("invoice");
		DocumentWithMetadata deep = DocumentRegistryWithMetadata.getDeepCopy("invoice");

		// Step 4️. Modify metadata in shallow clone
		shallow.getMetadata().setLastModified("2025-11-04 (Edited by Shallow)");

		System.out.println("\n--- Original DocumentWithMetadata ---");
		baseDoc.display();

		System.out.println("--- Shallow Cloned DocumentWithMetadata ---");
		shallow.display();

		System.out.println("--- Deep Cloned DocumentWithMetadata ---");
		deep.display();
	}
}

/* 
 * ===============================================================
 * OUTPUT EXPLANATION
 * ===============================================================
 * 
 * Loading resources and setting up document engine...
 * Performing SHALLOW copy...
 * Performing DEEP copy...
 * 
 * --- Original Document ---
 * Title: Invoice Template | Author: FinanceDept
 * Metadata → CreatedBy: Admin, LastModified: 2025-11-04 (Edited by Shallow)
 * Content: Amount: $1000
 * Due Date: [Date]
 * 
 * --- Shallow Cloned Document ---
 * Title: Invoice Template | Author: FinanceDept
 * Metadata → CreatedBy: Admin, LastModified: 2025-11-04 (Edited by Shallow)
 * Content: Amount: $1000
 * Due Date: [Date]
 * 
 * --- Deep Cloned Document ---
 * Title: Invoice Template | Author: FinanceDept
 * Metadata → CreatedBy: Admin, LastModified: 2025-11-01
 * Content: Amount: $1000
 * Due Date: [Date]
 * 
 * Notice: Only deep copy preserved original Metadata!
*/

/* ===============================================================
 * REVISION NOTES & Q&A
 ===============================================================
 
 Q1: What is the difference between shallow and deep copy?
 A1: 
  - *Shallow Copy*: Copies object structure but not inner objects (references shared).
  - *Deep Copy*: Duplicates everything recursively (independent objects).

 Q2: When should you use deep copy?
 A2: 
  - When cloned objects contain mutable sub-objects (like Metadata, Lists, Maps).

 Q3: What problems occur with shallow copy?
 A3: 
  - Changes in clone affect original (shared references).

 Q4: How to implement deep copy in Java?
 A4: 
  - By manually cloning nested objects or using serialization libraries.

 Q5: What are real-world scenarios for Prototype with deep copy?
 A5: 
  - Game dev (cloning enemies with nested AI states)
  - Document systems (copying templates with metadata)
  - Caching & object pools
  - GUI editors duplicating complex widgets

 Q6: Which principles does this pattern follow?
 A6: SRP, OCP, LSP, DIP, Encapsulation.

 Q7: What’s the main benefit?
 A7: 
  - Efficient object creation and reduced system load.
  - Useful when instantiation is costly or requires configuration.
*/


