package com.cs.abstractFactory.usingAbstractClass;

class PdfDocumentExporter extends DocumentExporter {
    @Override
    protected void convertToBytes(Document doc) {
        System.out.println("Converting Pdf document to .docx format...");
    }
}
