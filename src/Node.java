public class Node {
    int data;
    Node lc;
    Node rc;

    public Node(int a) {
        data = a;
        lc = null;
        rc = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", lc=" + lc +
                ", rc=" + rc +
                '}';
    }
}
