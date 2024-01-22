package teacher_code;

public class NodeExample {
    int data;
    NodeExample next;

    public NodeExample(int data) {
        this.data = data;
    }

    public NodeExample(int data, NodeExample next) {
        this.data = data;
        this.next = next;
    }

    public NodeExample() {
    }
}
