class LinkedList{
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public int getSize(){
        return size;
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("head ->");    
        while(temp != null){
            System.out.print(" "+ temp.data + " ->");
            temp=temp.next;
        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");
        list.display();
        System.out.println("The size is : "+list.getSize());
        list.deleteFirst();
        list.display();
        System.out.println("The size is : "+list.getSize());
        list.deleteLast();
        list.display();
        System.out.println("The size is : "+list.getSize());
    }
}