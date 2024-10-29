public class stack_linkedlist {
    static class node {
        node link;
        private int item;
        public node(int item){
            this.item=item;
            link = null;
        }
    }
    static class stack {
        public static node head;
        public static boolean isEmpty(){
            return head == null;
        }
    public static void push(int item){
    node newNode = new node(item);
    if(isEmpty()){
        head = newNode;
        return;
       }
       newNode.link = head;
       head = newNode;
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        int top = head.item;
        head = head.link;
        return top;
   
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        
        return head.item;
    }
    public static int count(int item){
        int count = 0;
        node temp = head;
        while(temp!=null){
           // if(item==pop()){
          //      count--;
          //  }
            if(temp.item==item){
                count++;
            }
            temp = temp.link;
        }
        System.out.println("Element "+item+" is present "+count+" times in stack.");
        return count;

    }
    }
    public static void main(String[] args) {
       stack st = new stack();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(5); 
       st.push(5);
       st.count(5);
       st.pop();
       st.pop();
       while(!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();
    }
    
       
    }
}
