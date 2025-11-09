package com.cs.abstractFactory.usingAbstractClass;

class ExcelDocumentExporter extends DocumentExporter {
    @Override
    protected void convertToBytes(Document doc) {
        System.out.println("Converting Excel document to .docx format...");
    }
}
