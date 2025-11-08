class DocumentEditor {

    private Document document;
    private Persistance persistance;

    private String renderedDocument = "";

    public DocumentEditor(Document document, Persistance persistance) {
        this.document = document;
        this.persistance = persistance;
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine() {
        document.addElement(new NewLineElement());
    }

    public void addTabSpace() {
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument() {
        if (renderedDocument.isEmpty()) {
            renderedDocument = document.render();
        }
        return renderedDocument;
    }

    public void saveDocument() {
        persistance.save(renderDocument());
    }
}
