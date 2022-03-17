# Leetcode. 270: Closest Binary Search Tree Value
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def closestValue(self, root: Optional[TreeNode], target: float) -> int:
        sub = float("inf")
        closest = float("inf")

        while root:
            if abs(root.val - target) < sub:
                sub = abs(root.val - target)
                closest = root

            if target == root.val:
                break
            elif target < root.val:
                root = root.left
            else:
                root = root.right

        return closest.val