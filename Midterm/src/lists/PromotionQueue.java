package lists;

public class PromotionQueue<T> {
    private class QueueNode {
        QueueNode prev;
        QueueNode next;
        T item;
        private final int nodeId;
        private QueueNode(T value, int id){
            this.item = value;
            this.prev = null;
            this.next = null;
            this.nodeId = id;
        }
    }

    private QueueNode sentFront;
    private QueueNode sentBack;
    private int listSize;

    public PromotionQueue(){
        sentFront = new QueueNode(null, -1);
        sentBack = new QueueNode(null, -1);
        sentFront.next = sentBack;
        sentBack.prev = sentFront;
        listSize = 0;
    }

    public void addFront(T value){
        QueueNode node = new QueueNode(value, listSize + 1);
        QueueNode currentHead = sentFront.next;

        node.next = currentHead;
        currentHead.prev = node;

        node.prev = sentFront;
        sentFront.next = node;
        listSize += 1;
    }

    public void addBack(T value){
        QueueNode node = new QueueNode(value, listSize + 1);
        QueueNode currentTail = sentBack.prev;

        node.next = sentBack;
        currentTail.next = node;

        node.prev = currentTail;
        sentBack.prev = node;
        listSize += 1;
    }

    /*
        Question 5
     */
    public void promote(int indexToPromote) {
        // TODO
    }

    /*
        Question 5 continued
     */
    public void demote(int indexToDemote) {
        // TODO
    }


    public int size() {
        return listSize;
    }

    /*
        Do not modify this method in any way
     */
    public String toString(){
        StringBuilder stringRepr = new StringBuilder();
        QueueNode runner = sentFront.next;
        while(runner != sentBack){
            String nodeRepr = "ID:" + runner.nodeId + "-" + runner.item;
            stringRepr.append(nodeRepr);
            if(runner.next != sentBack){
                stringRepr.append(", ");
            }
            runner = runner.next;
        }
        return stringRepr.toString();
    }
}
