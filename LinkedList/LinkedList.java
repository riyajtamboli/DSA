package LinkedList;
public class LinkedList{

    public class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data = data;
        }
    }   

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int index){
        Node newnNode = new Node(data);
        if(head == null){
            head = tail = newnNode;
            return;
        }
        Node prev = head;
        size++;
        int i = 0;
        while(i < index - 1){
            prev = prev.next;
        }
        newnNode.next = prev.next;
        prev.next = newnNode;
    }

    public void removeFirst(){
        if(head== null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        Node prev = head;
         if(head == tail){
            head = tail = null;
            return;
        }
        while( prev.next != tail){
            prev = prev.next;
        }
        prev.next = null;
        size--;
    }

    public int itrSearch(int key){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(key == temp.data){
                return index++;
            }else{
                index++;
            }
            temp = temp.next;
        }


        return -1;
    }
    public void printData(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("null");
        }
    }

    public int recursiveSearch(int key, Node temp, int index){
        if(temp == null){
            return -1;
        }
        if(key == temp.data){
            return index;
        }

        return recursiveSearch(key, temp.next, index+1);
    }
    public void removeNthNode(int index){
        int i =0;
        Node temp = head;
        
        if(head == tail){
            head = tail = null;
        }
        
        while(i < index -1){
            temp = temp.next;
        }


        temp.next = temp.next.next;
        size--;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(50);
        ll.addFirst(5);
        ll.addFirst(25);  
        ll.addFirst(10);
        ll.addMiddle(100, 1);
        ll.removeNthNode(1);
        System.out.println("Size of LinkedList :"+size);
        ll.printData();
        // System.out.println("key is found at : "+ll.recursiveSearch(25, ll.head, 0));
        // System.out.println("Key is found at : "+ll.itrSearch(25));
    }

    public static int size = 0;
    public  Node head = null;
    public  Node tail = null;
}