  public class Solution {
    
    public void reorderList(ListNode head) {
      if (head == null || head.next == null)
          return;
      
        ListNode prev = null, slow = head, fast = head, l1 = head;
       
        //slow는 하나씩 옆으로, fast는 두개씩 옆으로 이동한다.
        //slow가 중앙으로 이동, fast가 끝으로 이동
        while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
      }
      
      prev.next = null;
      
      //중앙~끝 부분을 뒤집는다.
      ListNode l2 = reverse(slow);
      
      //두 부분을 합친다.
      merge(l1, l2);
    }
    
    //ListNode의 순서를 뒤집는 메서드
    ListNode reverse(ListNode head) {
      ListNode prev = null, curr = head, next = null;
      
      while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      
      return prev;
    }
    
    //ListNode를 합치는 메서드
    void merge(ListNode l1, ListNode l2) {
      while (l1 != null) {
        ListNode n1 = l1.next, n2 = l2.next;
        //l1의 다음에 l2를 넣어준다.
        l1.next = l2;
        
        //n1이 null이면 끝낸다.
        if (n1 == null)
          break;
        
        //l2의 다음에 n1을 넣어준다.
        l2.next = n1;
        l1 = n1;
        l2 = n2;
      }
    }

  }