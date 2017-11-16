class Solution(object):
    def reverse(self, x):
        q = int(('%d' % (abs(x)))[::-1]) * (-1 if x < 0 else 1)
        return 0 if abs(q) > pow(2, 31) - 1 else q
        """
        :type x: int
        :rtype: int
        """
