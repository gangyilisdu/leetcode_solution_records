# Leetcode.653: Lowest Common Ancestor of a Binary Search Tree
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:

        S = {root.val}
        stack = [root.left, root.right]

        while stack:
            curr = stack.pop()
            if curr:
                if k - curr.val in S:
                    return True
                S.add(curr.val)
                stack.extend([curr.left, curr.right])

        return False