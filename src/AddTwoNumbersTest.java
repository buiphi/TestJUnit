
public class AddTwoNumbersTest {
	public static void main(String[] args) {
		ListNode list0 = new ListNode(2);
		
		ListNode list1 = new ListNode(4);
		list0.next = list1;
		
		ListNode list2 = new ListNode(3);
		list1.next = list2;
		
		
		
		ListNode list3 = new ListNode(5);
		
		ListNode list4 = new ListNode(6);
		list3.next = list4;
		
		ListNode list5 = new ListNode(4);
		list4.next = list5;
		
		

		
		
		ListNode list = AddTwoNumbers.addTwoNumbers(list0, list3);;
		while(list != null) {
			System.out.println("val " + list.val);
			list = list.next;
		}
	}
}
