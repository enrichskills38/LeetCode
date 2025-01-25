class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0, head)  # Dummy node to handle edge cases
        fast = slow = dummy

        # Move fast pointer n + 1 steps ahead
        for _ in range(n + 1):
            fast = fast.next

        # Move both pointers until fast reaches the end
        while fast:
            fast = fast.next
            slow = slow.next

        # Remove the nth node
        slow.next = slow.next.next

        return dummy.next  # Return updated head

# Helper functions to work with lists
def listToLinkedList(elements):
    if not elements:
        return None
    head = ListNode(elements[0])
    current = head
    for item in elements[1:]:
        current.next = ListNode(item)
        current = current.next
    return head

def linkedListToList(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result

# Example usage
head = listToLinkedList([1, 2, 3, 4, 5])
n = 2
solution = Solution()
updated_head = solution.removeNthFromEnd(head, n)
print(linkedListToList(updated_head))  # Output: [1, 2, 3, 5]
