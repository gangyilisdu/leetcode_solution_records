# Leetcode.938: Range Sum of BST
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        def bst(node):
            if node:
                if low <= node.val <= high:
                    self.ans += node.val
                if node.val > low:
                    bst(node.left)
                if node.val < high:
                    bst(node.right)
        self.ans = 0
        bst(root)
        return self.ans