# Leetcode。897 Increasing Order Search Tree
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        nums = []

        def nodesort(root):
            if not root:
                return []
            if root.left:
                nodesort(root.left)
            nums.append(root.val)
            if root.right:
                nodesort(root.right)

        nodesort(root)
        print(nums)
        head = TreeNode(0)
        cur = head
        for num in nums:
            cur.right = TreeNode(num)
            cur = cur.right
        return head.right