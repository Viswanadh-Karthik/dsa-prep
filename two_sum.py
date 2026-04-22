from typing import List
class Solution:
    def twoSum(nums: List[int], target: int) -> List[int]:
        d = {}
        for i,j in enumerate(nums):
            val = target - j
            if val in d:
                return [i, d[val]]
            d[j] = i
nums = [1,2,3,4,5,6,7]
t = 6
print(Solution.twoSum(nums, t))