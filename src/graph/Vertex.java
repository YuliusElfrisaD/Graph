package graph;

public class Vertex {
    private char label;
    private boolean flagVisited;

    public Vertex(){
        
    }
    
    public Vertex(char label) {
        this.label = label;
    }

    public boolean isFlagVisited() {
        return flagVisited;
    }

    public void setFlagVisited(boolean flagVisited) {
        this.flagVisited = flagVisited;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
