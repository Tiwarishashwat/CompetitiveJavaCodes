// Class to implement a LinkedList
public class LinkedList
{
  // A subclass Node
  Node head;
  static class Node
  {
    int data;
    Node link;
    Node(int d)
    {
      data=d;
      link=null;
    }
  }
  public static LinkedList insert(LinkedList list,int data)
  {
    Node temp = new Node(data);
    temp.link=null;
    if(list.head==null)
    {
      list.head=temp;
    }
    else
    {
      Node last = list.head;
      while(last.link!=null)
      {
        last=last.link;
      }
      last.link=temp;
    }
    return list;
  }

  public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list=insert(list,1);
    list=insert(list,2);
    list=insert(list,3);
    list=insert(list,4);
    // printList(list);
  }
}
