package com.cs.abstractFactory.usingAbstractClass;

class WordDocumentExporter extends DocumentExporter {
    @Override
    protected void convertToBytes(Document doc) {
        System.out.println("Converting Word document to .docx format...");
    }
}
