public class StackDSA {
    static class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;
        
        // Check list empty
        public static boolean isEmpty(){
            return head==null;
        }
        //Push data
        public static void pushData(String data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //Pop data
        public static String popData(){
            if(isEmpty()){
                return "-1";
            }
            String top = head.data;
            head=head.next;
            return top;
        }
        //Peek data
        public static String peekData(){
            if (isEmpty()) {
                return "-1";
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.pushData("12");
        list.pushData("13");
        list.pushData("14");
        list.pushData("15");

        while (!list.isEmpty()){
            System.out.println(list.peekData());
            list.popData();
        }
    }
}

